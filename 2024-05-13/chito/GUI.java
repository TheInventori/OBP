import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
  private JLabel vysledokLab;
  private JButton plusBut;
  private JButton minusBut;
  private JButton multipleBut;
  private JButton divadeBut;
  private JTextField cislo1Field;
  private JTextField cislo2Field;
  private JLabel cislo1Label;
  private JLabel cislo2Label;

  public GUI() {
    super("Moje prve okno");

    Container pozadie = getContentPane();
    pozadie.setBackground(Color.yellow);

    GridBagLayout layout = new GridBagLayout();
    setLayout(layout);

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);

    vysledokLab = new JLabel("Vysledok je: ");
    plusBut = new JButton("+");
    minusBut = new JButton("-");
    multipleBut = new JButton("*");
    divadeBut = new JButton("/");
    cislo1Field = new JTextField(5);
    cislo2Field = new JTextField(5);
    cislo1Label = new JLabel("1. cislo");
    cislo2Label = new JLabel("2. cislo");

    gbc.gridx = 0;
    gbc.gridy = 0;
    pozadie.add(cislo1Label, gbc);
    gbc.gridy++;
    pozadie.add(cislo2Label, gbc);
    gbc.gridy++;
    pozadie.add(plusBut, gbc);
    gbc.gridy++;
    pozadie.add(multipleBut, gbc);
    gbc.gridy++;
    pozadie.add(vysledokLab, gbc);

    gbc.gridx = 1;
    gbc.gridy = 0;
    pozadie.add(cislo1Field, gbc);
    gbc.gridy++;
    pozadie.add(cislo2Field, gbc);
    gbc.gridy++;
    pozadie.add(minusBut, gbc);
    gbc.gridy++;
    pozadie.add(divadeBut, gbc);

    plusBut.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                double prveCislo = Double.parseDouble(cislo1Field.getText());
                double druheCislo = Double.parseDouble(cislo2Field.getText());
                double vysledok = prveCislo + druheCislo;
                vysledokLab.setText("Vysledok je: " + vysledok);
            }
        }
    );

    minusBut.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              double prveCislo = Double.parseDouble(cislo1Field.getText());
              double druheCislo = Double.parseDouble(cislo2Field.getText());
              double vysledok = prveCislo - druheCislo;
                vysledokLab.setText("Vysledok je: " + vysledok);
            }
        }
    );

    multipleBut.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              double prveCislo = Double.parseDouble(cislo1Field.getText());
              double druheCislo = Double.parseDouble(cislo2Field.getText());
              double vysledok = prveCislo * druheCislo;
                vysledokLab.setText("Vysledok je: " + vysledok);
            }
        }
    );

    divadeBut.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              double prveCislo = Double.parseDouble(cislo1Field.getText());
              double druheCislo = Double.parseDouble(cislo2Field.getText());
              double vysledok = prveCislo / druheCislo;
                vysledokLab.setText("Vysledok je: " + vysledok);
            }
        }
    );
  }

}