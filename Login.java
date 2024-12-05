package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;


    Login(){
        super("Bank Management System");

        ImageIcon i1a = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2a = i1a.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3a = new ImageIcon(i2a);
        JLabel image1 = new JLabel(i3a);   //to bring image on frame
        image1.setBounds(350,10,100,100);
        add(image1);

        ImageIcon i1b = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image i2b = i1b.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3b = new ImageIcon(i2b);
        JLabel image2 = new JLabel(i3b);   //to bring image on frame
        image2.setBounds(630,350,100,100);
        add(image2);


        label1 = new JLabel("WELCOME TO ATM");  // Jlabel main function text ko frame pe show krwaana
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Algerian", Font.BOLD, 38));
        label1.setBounds(250,125,450,40);
        add(label1);

        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField2);


        label3 = new JLabel("PIN");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 20));
        add(passwordField3);

        button1 = new JButton("LOGIN");
        button1.setFont(new Font("Arial", Font.BOLD, 15));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,230,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("SIGN UP");
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(305,350,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("CLEAR");
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(425,350,100,30);
        button3.addActionListener(this);
        add(button3);



        ImageIcon i1c = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image i2c = i1c.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i3c = new ImageIcon(i2c);
        JLabel image3 = new JLabel(i3c);   //to bring image on frame
        image3.setBounds(0,0,850,480);
        add(image3);

        setLayout(null);
        setSize(850,480);   // set the size of frame
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){
                Connect_DB c1 = new Connect_DB();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c1.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }

            }else if (e.getSource() == button2){
                new Signup();
                setVisible(false);
            }else if (e.getSource() == button3){
                textField2.setText("");
                passwordField3.setText("");
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
