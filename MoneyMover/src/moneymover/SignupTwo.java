package moneymover;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
        
        
public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton syes, sno, ayes, ano;
    JComboBox religionBox, categoryBox, incomeBox, qualificationBox, occupationBox;
    String formno;
    
    SignupTwo(String formno){
        
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
      
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[] = {"Select","Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionBox = new JComboBox(valReligion);
        religionBox.setBounds(300,140,400,30);
        religionBox.setBackground(Color.white);
        add(religionBox);
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCategory[] = {"Select", "General", "OBC", "SC/ST", "Others"};
        categoryBox = new JComboBox(valCategory);
        categoryBox.setBounds(300,190,400,30);
        categoryBox.setBackground(Color.white);
        add(categoryBox);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String valIncome[] = {"Null","Below 10,000$", "Between 10,000$ and 15,000$", "Between 15,000$ and 25,000$", "Between 25,000$ and 50,000$", "Above 50,000$"};
        incomeBox = new JComboBox(valIncome);
        incomeBox.setBounds(300,240,400,30);
        incomeBox.setBackground(Color.white);
        add(incomeBox);
        
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100,290,200,30);
        add(educational);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String valQualification[] = {"Select","High School Diploma or Equivalent", "Undergraduate Degree", "Master's Degree", "Post Doctorate"}; 
        qualificationBox = new JComboBox(valQualification);
        qualificationBox.setBackground(Color.white);
        qualificationBox.setBounds(300,315,400,30);
        add(qualificationBox);
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        String valOccupation[] = {"Select", "Salaried", "Self-Employed", "Student", "Retired", "Others"}; 
        occupationBox = new JComboBox(valOccupation);
        occupationBox.setBackground(Color.white);
        occupationBox.setBounds(300,390,400,30);
        add(occupationBox);
        
        JLabel panNo = new JLabel("PAN number:");
        panNo.setFont(new Font("Raleway", Font.BOLD, 20));
        panNo.setBounds(100,440,200,30);
        add(panNo);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel aadharNo = new JLabel("AADHAR Number:");
        aadharNo.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharNo.setBounds(100,490,200,30);
        add(aadharNo);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        JLabel sCitizen = new JLabel("Senior Citizen:");
        sCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        sCitizen.setBounds(100,540,200,30);
        add(sCitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,60,30);
        syes.setFont(new Font("Raleway", Font.BOLD, 14));
        syes.setBackground(Color.white);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(400,540,60,30);
        sno.setFont(new Font("Raleway", Font.BOLD, 14));
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup sgroup = new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
        
       
        
        JLabel eaccount = new JLabel("Existing Account:");
        eaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        eaccount.setBounds(100,590,200,30);
        add(eaccount);
        
        ayes = new JRadioButton("Yes");
        ayes.setBounds(300,590,60,30);
        ayes.setFont(new Font("Raleway", Font.BOLD, 14));
        ayes.setBackground(Color.white);
        add(ayes);
        
        ano = new JRadioButton("No");
        ano.setBounds(400,590,60,30);
        ano.setFont(new Font("Raleway", Font.BOLD, 14));
        ano.setBackground(Color.white);
        add(ano);
        
        ButtonGroup agroup = new ButtonGroup();
        agroup.add(ayes);
        agroup.add(ano);
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String religion = (String) religionBox.getSelectedItem();
        String category = (String) categoryBox.getSelectedItem();
        String income = (String) incomeBox.getSelectedItem();
        String qualification = (String) qualificationBox.getSelectedItem();
        String occupation = (String) occupationBox.getSelectedItem();
        String seniorcitizen = "";
        if(syes.isSelected()){
            seniorcitizen = "yes";
        }
        else if(sno.isSelected()){
            seniorcitizen = "no";
        }
        String existingacc = "";
        if(ayes.isSelected()){
            existingacc = "yes";
        }
        else if(ano.isSelected()){
            existingacc = "no";
        }
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        
        try{
            if(religion.equals("Select")){
                JOptionPane.showMessageDialog(null, "Please Select Your Religion");
            }
            if(category.equals("Select")){
                JOptionPane.showMessageDialog(null, "Please Select Your Category");
            }
            if(qualification.equals("Select")){
                JOptionPane.showMessageDialog(null, "Please Select Your Qualification");
            }
            if(occupation.equals("Select")){
                JOptionPane.showMessageDialog(null, "Please Select Your Occupation");
            }
            if(pan.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Your PAN Number");
            }
            if(aadhar.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Your Aadhar Number");
            }
            if(seniorcitizen.equals("")){
                JOptionPane.showMessageDialog(null, "Please Select If You Are Senior Citizen Or Not");
            }
            if(existingacc.equals("")){
                JOptionPane.showMessageDialog(null, "Please Select If You Have Existing Account Or Not");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+religion+"', '"+category+"', '"+income+"', '"+qualification+"', '"+occupation+"', '"+pan+"', '"+aadhar+"', '"+seniorcitizen+"', '"+existingacc+"')"; 
                c.s.executeUpdate(query);
                
                //signup 3
            }  
            
            
        }catch(Exception e){
            System.out.println(e);
        }
            
    }
    
    public static void main(String args[]) {
       new SignupTwo("");      
    }
    
}