import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui extends JFrame{

    private JLabel resultLabel, labelNum1, labelNum2;
    private JButton addButton;
    private JButton subButton;
    private JButton timeButton;
    private JButton divButton;
    private JTextField num1Field;
    private JTextField num2Field;

    public JPanel panel1;
    public JPanel panel2;

    public Gui(){

        super("CALCULATOERUS");

        Container con = getContentPane();
        
       

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 10, 5, 10);
// number prompts and labels
        labelNum1 = new JLabel("Zadaj 1. cislo");
        gbc.gridx = 0;
        gbc.gridy = 0;
        con.add(labelNum1,gbc);

        num1Field = new JTextField(4);
        gbc.gridx = 1;
        gbc.gridy = 0;
        con.add(num1Field,gbc);

        labelNum2 = new JLabel("Zadaj 2. cislo");
        gbc.gridx = 0;
        gbc.gridy = 1;
        con.add(labelNum2,gbc);

        num2Field = new JTextField(4);
        gbc.gridx = 1;
        gbc.gridy = 1;
        con.add(num2Field,gbc);
// operation buttons "+" and "-"
        addButton = new JButton("+");
        gbc.gridx = 0;
        gbc.gridy = 2;
        con.add(addButton,gbc);

        subButton = new JButton("-");
        gbc.gridx = 1;
        gbc.gridy = 2;
        con.add(subButton,gbc);
// operation buttons "*" and "/"
        timeButton = new JButton("*");
        gbc.gridx = 0;
        gbc.gridy = 3;
        con.add(timeButton,gbc);

        divButton = new JButton("/");
        gbc.gridx = 1;
        gbc.gridy = 3;
        con.add(divButton,gbc);
// result label
        resultLabel = new JLabel("Result: ");
        gbc.gridx = 0;
        gbc.gridy = 4;
        con.add(resultLabel,gbc);



        
        // panel1 = new JPanel();
        // panel1.setBackground(Color.BLUE);
        // add(panel1);

        // panel2 = new JPanel();
        // panel2.setBackground(Color.GRAY);
        // add(panel2);
        
        // num1Field = new JTextField("", 5);
        // num2Field = new JTextField("", 5);
        // addButton = new JButton("+");
        // subButton = new JButton("-");
        // timeButton = new JButton("*");
        // divButton = new JButton("/");
        // resultLabel = new JLabel("Vysledok je: ");

        // panel1.add(num1Field);
        // panel1.add(num2Field);
        // panel1.add(addButton);
        // panel1.add(subButton);
        // panel1.add(timeButton);
        // panel1.add(divButton);
        // panel2.add(resultLabel);

        addButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent evt){
                    float num1 = Float.parseFloat(num1Field.getText());
                    float num2 = Float.parseFloat(num2Field.getText());


                    float result = num1 + num2;

                    resultLabel.setText("Vysledok je: " + result);
            };
        });
        subButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent evt){
                    float num1 = Float.parseFloat(num1Field.getText());
                    float num2 = Float.parseFloat(num2Field.getText());


                    float result = num1 - num2;

                    resultLabel.setText("Vysledok je: " + result);
            };
        });
        timeButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent evt){
                    float num1 = Float.parseFloat(num1Field.getText());
                    float num2 = Float.parseFloat(num2Field.getText());


                    float result = num1 * num2;

                    resultLabel.setText("Vysledok je: " + result);
            };
        });
        divButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent evt){
                    float num1 = Float.parseFloat(num1Field.getText());
                    float num2 = Float.parseFloat(num2Field.getText());

                    float result = num1 / num2;

                    resultLabel.setText("Vysledok je: " + result);
            };
        });

    }    

    
}