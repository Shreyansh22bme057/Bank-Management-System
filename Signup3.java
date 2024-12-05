package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1a, r1b, r1c, r1d;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton S, C;
    String formno;

    Signup3(String formno) {

        this.formno = formno;

        ImageIcon i1a = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2a = i1a.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3a = new ImageIcon(i2a);
        JLabel image1 = new JLabel(i3a);   //to bring image on frame
        image1.setBounds(25, 10, 100, 100);
        add(image1);


        JLabel l1 = new JLabel("Page 3:- ");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        l1.setBounds(200, 30, 600, 40);
        add(l1);


        JLabel l2 = new JLabel("Account Details");
        l2.setFont((new Font("Raleway", Font.BOLD, 22)));
        l2.setBounds(200, 70, 600, 40);
        add(l2);


        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 140, 150, 30);
        add(l3);
        r1a = new JRadioButton(("Saving Account"));
        r1a.setFont(new Font("Raleway", Font.BOLD, 16));
        r1a.setBackground(new Color(215, 252, 252));
        r1a.setBounds(100, 180, 150, 30);
        add(r1a);
        r1b = new JRadioButton(("Current Account"));
        r1b.setFont(new Font("Raleway", Font.BOLD, 16));
        r1b.setBackground(new Color(215, 252, 252));
        r1b.setBounds(100, 210, 150, 30);
        add(r1b);
        r1c = new JRadioButton(("Recurring Deposit Account"));
        r1c.setFont(new Font("Raleway", Font.BOLD, 16));
        r1c.setBackground(new Color(215, 252, 252));
        r1c.setBounds(450, 180, 200, 30);
        add(r1c);
        r1d = new JRadioButton(("Fixed Deposit Account"));
        r1d.setFont(new Font("Raleway", Font.BOLD, 16));
        r1d.setBackground(new Color(215, 252, 252));
        r1d.setBounds(450, 210, 200, 30);
        add(r1d);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1a);
        buttonGroup.add(r1b);
        buttonGroup.add(r1c);
        buttonGroup.add(r1d);


        JLabel l4 = new JLabel("Card Number: ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 280, 200, 30);
        add(l4);


        JLabel l5 = new JLabel("(Your 16 Digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 14));
        l5.setBounds(100, 300, 250, 30);
        add(l5);


        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-1728");
        l6.setFont(new Font("Raleway", Font.BOLD, 14));
        l6.setBounds(350, 280, 250, 30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM card/ Cheque Book)");
        l7.setFont(new Font("Raleway", Font.BOLD, 14));
        l7.setBounds(350, 300, 500, 30);
        add(l7);


        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 370, 200, 30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(330, 370, 200, 30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        l10.setBounds(100, 400, 200, 20);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 450, 200, 30);
        add(l11);


        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215, 252, 252));
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215, 252, 252));
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215, 252, 252));
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(215, 252, 252));
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215, 252, 252));
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215, 252, 252));
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby decleares that the above entered details correct to the best of my knlowledge.", true);
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 20);
        add(c7);


        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l12.setBounds(600, 10, 100, 30);
        add(l12);
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 18));
        l13.setBounds(700, 10, 60, 30);
        add(l13);


        S = new JButton("Submit");
        S.setFont(new Font("Raleway", Font.BOLD, 14));
        S.setBackground(Color.BLACK);
        S.setForeground(Color.WHITE);
        S.setBounds(250, 720, 100, 30);
        S.addActionListener(this);
        add(S);

        C = new JButton("Cancel");
        C.setFont(new Font("Raleway", Font.BOLD, 14));
        C.setBackground(Color.BLACK);
        C.setForeground(Color.WHITE);
        C.setBounds(420, 720, 100, 30);
        C.addActionListener(this);
        add(C);


        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(850, 800);
        setLayout(null);
        setLocation(400, 20);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        String acctype = null;
        if (r1a.isSelected()){
            acctype = "Saving Account";
        } else if (r1b.isSelected()) {
            acctype ="Current ccount";
        }else if (r1c.isSelected()){
            acctype ="Recurring Deposit Account";
        }else if (r1d.isSelected()){
            acctype = "Fixed Deposit Account";
        }

        Random rand = new Random();
        long first7 = (rand.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (rand.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac = fac+"ATM CARD ";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"EMAIL Alerts";
        } else if (c5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (c6.isSelected()) {
            fac=fac+"E-Statement";
        }

        try {
            if (e.getSource()==S){
                if (acctype.equals("") || c7.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Connect_DB c1 = new Connect_DB();
                    String q1 = "insert into signup_3 values('"+formno+"', '"+acctype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==C) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
