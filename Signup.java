package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1a, r1b, r2a, r2b, r2c;
    JButton next;
    JDateChooser dateChooser;
    JTextField textName, textFName, textEmail, textms, textAdd, textstate, textpin;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);


    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1a = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2a = i1a.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3a = new ImageIcon(i2a);
        JLabel image1 = new JLabel(i3a);   //to bring image on frame
        image1.setBounds(25,10,100,100);
        add(image1);

        JLabel label1 = new JLabel("APPLICATION NO. "+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(350,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(300,110,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,25));
        add(label3);

        JLabel labelName = new JLabel("Name*");
        labelName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelName.setBounds(100, 190,100, 30);
        add(labelName);

        JLabel labelFName = new JLabel("Father's Name*");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelFName.setBounds(100, 240,200, 30);
        add(labelFName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 20));
        textName.setBounds(300,190,400,30);
        add(textName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 20));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DoB = new JLabel("DoB*");
        DoB.setFont(new Font("Raleway", Font.BOLD, 22));
        DoB.setBounds(100, 290,200, 30);
        add(DoB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        JLabel Gender = new JLabel("Gender");
        Gender.setFont(new Font("Raleway", Font.BOLD, 22));
        Gender.setBounds(100, 340,200, 30);
        add(Gender);

        r1a = new JRadioButton("Male");
        r1a.setFont(new Font("Raleway", Font.BOLD, 14));
        r1a.setBackground(new Color(222,255,228));
        r1a.setBounds(300,340,60,30);
        add(r1a);
        r1b = new JRadioButton("Female");
        r1b.setFont(new Font("Raleway", Font.BOLD, 14));
        r1b.setBackground(new Color(222,255,228));
        r1b.setBounds(450,340,90,30);
        add(r1b);
        ButtonGroup buttonGroup_1 = new ButtonGroup();
        buttonGroup_1.add(r1a);
        buttonGroup_1.add(r1b);

        JLabel labelEmail = new JLabel("E-mail id*");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 22));
        labelEmail.setBounds(100, 390,200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelms = new JLabel("Marital Status");
        labelms.setFont(new Font("Raleway", Font.BOLD, 22));
        labelms.setBounds(100, 440,200, 30);
        add(labelms);

        r2a = new JRadioButton("Married");
        r2a.setFont(new Font("Raleway", Font.BOLD, 14));
        r2a.setBackground(new Color(222,255,228));
        r2a.setBounds(300,440,100,30);
        add(r2a);
        r2b = new JRadioButton("Unmarried");
        r2b.setFont(new Font("Raleway", Font.BOLD, 14));
        r2b.setBackground(new Color(222,255,228));
        r2b.setBounds(450,440,100,30);
        add(r2b);
        r2c = new JRadioButton("Other");
        r2c.setFont(new Font("Raleway", Font.BOLD, 14));
        r2c.setBackground(new Color(222,255,228));
        r2c.setBounds(600,440,100,30);
        add(r2c);
        ButtonGroup buttonGroup_2 = new ButtonGroup();
        buttonGroup_2.add(r2a);
        buttonGroup_2.add(r2b);
        buttonGroup_2.add(r2c);

//        textms = new JTextField();
//        textms.setFont(new Font("Raleway", Font.BOLD, 22));
//        textms.setBounds(300,440,400,30);
//        add(textms);

        JLabel labelAdd = new JLabel("Address*");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 22));
        labelAdd.setBounds(100, 490,200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelState = new JLabel("State*");
        labelState.setFont(new Font("Raleway", Font.BOLD, 22));
        labelState.setBounds(100, 540,200, 30);
        add(labelState);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway", Font.BOLD, 20));
        textstate.setBounds(300,540,400,30);
        add(textstate);

        JLabel labelpin = new JLabel("PIN Code*");
        labelpin.setFont(new Font("Raleway", Font.BOLD, 22));
        labelpin.setBounds(100, 590,200, 30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway", Font.BOLD, 20));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1a.isSelected()){
            gender = "Male";
        }else if(r1b.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(r2a.isSelected()){
            marital = "Married";
        }else if(r2b.isSelected()){
            marital = "Unmarried";
        }else if(r2c.isSelected()){
            marital = "Other";
        }

        String address = textAdd.getText();
        String state = textstate.getText();
        String pincode = textpin.getText();

        try{
            if((textName.getText().equals("")) || (textFName.getText().equals("")) || (dob.equals("")) || (email.equals("")) || (address.equals("")) || (pincode.equals("")) || (state.equals(""))){
                JOptionPane.showMessageDialog(null,"Fill all the star marked fields");
            }else{
                Connect_DB connection_1 = new Connect_DB();
                String q = "insert into signup_1 values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+pincode+"', '"+state+"')";
                connection_1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
