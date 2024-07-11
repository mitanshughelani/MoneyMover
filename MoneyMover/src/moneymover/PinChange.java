package moneymover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class PinChange extends JFrame implements ActionListener {

    String pinNumber;
    JButton change, back;
    JPasswordField pin, rePin;
    
    PinChange(String pinNumber){
        
        this.pinNumber = pinNumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Change Your PIN");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(275, 280, 500, 35);
        image.add(text);
        
        JLabel pinText = new JLabel("New PIN:");
        pinText.setForeground(Color.white);
        pinText.setFont(new Font("System", Font.BOLD, 16));
        pinText.setBounds(165, 320, 180, 25);
        image.add(pinText);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330, 320, 180, 25);
        image.add(pin);
        
        
        JLabel rePintext = new JLabel("Re-Enter PIN:");
        rePintext.setForeground(Color.white);
        rePintext.setFont(new Font("System", Font.BOLD, 16));
        rePintext.setBounds(165, 360, 180, 25);
        image.add(rePintext);
        
        rePin = new JPasswordField();
        rePin.setFont(new Font("Raleway", Font.BOLD, 25));
        rePin.setBounds(330, 360, 180, 25);
        image.add(rePin);
        
        change = new JButton("Change");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
          
            try{
                String textPin = pin.getText();
                String textRepin = rePin.getText();

                if(!textPin.equals(textRepin)){
                    JOptionPane.showMessageDialog(null, "Entered PIN Doesn't Match");
                    return;
                }
                
                if(textPin.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Enter New Pin");
                        return;
                }
                
                if(textRepin.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Re-Enter New Pin");
                        return;
                }
                
                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+textPin+"' where pin = '"+pinNumber+"'";
                String query2 = "update login set pin = '"+textPin+"' where pin = '"+pinNumber+"'";
                String query3 = "update signupthree set pin = '"+textPin+"' where pin = '"+pinNumber+"'";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
                
                setVisible(false);
                new Transactions(textPin).setVisible(true);
                
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
        
    }
    
    
    public static void main(String[] args) {
        new PinChange("");
    }

    
}
