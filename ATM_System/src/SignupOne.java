package src;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import com.toedter.calendar.JDateChooser;


public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameText, fnameText, emailText, addressText, cityText, stateText, pincodeText;
    JRadioButton male, female, married, unmarried, other;
    JButton next;
    JDateChooser dateChooser;

    SignupOne(){

       Random ran = new Random();
       random = Math.abs((ran.nextLong() % 9000L)+1000L);
       JLabel formno = new JLabel("APPLICATION FORM NO." +" "+ random);
       formno.setFont(new Font("Raleway", Font.BOLD, 38));
       formno.setBounds(140, 20, 600, 40);
       add(formno);

       JLabel personDetails = new JLabel("Page 1 : Personal Details");
       personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
       personDetails.setBounds(290, 80, 600, 30);
       add(personDetails);

       JLabel name = new JLabel("Name : ");
       name.setFont(new Font("Raleway", Font.BOLD, 20));
       name.setBounds(100, 150, 600, 30);
       add(name);
       nameText = new JTextField();
       nameText.setFont(new Font("Arial", Font.BOLD, 16));
       nameText.setBounds(325, 150, 400, 25);
       add(nameText);


       JLabel fname = new JLabel("Father's Name : ");
       fname.setFont(new Font("Raleway", Font.BOLD, 20));
       fname.setBounds(100, 200, 600, 30);
       add(fname);
       fnameText = new JTextField();
       fnameText.setFont(new Font("Arial", Font.BOLD, 16));
       fnameText.setBounds(325, 200, 400, 25);
       add(fnameText);

       JLabel dob = new JLabel("Date Of Birth : ");
       dob.setFont(new Font("Raleway", Font.BOLD, 20));
       dob.setBounds(100, 250, 600, 30);
       add(dob);
       dateChooser = new JDateChooser();
       dateChooser.setFont(new Font("Raleway", Font.BOLD, 20));
       dateChooser.setBounds(325, 250, 400, 25);
       add(dateChooser);


       JLabel gender = new JLabel("Gender : ");
       gender.setFont(new Font("Raleway", Font.BOLD, 20));
       gender.setBounds(100, 300, 600, 30);
       add(gender);
       male = new JRadioButton("Male");
       male.setFont(new Font("Raleway", Font.BOLD, 15));
       male.setBounds(325, 300, 150, 30);
       male.setBackground(Color.WHITE);
       add(male);
       female = new JRadioButton("Female");
       female.setFont(new Font("Raleway", Font.BOLD, 15));
       female.setBounds(475, 300, 150, 30);
       female.setBackground(Color.WHITE);
       add(female);
       ButtonGroup genderGroup = new ButtonGroup();
       genderGroup.add(male);
       genderGroup.add(female);

       JLabel email = new JLabel("Email Address : ");
       email.setFont(new Font("Raleway", Font.BOLD, 20));
       email.setBounds(100, 350, 600, 30);
       add(email);
       emailText = new JTextField();
       emailText.setFont(new Font("Arial", Font.BOLD, 16));
       emailText.setBounds(325, 350, 400, 25);
       add(emailText);

       JLabel martialStatus = new JLabel("Martial Status : ");
       martialStatus.setFont(new Font("Raleway", Font.BOLD, 20));
       martialStatus.setBounds(100, 400, 600, 30);
       add(martialStatus);
       married = new JRadioButton("Marital");
       married.setFont(new Font("Raleway", Font.BOLD, 15));
       married.setBounds(325, 400, 150, 30);
       married.setBackground(Color.WHITE);
       add(married);
       unmarried = new JRadioButton("Unmarried");
       unmarried.setFont(new Font("Raleway", Font.BOLD, 15));
       unmarried.setBounds(475, 400, 150, 30);
       unmarried.setBackground(Color.WHITE);
       add(unmarried);
       other = new JRadioButton("Other");
       other.setFont(new Font("Raleway", Font.BOLD, 15));
       other.setBounds(625, 400, 150, 30);
       other.setBackground(Color.WHITE);
       add(other);
       ButtonGroup maritalgroup = new ButtonGroup();
       maritalgroup.add(married);
       maritalgroup.add(unmarried);
       maritalgroup.add(other);

       JLabel address = new JLabel("Local Address : ");
       address.setFont(new Font("Raleway", Font.BOLD, 20));
       address.setBounds(100, 450, 600, 30);
       add(address);
       addressText = new JTextField();
       addressText.setFont(new Font("Arial", Font.BOLD, 16));
       addressText.setBounds(325, 450, 400, 25);
       add(addressText);

       JLabel City = new JLabel("City : ");
       City.setFont(new Font("Raleway", Font.BOLD, 20));
       City.setBounds(100, 500, 600, 30);
       add(City);
       cityText = new JTextField();
       cityText.setFont(new Font("Arial", Font.BOLD, 16));
       cityText.setBounds(325, 500, 400, 25);
       add(cityText);

       JLabel State = new JLabel("State : ");
       State.setFont(new Font("Raleway", Font.BOLD, 20));
       State.setBounds(100, 550, 600, 30);
       add(State);
       stateText = new JTextField();
       stateText.setFont(new Font("Arial", Font.BOLD, 16));
       stateText.setBounds(325, 550, 400, 25);
       add(stateText);

       JLabel pincode = new JLabel("Pincode : ");
       pincode.setFont(new Font("Raleway", Font.BOLD, 20));
       pincode.setBounds(100, 600, 600, 30);
       add(pincode);
       pincodeText = new JTextField();
       pincodeText.setFont(new Font("Arial", Font.BOLD, 16));
       pincodeText.setBounds(325, 600, 400, 25);
       add(pincodeText);

       next = new JButton("Next");
       next.setBounds(625, 675, 100, 25);
       next.setFont(new Font("Raleway", Font.BOLD, 16));
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.addActionListener(this);
       add(next);

        getContentPane().setBackground(Color.WHITE);
        setTitle("SIGN UP FORM");
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameText.getText();
        String fname = fnameText.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String email = emailText.getText();
        String address = addressText.getText();
        String city = cityText.getText();
        String state = stateText.getText();
        String pincode = pincodeText.getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }else if(other.isSelected()){
            gender = "Other";
        }
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital = "Other";
        }

        String validationArray[] = {name, fname, dob, email, address, city, state, pincode, gender, marital};
        try {
            boolean flag = false;
            for (String element : validationArray) {
                if (element == null || element.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "EMPTY Field!!!");
                    flag = false;
                    break;
                }else{
                    flag = true;
                }  
            }
            if (flag == true){
                Conn conn = new Conn();
                String query = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + pincode + "', '" + state + "')";
                conn.stmt.executeUpdate(query);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
    public static void main(String args[]){
        new SignupOne();
    }
    
}
