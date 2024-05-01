import javax.swing.JFrame;

public class TutorialGUI {
  public static void main(String[] args) {
    GUI okno = new GUI();
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
    okno.setSize(300, 200);
    okno.setLocationRelativeTo(null);
  }
}