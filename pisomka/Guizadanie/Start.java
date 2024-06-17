import javax.swing.JFrame;

public class Start {
  public static void main(String[] args) {
    Juraj okno = new Juraj();

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
    okno.setSize(500, 400);
    okno.setLocationRelativeTo(null);
    okno.setResizable(true);

    // okno.pack();
  }
}
