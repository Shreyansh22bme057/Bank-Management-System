package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {

    String pin;
    TextField textField;

    JButton b1a, b1b;

    withdrawl(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel l2 = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System", Font.BOLD,16));
        l2.setBounds(460,180,400,35);
        l1.add(l2);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,250,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l1.add(textField);

        b1a = new JButton("CASH WITHDRAW");
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
        if(e.getSource()==b1a){
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                }else{
                    Connect_DB c1 = new Connect_DB();
                    ResultSet resultSet = c1.statement.executeQuery("select * from deposit where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }
                    c1.statement.executeUpdate("insert into deposit values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } catch (Exception E) {}

        }else if (e.getSource()==b1b) {
            setVisible(false);
            new main_Class(pin);}
    }
    public static void main(String[] args) {
        new withdrawl("");
    }
}
