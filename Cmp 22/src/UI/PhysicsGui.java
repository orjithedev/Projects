package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsGui extends JFrame {
    public JTextField getmass() {
        return mass;
    }

    public JTextField getheight() {
        return height;
    }



    public JTextField mass;
    public JTextField height;



    public JLabel resultLabel;
    public JButton calculateButton;

    public PhysicsGui() {
        super("Calculate PotentialEnergy");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));


        JTextField massField = new JTextField();
        JTextField heightField = new JTextField();
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);


        JLabel massLabel = new JLabel("Mass:");
        JLabel heightLabel = new JLabel("Height:");
        resultLabel = new JLabel("Potential Energy ():");


        resultLabel = new JLabel();
        calculateButton = new JButton("Calculate");

        calculateButton.addActionListener(new ActionListener()

        {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

            public void actionPerformed(ActiveEvent e) {
                double mass = Double.parseDouble(massField.getText());
                double height = Double.parseDouble(heightField.getText());
                double PotentialEnergy = mass * height * 9.8;
                resultField.setText(String.format("%.2f", PotentialEnergy));
            }

        });

        add(massLabel);
        add(heightLabel);


        add(massField);
        add(heightField);


        add(calculateButton);
        add(resultLabel);

        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                // Create and show the GUI
                PhysicsGui gui = new PhysicsGui();
                gui.setVisible(true);
            }
        });




    }
}

