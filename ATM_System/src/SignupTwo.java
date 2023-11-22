package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {
    long random;
    JTextField aadharText, pancardText;
    JRadioButton syes, sno, eyes, eno;
    JButton next;
    JComboBox religionCombo, categoryCombo, incomeCombo, educationCombo, occupationCombo;
    String formno;

    SignupTwo(String formno){
        this.formno = formno;

       JLabel addtionalDetails = new JLabel("Page 2 : Additional Details");
       addtionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
       addtionalDetails.setBounds(290, 80, 600, 30);
       add(addtionalDetails);

       JLabel religion = new JLabel("Religion : ");
       religion.setFont(new Font("Raleway", Font.BOLD, 20));
       religion.setBounds(100, 150, 600, 30);
       add(religion);
       String valReligion[] = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
       religionCombo = new JComboBox(valReligion);
       religionCombo.setBackground(Color.WHITE);
       religionCombo.setBounds(325, 150, 400, 25);
       add(religionCombo);

       
       JLabel category = new JLabel("Category : ");
       category.setFont(new Font("Raleway", Font.BOLD, 20));
       category.setBounds(100, 200, 600, 30);
       add(category);
       String valCategory[] = {"General", "SC/ST", "OBC", "EWS"};
       categoryCombo = new JComboBox(valCategory);
       categoryCombo.setBackground(Color.WHITE);
       categoryCombo.setBounds(325, 200, 400, 25);
       add(categoryCombo);
       

       JLabel income = new JLabel("Income : ");
       income.setFont(new Font("Raleway", Font.BOLD, 20));
       income.setBounds(100, 250, 600, 30);
       add(income);
       String incomeCategory[] = {"Null", "< 150,000", "<250,000", "<500,000", "Upto 1,000,000"};
       incomeCombo = new JComboBox(incomeCategory);
       incomeCombo.setBackground(Color.WHITE);
       incomeCombo.setBounds(325, 250, 400, 25);
       add(incomeCombo);
       

       JLabel education = new JLabel("Educational  ");
       education.setFont(new Font("Raleway", Font.BOLD, 20));
       education.setBounds(100, 300, 600, 30);
       add(education);
       JLabel qualificaton = new JLabel("Qualification : ");
       qualificaton.setFont(new Font("Raleway", Font.BOLD, 20));
       qualificaton.setBounds(100, 320, 600, 30);
       add(qualificaton);
       String eduValue[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
       educationCombo = new JComboBox(eduValue);
       educationCombo.setBackground(Color.WHITE);
       educationCombo.setBounds(325, 310, 400, 25);
       add(educationCombo);

       JLabel occupation = new JLabel("Occupation : ");
       occupation.setFont(new Font("Raleway", Font.BOLD, 20));
       occupation.setBounds(100, 360, 600, 30);
       add(occupation);
       String occupationValue[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
       occupationCombo = new JComboBox(occupationValue);
       occupationCombo.setBackground(Color.WHITE);
       occupationCombo.setBounds(325, 360, 400, 25);
       add(occupationCombo);
       

       JLabel aadhar = new JLabel("Aadhar No. : ");
       aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
       aadhar.setBounds(100, 450, 600, 30);
       add(aadhar);
       aadharText = new JTextField();
       aadharText.setFont(new Font("Arial", Font.BOLD, 16));
       aadharText.setBounds(325, 450, 400, 25);
       add(aadharText);

       JLabel pancard = new JLabel("PAN : ");
       pancard.setFont(new Font("Raleway", Font.BOLD, 20));
       pancard.setBounds(100, 600, 600, 30);
       add(pancard);
       pancardText = new JTextField();
       pancardText.setFont(new Font("Arial", Font.BOLD, 16));
       pancardText.setBounds(325, 600, 400, 25);
       add(pancardText);

       JLabel seniorCitizen = new JLabel("Senior Citizen : ");
       seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
       seniorCitizen.setBounds(100, 500, 600, 30);
       add(seniorCitizen);
       syes = new JRadioButton("YES");
       syes.setFont(new Font("Raleway", Font.BOLD, 15));
       syes.setBounds(325, 500, 150, 30);
       syes.setBackground(Color.WHITE);
       add(syes);
       sno = new JRadioButton("NO");
       sno.setFont(new Font("Raleway", Font.BOLD, 15));
       sno.setBounds(475, 500, 150, 30);
       sno.setBackground(Color.WHITE);
       add(sno);
       ButtonGroup seniorGroup = new ButtonGroup();
       seniorGroup.add(syes);
       seniorGroup.add(sno);

       JLabel existACC = new JLabel("Existing Account : ");
       existACC.setFont(new Font("Raleway", Font.BOLD, 20));
       existACC.setBounds(100, 550, 600, 30);
       add(existACC);
       eyes = new JRadioButton("YES");
       eyes.setFont(new Font("Raleway", Font.BOLD, 15));
       eyes.setBounds(325, 550, 150, 30);
       eyes.setBackground(Color.WHITE);
       add(eyes);
       eno = new JRadioButton("NO");
       eno.setFont(new Font("Raleway", Font.BOLD, 15));
       eno.setBounds(475, 550, 150, 30);
       eno.setBackground(Color.WHITE);
       add(eno);
       ButtonGroup accountGroup = new ButtonGroup();
       accountGroup.add(eyes);
       accountGroup.add(eno);

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
        String religion = (String)religionCombo.getSelectedItem();
        String category = (String)categoryCombo.getSelectedItem();
        String income = (String)incomeCombo.getSelectedItem();;
        String education = (String)educationCombo.getSelectedItem();;
        String occupation = (String)occupationCombo.getSelectedItem();;
        String aadhar = aadharText.getText();
        String pancard = pancardText.getText();
        String senior = null;
        if(syes.isSelected()){
            senior = "Yes";
        }else if(sno.isSelected()){
            senior = "No";
        }
        String existACC = null;
        if(eyes.isSelected()){
            existACC = "Yes";
        }else if(eno.isSelected()){
            existACC = "No";
        }
        String validationArray[] = {religion, category, income, education, occupation, aadhar, pancard, senior, existACC};
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
            String query = "insert into signuptwo values('"+formno+"', '" + religion + "', '" + category + "',  '" + income + "', '" + education + "', '" + occupation + "', '" + pancard + "', '" + aadhar + "', '" + senior + "', '" + existACC+ "')";
            conn.stmt.executeUpdate(query);
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
    public static void main(String args[]){
        new SignupTwo("");
    }
    
}

    

