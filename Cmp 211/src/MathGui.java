import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathGui extends JFrame {
    public JTextField getLength() {
        return length;
    }

    public JTextField length ;
    public JLabel resultLabel;
    public JButton calculateButton;


    public MathGui(){

        super("Calculate areaOfSquare");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));


        JTextField lengthField = new JTextField();
        JLabel lengthLabel = new JLabel("Length:");
        resultLabel = new JLabel();


        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

            public void actionPerformed(ActiveEvent e) {
                double length = Double.parseDouble(lengthField.getText());
                double result = Math.areaOfSquare(length);
                resultLabel.setText("Area = " + result);


            }

        });

        add(lengthLabel);
        add(lengthField);
        add(calculateButton);
        add(resultLabel);

        setVisible(true);

    }
}
