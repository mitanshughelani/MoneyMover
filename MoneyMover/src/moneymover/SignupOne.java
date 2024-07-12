package moneymover;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
        
        
public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField,fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, provinceTextField, pcodeTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
        add(dateChooser);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel maritial = new JLabel("Maritial Status:");
        maritial.setFont(new Font("Raleway", Font.BOLD, 20));
        maritial.setBounds(100,390,200,30);
        add(maritial);
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(600,390,100,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup mstatus = new ButtonGroup();
        mstatus.add(married);
        mstatus.add(unmarried);
        mstatus.add(other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel province = new JLabel("Province:");
        province.setFont(new Font("Raleway", Font.BOLD, 20));
        province.setBounds(100,540,200,30);
        add(province);
        
        provinceTextField = new JTextField();
        provinceTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        provinceTextField.setBounds(300,540,400,30);
        add(provinceTextField);
        
        JLabel pcode = new JLabel("Postal Code:");
        pcode.setFont(new Font("Raleway", Font.BOLD, 20));
        pcode.setBounds(100,590,200,30);
        add(pcode);
        
        pcodeTextField = new JTextField();
        pcodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pcodeTextField.setBounds(300,590,400,30);
        add(pcodeTextField);
        
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
//        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String formno = "" + random; // long value converted to string
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = "";
        if(male.isSelected()){
            gender = "male";
        }
        else if(female.isSelected()){
            gender = "female";
        }
        String email = emailTextField.getText();
        String mstatus = "";
        if(married.isSelected()){
            mstatus = "married";
        }
        else if(unmarried.isSelected()){
            mstatus = "unmarried";
        }
        else if(other.isSelected()){
            mstatus = "other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String province = provinceTextField.getText();
        String pcode = pcodeTextField.getText();
        
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Name");
            }
            if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Father's Name");
            }
            if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Date of Birth");
            }
            if(gender.equals("")){
                JOptionPane.showMessageDialog(null, "Please Select Your Gender");
            }
            if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Email");
            }
            if(mstatus.equals("")){
                JOptionPane.showMessageDialog(null, "Please Select Your Marital Status ");
            }
            if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Address");
            }
            if(city.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter City");
            }
            if(province.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Province");
            }
            if(pcode.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Postal Code");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+mstatus+"', '"+address+"', '"+city+"', '"+province+"', '"+pcode+"')"; 
                c.s.executeUpdate(query);
            
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }  
            
            
        }catch(Exception e){
            System.out.println(e);
        }
            
    }
    
    public static void main(String args[]) {
       new SignupOne();      
    }
    
}