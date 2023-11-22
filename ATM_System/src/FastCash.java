package src;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener {
    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JTextField t1;
    String pinnumber;

    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please select your FastCash amount");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        b1 = new JButton("Rs 500");
        b1.setBounds(160, 415, 160, 30);
        b1.setFont(new Font("System", Font.BOLD, 16));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Rs 1000");
        b2.setBounds(350, 415, 160, 30);
        b2.setFont(new Font("System", Font.BOLD, 16));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Rs 2000");
        b3.setBounds(160, 450, 160, 30);
        b3.setFont(new Font("System", Font.BOLD, 16));
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.WHITE);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("Rs 5000");
        b4.setBounds(350, 450, 160, 30);
        b4.setFont(new Font("System", Font.BOLD, 16));
        b4.setForeground(Color.BLACK);
        b4.setBackground(Color.WHITE);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs 10000");
        b5.setBounds(160, 485, 160, 30);
        b5.setFont(new Font("System", Font.BOLD, 16));
        b5.setForeground(Color.BLACK);
        b5.setBackground(Color.WHITE);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("Rs 20000");
        b6.setBounds(350, 485, 160, 30);
        b6.setFont(new Font("System", Font.BOLD, 16));
        b6.setForeground(Color.BLACK);
        b6.setBackground(Color.WHITE);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("Back");
        b7.setBounds(350, 520, 160, 30);
        b7.setFont(new Font("System", Font.BOLD, 16));
        b7.setForeground(Color.BLACK);
        b7.setBackground(Color.WHITE);
        b7.addActionListener(this);
        image.add(b7);


        setSize(900, 900);
        setLocation(300, 0);
        setTitle("ATM");
        setLayout(null);
        setUndecorated(true);
        setVisible(true);getContentPane().setBackground(Color.WHITE);
    }

     public void actionPerformed(ActionEvent ae) {
        try {
            String amount = ((JButton)ae.getSource()).getText().substring(3); //k
            Conn c = new Conn();
            ResultSet rs = c.stmt.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            } 
            if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }

            if (ae.getSource() == b7) {
                this.setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }else{
                Date date = new Date();
                c.stmt.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully!");
                    
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}