import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guitest {
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
    String n1 = fr.num1.getText();
    String n2 = fr.num2.getText();
    double v1 = Double.parseDouble(n1);
    double v2 = Double.parseDouble(n2);
    String wombo = (String) fr.combo.getSelectedItem();
    if (wombo == "Add") {
      double sum = v1 + v2;
      String add = "Result: " + sum;
      fr.someText.setText(add);
    }
    else if (wombo == "Subtract") {
      double dif = v1 - v2;
      String sub = "Result: " + dif;
      fr.someText.setText(sub);
    }
   else if (wombo == "Multiply") {
      double tot = v1 * v2;
      String multi = "Result: " + tot;
      fr.someText.setText(multi);
    }
    else {
        double quo = v1 / v2;
        String div = "Result: " + quo;
        fr.someText.setText(div);
      }
    }
  }

  class MyFrame extends JFrame {
    public JTextField num1;
    public JTextField num2;
    public JLabel someText;
    public JComboBox<String> combo;
    public MyFrame() {
    super();
    init();
    }
    private void init() {
    String[] choices = {"Add", "Subtract", "Multiply", "Divide"};

    combo = new JComboBox<String>(choices);
    JButton btn1 = new JButton("Calculate");
    btn1.addActionListener(new MyButtonListener(this));
    someText = new JLabel("Result: ");
    num1 = new JTextField();
    num2 = new JTextField();
    this.setTitle("Calculate");
    this.setLayout(new GridLayout(5,2));
    this.add(new JLabel("First Number:"));
    this.add(num1);
    this.add(new JLabel("Second Number:"));
    this.add(num2);
    this.add(new JLabel());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(combo);
    this.add(new JLabel());
    this.add(btn1);
    this.add(someText);
    this.pack();
    this.setVisible(true);
    }
    }