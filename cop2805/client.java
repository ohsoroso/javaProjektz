package cop2805;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class client {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
      constructGUI();
      }
      });
  }
  
  private static void constructGUI() {
    try {
      UIManager.setLookAndFeel(
        "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
      } catch (Exception e) { }
      MyFrame frame = new MyFrame();
      frame.setVisible(true); 
    }
  }
  
  class MyButtonListener implements ActionListener {
    MyFrame fr;
    public MyButtonListener(MyFrame frame) {
      fr = frame;
    }
    public void actionPerformed(ActionEvent e) {
      try {
        fr.listModel.clear();
        String n1 = fr.word.getText();
        Socket connection = new Socket("127.0.0.1", 1236);
        InputStream input = connection.getInputStream();
        OutputStream output = connection.getOutputStream();
        
        output.write(n1.length());
        output.write(n1.getBytes());
        int n = input.read();
        byte[] data = new byte[n];
        input.read(data);
        String serverResponse = new String(data, StandardCharsets.UTF_8);
        System.out.println(serverResponse);
        fr.listModel.addElement(serverResponse);

        if (!connection.isClosed()) {
          connection.close();
        }
        
      } catch (IOException er) {
        er.printStackTrace();
      }
    }
  }
  
  class MyFrame extends JFrame {
    DefaultListModel<String> listModel = new DefaultListModel<>();
    JList<String> list = new JList<String>(listModel);
    public JTextField word;
    public MyFrame() {
      super();
      init();
    }
    private void init() {
      JButton btn1 = new JButton("Transmit");
      btn1.addActionListener(new MyButtonListener(this));
      word = new JTextField();
      this.setLayout(new GridLayout(4, 4));
      this.add(new JLabel("Word to Search For:"));
      this.add(word);
      this.add(new JLabel("Response"));
      this.add(new JScrollPane(list), BorderLayout.EAST);
      this.add(btn1);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.pack();
      this.setVisible(true);
    }
  }