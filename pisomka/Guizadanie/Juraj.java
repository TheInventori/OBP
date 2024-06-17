import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Juraj extends JFrame {
  private JLabel fnameL, lnameL, heightL, weightL, rcisloL, detiL;
  private JTextField fnameT, lnameT, heightT, weightT, rcisloT, detiT;
  private JButton btn;
  private JLabel bmiV, bmiVisV, pohlavieV, datumNarodeniaV, vekV, dochodkovyVekV;

  public Juraj() {
    super("My GUI");

    Container pane = this.getContentPane();
    pane.setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    fnameL = new JLabel("Meno:");
    lnameL = new JLabel("Priezvisko:");
    heightL = new JLabel("Vyska (cm):");
    weightL = new JLabel("Vaha (kg):");
    rcisloL = new JLabel("Rodne cislo:");
    detiL = new JLabel("Pocet deti: ");
    fnameT = new JTextField(10);
    lnameT = new JTextField(10);
    heightT = new JTextField(3);
    weightT = new JTextField(3);
    rcisloT = new JTextField(11);
    detiT = new JTextField(2);
    btn = new JButton("Vypociaj");
    bmiV = new JLabel();
    bmiVisV = new JLabel();
    pohlavieV = new JLabel();
    datumNarodeniaV = new JLabel();
    vekV = new JLabel();
    dochodkovyVekV = new JLabel();

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.LINE_START;
    pane.add(fnameL, gbc);
    gbc.gridx = 1;
    gbc.gridy = 0;
    pane.add(fnameT, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.LINE_START;
    pane.add(lnameL, gbc);
    gbc.gridx = 3;
    gbc.gridy = 0;
    pane.add(lnameT, gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.LINE_START;
    pane.add(heightL, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.LINE_START;
    pane.add(heightT, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    pane.add(weightL, gbc);
    gbc.gridx = 3;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.LINE_START;
    pane.add(weightT, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.LINE_START;
    pane.add(rcisloL, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    pane.add(rcisloT, gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.LINE_START;
    pane.add(detiL, gbc);
    gbc.gridx = 3;
    gbc.gridy = 2;
    pane.add(detiT, gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.gridwidth = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    pane.add(btn, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    pane.add(dochodkovyVekV, gbc);
    gbc.gridx = 2;
    gbc.gridy = 4;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    pane.add(vekV, gbc);
    gbc.gridx = 0;
    gbc.gridy = 5;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    pane.add(bmiV, gbc);
    gbc.gridx = 2;
    gbc.gridy = 5;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    pane.add(bmiVisV, gbc);
    gbc.gridx = 0;
    gbc.gridy = 6;
    gbc.gridwidth = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    pane.add(datumNarodeniaV, gbc);
    gbc.gridx = 2;
    gbc.gridy = 6;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    pane.add(pohlavieV, gbc);

    btn.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              int height = Integer.parseInt(heightT.getText());
              int weight = Integer.parseInt(weightT.getText());
              int deti = Integer.parseInt(detiT.getText());
              String rcislo = rcisloT.getText();

              Vypocitaj calc = new Vypocitaj(height, weight, rcislo, deti);

              bmiV.setText("BMI: " + calc.BMI());
              bmiVisV.setText(calc.BMIvis());
              pane.setBackground(calc.BMI() < 18.5 ? Color.RED : calc.BMI() < 25 ? Color.GREEN : calc.BMI() < 30 ? Color.YELLOW : Color.RED);
              pohlavieV.setText("Pohlavie: " + calc.pohlavie());
              datumNarodeniaV.setText("Datum narodenia: " + calc.datumNarodenia());
              vekV.setText("Vek: " + calc.vek());
              dochodkovyVekV.setText("Odchod do dochodku: " + calc.dochdkovyVek());
            }
        }
    );
  }
}
