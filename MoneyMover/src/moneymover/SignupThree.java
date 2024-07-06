package moneymover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class SignupThree extends JFrame implements ActionListener{
   
    JRadioButton savings, current, fdacc, recurring;
    JCheckBox atm, internetB, mobileB, email, chequeB, eStatement, acknowledge;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno){
        
        this.formno = formno;
        
        setLayout(null);
        
        JLabel L1 = new JLabel("Page 3: Account Details");
        L1.setFont(new Font("Raleway", Font.BOLD, 22));
        L1.setBounds(280, 40, 400, 40);
        add(L1);
        
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 20));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        savings = new JRadioButton("Savings Account");
        savings.setFont(new Font("Raleway", Font.BOLD, 14));
        savings.setBackground(Color.white);
        savings.setBounds(300,140,200,30);
        add(savings);
        
        current = new JRadioButton("Current Account");
        current.setFont(new Font("Raleway", Font.BOLD, 14));
        current.setBackground(Color.white);
        current.setBounds(550,140,200,30);
        add(current);
        
        fdacc = new JRadioButton("Fixed Deposit Account");
        fdacc.setFont(new Font("Raleway", Font.BOLD, 14));
        fdacc.setBackground(Color.white);
        fdacc.setBounds(300,170,200,30);
        add(fdacc);
        
        recurring = new JRadioButton("Recurring Deposit Account");
        recurring.setFont(new Font("Raleway", Font.BOLD, 14));
        recurring.setBackground(Color.white);
        recurring.setBounds(550,170,230,30);
        add(recurring);
        
        ButtonGroup accgrp = new ButtonGroup();
        accgrp.add(savings);
        accgrp.add(current);
        accgrp.add(fdacc);
        accgrp.add(recurring);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 20));
        card.setBounds(100, 220, 200, 30);
        add(card);
        
        JLabel dummyNo = new JLabel("XXXX-XXXX-XXXX-4184");
        dummyNo.setFont(new Font("Raleway", Font.BOLD, 14));
        dummyNo.setBounds(300,220,200,30);
        add(dummyNo);
        
        JLabel cardDetails = new JLabel("Your 16 Digits Card Number");
        cardDetails.setFont(new Font("Raleway", Font.BOLD, 12));
        cardDetails.setBounds(100,250,200,20);
        add(cardDetails);
        
        JLabel pin = new JLabel("PIN Number:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 290, 200, 30);
        add(pin);
        
        JLabel pinDetails = new JLabel("Your 4 Digits PIN Number");
        pinDetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pinDetails.setBounds(100,320,200,20);
        add(pinDetails);
        
        JLabel dummyPin = new JLabel("XXXX");
        dummyPin.setFont(new Font("Raleway", Font.BOLD, 14));
        dummyPin.setBounds(300,290,50,30);
        add(dummyPin);
        
        JLabel service = new JLabel("Services Required:");
        service.setFont(new Font("Raleway", Font.BOLD, 20));
        service.setBounds(100,360,200,30);
        add(service);
        
        atm = new JCheckBox("ATM Card");
        atm.setFont(new Font("Raleway", Font.BOLD, 14));
        atm.setBackground(Color.white);
        atm.setBounds(300,360,200,30);
        add(atm);
        
        internetB = new JCheckBox("Internet Banking");
        internetB.setFont(new Font("Raleway", Font.BOLD, 14));
        internetB.setBackground(Color.white);
        internetB.setBounds(550,360,200,30);
        add(internetB);
        
        mobileB = new JCheckBox("Mobile Banking");
        mobileB.setFont(new Font("Raleway", Font.BOLD, 14));
        mobileB.setBackground(Color.white);
        mobileB.setBounds(300,390,200,30);
        add(mobileB);
        
        email = new JCheckBox("Email and SMS alerts");
        email.setFont(new Font("Raleway", Font.BOLD, 14));
        email.setBackground(Color.white);
        email.setBounds(550,390,200,30);
        add(email);
        
        chequeB = new JCheckBox("Cheque Book");
        chequeB.setFont(new Font("Raleway", Font.BOLD, 14));
        chequeB.setBackground(Color.white);
        chequeB.setBounds(300,420,200,30);
        add(chequeB);
        
        eStatement = new JCheckBox("E-Statement");
        eStatement.setFont(new Font("Raleway", Font.BOLD, 14));
        eStatement.setBackground(Color.white);
        eStatement.setBounds(550,420,200,30);
        add(eStatement);
        
        acknowledge = new JCheckBox("I hereby delcare that the above entered details are correct to the best of my knowledge.");
        acknowledge.setFont(new Font("Raleway", Font.BOLD, 13));
        acknowledge.setBackground(Color.white);
        acknowledge.setBounds(100,550,700,30);
        add(acknowledge);
        
    
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(290, 600, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(450, 600, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        getContentPane().setBackground(Color.white);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== submit){
            
            String accountType = "";
            if(savings.isSelected()){
                accountType = "Savings Account";
            }
            else if(current.isSelected()){
                accountType = "Current Account";
            }
            else if(fdacc.isSelected()){
                accountType = "Fixed Deposit Account";
            }
            else if(recurring.isSelected()){
                accountType = "Recurring Deposit Account";
            }
           
            Random random = new Random();
            String cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(atm.isSelected()){
                facility = facility + "ATM Card ";
            }
            if(internetB.isSelected()){
                facility = facility + "Internet Banking ";
            }
            if(mobileB.isSelected()){
                facility = facility + "Mobile Banking ";
            }
            if(email.isSelected()){
                facility = facility + "Email and SMS Alerts ";
            }
            if(chequeB.isSelected()){
                facility = facility + "Cheque Book ";
            }
            if(eStatement.isSelected()){
                facility = facility + "E-Statement ";
            }
            
            String ack = "";
            if(acknowledge.isSelected()){
                ack = "yes";
            }
            
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Select the Account Type");
                }
                else if(facility.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Select at Least One Sevice");
                }
                else if(ack.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Acknowledge the Information Provided");
                }
                else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardNumber+"', '"+pinNumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardNumber+"', '"+pinNumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n Pin: " + pinNumber);
                    
                    setVisible(false);
                    new Deposit(pinNumber).setVisible(true);
                }       
            } catch(Exception e){
                System.out.println(e);
            }
            
            
        }
       
        else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
      
        new SignupThree("");
    }
    
}
