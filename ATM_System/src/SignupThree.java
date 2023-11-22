package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno){
        this.formno = formno;
        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD, 25));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel type = new JLabel("Account Type : ");
        type.setFont(new Font("Raleway",Font.BOLD, 22));
        type.setBounds(100,140,200,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 200, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(100, 225, 200, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(325, 180, 200, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(325, 225, 400, 20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card Number : ");
        card.setFont(new Font("Raleway",Font.BOLD, 18));
        card.setBounds(100,275,400,40);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD, 18));
        number.setBounds(300,275,400,40);
        add(number);

        JLabel cardDetails = new JLabel("Your Card No.");
        cardDetails.setFont(new Font("Raleway",Font.BOLD, 12));
        cardDetails.setBounds(100,290,400,40);
        add(cardDetails);

        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Raleway",Font.BOLD, 18));
        pin.setBounds(100,325,400,40);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD, 18));
        pnumber.setBounds(300,325,400,40);
        add(pnumber);

        JLabel pindetail = new JLabel("Your pin");
        pindetail.setFont(new Font("Raleway",Font.BOLD, 12));
        pindetail.setBounds(100,340,400,40);
        add(pindetail);

        JLabel services = new JLabel("Services Required :");
        services.setFont(new Font("Raleway",Font.BOLD, 22));
        services.setBounds(100,400,400,40);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(125, 450, 200, 30);
        add(c1);

        c2 = new JCheckBox("MOBILE BANKING");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(400, 450, 200, 30);
        add(c2);

        c3 = new JCheckBox("INTERNET BANKING");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(125, 500, 200, 30);
        add(c3);

        c4 = new JCheckBox("SMS/EMAIL ALERTS");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(400, 500, 200, 30);
        add(c4);

        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(125, 550, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(400, 550, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the information provided by me is correct.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 16));
        c7.setBounds(100, 625, 800, 30);
        add(c7);

        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 16));
        submit.setBounds(250, 675, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 16));
        cancel.setBounds(420, 675, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);
        setTitle("SIGN UP FORM");
        setLayout(null);
        setSize(850,800);
        setLocation(350,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            String accountType = null;
            if (r1.isSelected()){
                accountType = "Saving Account";
            }else if (r2.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if (r3.isSelected()){
                accountType = "Current Account";
            }else if (r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            Random random = new Random();
            String cardnumber = "" + Math.abs(random.nextLong() % 90000000L + 504093600000000L);
            String pinnumber = "" + Math.abs(random.nextLong() % 9000L + 1000L);
            
            StringBuilder facilityBuilder = new StringBuilder();
        if (c1.isSelected()) {
            facilityBuilder.append("ATM Card,");
        }
        if (c2.isSelected()) {
            facilityBuilder.append("Mobile Banking,");
        }
        if (c3.isSelected()) {
            facilityBuilder.append("Internet Banking,");
        }
        if (c4.isSelected()) {
            facilityBuilder.append("SMS/EMAIL Alerts,");
        }
        if (c5.isSelected()) {
            facilityBuilder.append("Cheque Book,");
        }
        if (c6.isSelected()) {
            facilityBuilder.append("E-Statement,");
        }

        String facility = facilityBuilder.toString().replaceAll(",$", "").trim();

        String validationArray[] = { accountType, cardnumber, pinnumber, facility };
        Conn conn = new Conn();
        try {
            
            boolean flag = true;
            for (String element : validationArray) {
                if (element == null || element.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "EMPTY Field!!!");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                String query1 = "insert into signupthree values('" + formno + "', '" + accountType + "', '" + cardnumber
                        + "', '" + pinnumber + "',  '" + facility + "')";
                conn.stmt.executeUpdate(query1);
                String query2 = "insert into login values('" + formno + "','" + cardnumber + "', '" + pinnumber + "')";
                conn.stmt.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "Card No. : " + cardnumber + "\n Pin : " + pinnumber);
                dispose();
                new Login().setVisible(true);
            }
                                
            } catch (Exception e) {
                System.out.println(e);
            }
        }else if (ae.getSource() == cancel) {
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel the form?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) 
        dispose();
    }
}
    public static void main(String args[]){
        new SignupThree("");
    }
}
