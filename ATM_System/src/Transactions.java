package src;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Transactions extends JFrame implements ActionListener {
    JButton deposit, cashWithdrawl, fastcash, ministatement, balanceEnquiry, exit, pinchange;
    String pinnumber;

    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please select your Transactions");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(160, 415, 160, 30);
        deposit.setFont(new Font("System", Font.BOLD, 16));
        deposit.setForeground(Color.BLACK);
        deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);

        cashWithdrawl = new JButton("Cash Withdrawl");
        cashWithdrawl.setBounds(350, 415, 160, 30);
        cashWithdrawl.setFont(new Font("System", Font.BOLD, 16));
        cashWithdrawl.setForeground(Color.BLACK);
        cashWithdrawl.setBackground(Color.WHITE);
        cashWithdrawl.addActionListener(this);
        image.add(cashWithdrawl);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(160, 450, 160, 30);
        fastcash.setFont(new Font("System", Font.BOLD, 16));
        fastcash.setForeground(Color.BLACK);
        fastcash.setBackground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(350, 450, 160, 30);
        ministatement.setFont(new Font("System", Font.BOLD, 16));
        ministatement.setForeground(Color.BLACK);
        ministatement.setBackground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement);

        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(160, 485, 160, 30);
        balanceEnquiry.setFont(new Font("System", Font.BOLD, 16));
        balanceEnquiry.setForeground(Color.BLACK);
        balanceEnquiry.setBackground(Color.WHITE);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(350, 485, 160, 30);
        pinchange.setFont(new Font("System", Font.BOLD, 16));
        pinchange.setForeground(Color.BLACK);
        pinchange.setBackground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange);

        exit = new JButton("Exit");
        exit.setBounds(350, 520, 160, 30);
        exit.setFont(new Font("System", Font.BOLD, 16));
        exit.setForeground(Color.BLACK);
        exit.setBackground(Color.WHITE);
        exit.addActionListener(this);
        image.add(exit);


        setSize(900, 900);
        setLocation(300, 0);
        setTitle("ATM");
        setLayout(null);
        setUndecorated(true);
        setVisible(true);getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit ){
            System.exit(0);
        }else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource() == cashWithdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash){ 
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()==ministatement){ 
            new MiniStatement(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){ 
            setVisible(false);
            new Pin(pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceEnquiry){ 
            this.setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
    }

    public static void main(String args[]){
        new Transactions("");
    }
}
