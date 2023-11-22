package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public  class Login extends  JFrame implements ActionListener{
    JTextField cardTextField;
    JButton login, clear, signup;
    JPasswordField passwordField;

    Login(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(150, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(275, 40, 400, 40);
        add(text);

        JLabel cardNo = new JLabel("Card No :");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
        cardNo.setBounds(150, 150, 400, 40);
        add(cardNo);


        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(150, 220, 400, 40);
        add(pin);
        
        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Arial", Font.BOLD, 16));
        cardTextField.setBounds(325, 150, 300, 30);
        add(cardTextField);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.BOLD, 16));
        passwordField.setBounds(325, 220, 300, 30);
        add(passwordField);


        login = new JButton("SIGN IN");
        login.setBounds(225, 300, 150, 35);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login); 

        clear = new JButton("CLEAR");
        clear.setBounds(425, 300, 150, 35);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear); 

        signup = new JButton("SIGN UP");
        signup.setBounds(225, 350, 350, 35);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup); 

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("AUTOMATED TELLER MACHINE");
        setLocation(400,175);
        setSize(800,500);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            cardTextField.setText("");
            passwordField.setText("");

        }else if(ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }else if(ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = passwordField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '" +pinnumber+ "'";
            try{
                ResultSet result = conn.stmt.executeQuery(query);
                if(result.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Credentials!!!");
                }
            }catch(Exception e){
                System.out.println(e);
            }

        }

    }

 public static void main(String args[]){
    new Login();
 }
}

