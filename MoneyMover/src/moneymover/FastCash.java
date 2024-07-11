package moneymover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
 
    JButton amt100, amt200, amt300, amt400, amt500, amt1000, back; 
    String pinNumber; 
    
    FastCash(String pinNumber){
      
        this.pinNumber = pinNumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please Select Your Withdrawl Amount");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(220, 300, 700, 35);
        image.add(text);
        
        amt100 = new JButton("$100");
        amt100.setBounds(170, 415, 150, 30);
        amt100.addActionListener(this);
        image.add(amt100);
        
        amt200 = new JButton("$200");
        amt200.setBounds(355, 415, 150, 30);
        amt200.addActionListener(this);
        image.add(amt200);
        
        amt300 = new JButton("$300");
        amt300.setBounds(170, 450, 150, 30);
        amt300.addActionListener(this);
        image.add(amt300);
        
        amt400 = new JButton("$400");
        amt400.setBounds(355, 450, 150, 30);
        amt400.addActionListener(this);
        image.add(amt400);
        
        amt500 = new JButton("$500");
        amt500.setBounds(170, 485, 150, 30);
        amt500.addActionListener(this);
        image.add(amt500);
        
        amt1000 = new JButton("$1000");
        amt1000.setBounds(355, 485, 150, 30);
        amt1000.addActionListener(this);
        image.add(amt1000);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
        else {
            String amount = ((JButton) ae.getSource()).getText().substring(1);
            Conn conn = new Conn();
            try{
                ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                    
                }
                
                if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "$" + amount + " Debited Successfully");
                
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    
    }
            
    
    public static void main(String[] args) {
        new FastCash("");
    }
    
}
