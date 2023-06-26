package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MultiplicationTimeTableGUI extends JFrame {
    private JTextField numberField;
    private JTextArea tableArea;
    private JTextArea contentArea;

    public MultiplicationTimeTableGUI() {
        setTitle("Multiplication Time Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel numberLabel = new JLabel("Enter a number:");
        numberField = new JTextField(10);
        JButton generateButton = new JButton("Generate Table");
        generateButton.addActionListener(new GenerateButtonListener());

        inputPanel.add(numberLabel);
        inputPanel.add(numberField);
        inputPanel.add(generateButton);

        tableArea = new JTextArea(20, 30);
        tableArea.setEditable(false);
        JScrollPane tableScrollPane = new JScrollPane(tableArea);

        contentArea = new JTextArea(10, 30);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(tableScrollPane, BorderLayout.CENTER);
        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class GenerateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int number = Integer.parseInt(numberField.getText());
            tableArea.setText("");
            StringBuilder tableContent = new StringBuilder();
            for (int i = 1; i <= 12; i++) {
                int result = number * i;
                String row = number + " x " + i + " = " + result + "\n";
                tableContent.append(row);
                tableArea.append(row);

            }
            contentArea.setText(tableContent.toString());

            // Append the table content to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("multiplication_table.txt", true))) {
                writer.write(tableContent.toString());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
