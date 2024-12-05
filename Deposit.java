package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener{

    String pin;
    TextField textfield;
    JButton b1a, b1b;

    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1250,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel l2 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(500,190,410,35);
        l1.add(l2);

        textfield = new TextField();
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.WHITE);
        textfield.setBounds(500,240,320,25);
        textfield.setFont(new Font("Raleway", Font.BOLD,22));
        l1.add(textfield);

        b1a = new JButton("DEPOSIT");
        b1a.setBounds(680,362,150,30);
        b1a.setBackground(new Color(65,125,128));
        b1a.setForeground(Color.WHITE);
        b1a.addActionListener(this);
        l1.add(b1a);

        b1b = new JButton("BACK");
        b1b.setBounds(680,406,150,30);
        b1b.setBackground(new Color(65,125,128));
        b1b.setForeground(Color.WHITE);
        b1b.addActionListener(this);
        l1.add(b1b);


        setLayout(null);
        setSize(1550,980);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount = textfield.getText();
            Date date = new Date();
            if (e.getSource()==b1a){
                if (textfield.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    Connect_DB c = new Connect_DB();
                    c.statement.executeUpdate("insert into deposit values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            }else if (e.getSource()==b1b){
                setVisible(false);
                new main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Deposit("");
    }

}
