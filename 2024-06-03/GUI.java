import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame {
  private JButton c, v, b, n, m, alt, medzernik, enter;

  public GUI() {
    this.setTitle("Moje prve okno");
    this.setSize(1000, 1000);
    this.setComponents();
  }

  public void setComponents() {
    Container layout = getContentPane();
    layout.setLayout(new GridBagLayout());
    
    GridBagConstraints g = new GridBagConstraints();

    c = new JButton("c");
    g.fill = GridBagConstraints.HORIZONTAL;
    g.gridx = 0;
    g.gridy = 0;
    layout.add(c, g);
    v = new JButton("v");
    g.fill = GridBagConstraints.HORIZONTAL;
    g.gridx++;
    layout.add(v, g);
    b = new JButton("b");
    g.fill = GridBagConstraints.HORIZONTAL;
    g.gridx++;
    layout.add(b, g);
    n = new JButton("n");
    g.fill = GridBagConstraints.HORIZONTAL;
    g.gridx++;
    layout.add(n, g);
    m = new JButton("m");
    g.fill = GridBagConstraints.HORIZONTAL;
    g.gridx++;
    layout.add(m, g);
    enter = new JButton("Enter");
    g.fill = GridBagConstraints.VERTICAL;
    g.gridx++;
    g.gridwidth = 2;
    g.gridheight = 2;
    g.ipadx = 30;
    g.insets = new Insets(0, 20, 0, 0);
    layout.add(enter, g);
    alt = new JButton("alt");
    g.fill = GridBagConstraints.HORIZONTAL;
    g.gridwidth = 1;
    g.gridheight = 1;
    g.gridx = 0;
    g.gridy++;
    g.ipadx = 0;
    g.insets = new Insets(10, 0, 0, 0);
    layout.add(alt, g);
    medzernik = new JButton("medzernik");
    g.fill = GridBagConstraints.HORIZONTAL;
    g.gridx++;
    g.gridwidth = 4;
    g.ipadx = 0;
    layout.add(medzernik, g);
  }

  public static Frame nastav() {
    GUI i = new GUI();
    i.setVisible(true);
    i.setLocationRelativeTo(null);
    i.setResizable(true);
    i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    i.pack();
    return i;
  }

    public static void main(String[] args) {
      GUI.nastav();
    }
}
