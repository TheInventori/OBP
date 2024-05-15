import javax.swing.JFrame;

public class CalcGui {
    public static void main(String[] args) {
        Gui okno = new Gui();
        okno.pack();

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setSize(300, 200);
        okno.setLocationRelativeTo(null);
    }
}
