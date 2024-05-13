import javax.swing.JFrame;
import java.awt.FlowLayout;

public class TutorialGUI {
  public static void main(String[] args) {
    GUI okno = new GUI();
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
    okno.setSize(300, 200);
    okno.setLocationRelativeTo(null);

    okno.pack();
  }
}