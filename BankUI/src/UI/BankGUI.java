package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankGUI extends JFrame {

    JFrame bankFrame = new JFrame("Hello");
    JLabel bankLabel = new JLabel("Welcome to Curry Bank");
    JTextArea bankArea = new JTextArea("Dear Customer which account do you want to use");
    JButton bankButton = new JButton("Current Account");
    
    JButton bankButton2 = new JButton("Savings Account");

    JFrame CurrentAccount = new JFrame("Welcome to your Current Please Make your Transaction");

    JButton Currentaccount = new JButton("Withdrawl");
    JButton getCurrentaccount = new JButton("Deposit");

    JTextField CurrentAmount = new JTextField("Amount");
    JTextField CurrentPin = new JTextField("Insert Pin");
    JFrame SavingsAccount = new JFrame("Welcome to your Savings Please Make your Transaction");
    JButton Savingsaccount = new JButton("Withdrawl");
    JButton getSavingsaccount = new JButton("Deposit");
    JTextField SavingsAmount = new JTextField("Amount");
    JTextField SavingsPin = new JTextField("Insert PIn");



    public void mainUI(){
        bankFrame.add(bankArea);
        bankFrame.add(bankLabel);
        bankFrame.add(bankButton);
        bankFrame.add(bankButton2);

        CurrentAccount.add(Currentaccount);
        CurrentAccount.add(getCurrentaccount);
        CurrentAccount.add(CurrentAmount);
        CurrentAccount.add(CurrentPin);

        bankFrame.setSize(200,300);
        bankFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        bankFrame.setVisible(true);
        
        bankButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });




    }
}