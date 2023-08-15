package readwrite;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class rw {
  public static List<Double> dubList = new ArrayList<Double>();
  public static List<Double> readFile(String file) throws IOException{
    List<String> reader = null;
    reader = Files.readAllLines(Paths.get(file));
    for (String str : reader) {
      double dubs = Double.parseDouble(str);
      dubList.add(dubs);
    }
    System.out.println(dubList);
    return dubList;
  }

  public static void WriteFile(List<Double> data) throws IOException{
    Path path = Paths.get("./cop2805/data-sorted.txt");
    try (BufferedWriter bufferedWriter = 
      Files.newBufferedWriter(path, Charset.defaultCharset(), 
        StandardOpenOption.CREATE);
      PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
        printWriter.println(dubList);
      }
  }

  public static void main(String[] args) throws IOException {
    readFile("./cop2805/data.txt");
    Collections.sort(dubList);
    WriteFile(dubList);
  }
}