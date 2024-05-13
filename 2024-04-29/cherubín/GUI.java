import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
  private JLabel vysledokLab;
  private JButton scitajBut;
  private JTextField cislo1Field;
  private JTextField cislo2Field;
  private JPanel panel1;
  private JPanel panel2;

  public GUI() {
    super("Moje prve okno");

    vysledokLab = new JLabel("Vysledok je: ");

    scitajBut = new JButton("Scitaj");

    cislo1Field = new JTextField("1. cislo", 5);

    cislo2Field = new JTextField("2. cislo", 5);

    panel1 = new JPanel();
    panel1.setBackground(Color.red);
    add(panel1);
    
    panel2 = new JPanel();
    panel2.setBackground(new Color(50, 223, 66));
    add(panel2);

    FlowLayout layout = new FlowLayout();
    setLayout(layout);

    
    panel1.add(cislo1Field);
    panel1.add(cislo2Field);
    panel1.add(scitajBut);
    panel2.add(vysledokLab);

    scitajBut.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int prveCislo = Integer.parseInt(cislo1Field.getText());
                int druheCislo = Integer.parseInt(cislo2Field.getText());
                int vysledok = prveCislo + druheCislo;
                vysledokLab.setText("Vysledok je: " + vysledok);
            }
        }
    );
  }

}