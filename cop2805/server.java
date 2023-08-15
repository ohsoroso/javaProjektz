package cop2805;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class server {
  public static class WordSearch {
    public static List<String> lines = new ArrayList<String>();
    WordSearch(String fileName) {
      Path filePath = Paths.get(fileName);
      Charset charset = StandardCharsets.UTF_8;
      try {
        lines = Files.readAllLines(filePath, charset);
        lines.replaceAll(String::toUpperCase);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    public static List<Integer> FindWord(String searchString) {
      int i;
      List<Integer> returnList = new ArrayList<Integer>();
      searchString = searchString.toUpperCase();
      for(i = 0; i < lines.size(); i++) {
         String str = lines.get(i);
         if(str.indexOf(searchString) >= 0) {
          returnList.add(i);
         }
        }
        return returnList;
    }
  }

  public static void main(String[] args) {
    ServerSocket server = null;
    boolean shutdown = false;

    WordSearch search = new WordSearch("cop2805\\hamlet.txt");
    
    try {
      server = new ServerSocket(1236);
      System.out.println("Port Bound.");
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(-1);
    }
    
    while (!shutdown) {
      Socket client = null;
      InputStream input = null;
      OutputStream output = null;
      
      try {
        client = server.accept();
        input = client.getInputStream();
        output = client.getOutputStream();
        
        int n = input.read();
        byte[] data = new byte[n];
        input.read(data);
        
        String clientInput = new String(data, StandardCharsets.UTF_8);
        List<Integer> index = new ArrayList<Integer>();
        index = WordSearch.FindWord(clientInput);
        clientInput.replace("\n", "");
        System.out.println("Client said: " + clientInput);

        String response = "Your input was [" + index + "]";
        output.write(response.length());
        output.write(response.getBytes());

        client.close();
        if (clientInput.equalsIgnoreCase("shutdown")) {
          System.out.println("Shutting down...");
          shutdown = true;
        }

      } catch (IOException e) {
        e.printStackTrace();
        continue;
      }
    }
  }
}
