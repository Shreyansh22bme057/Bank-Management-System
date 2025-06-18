package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox religionComboBox, categoryComboBox, incomeComboBox, educationComboBox, occupationComboBox;
    JTextField textPAN, textAADHAR;
    JRadioButton r1a,r1b,r2a,r2b;
    JButton next;


    String formno;

    Signup2(String formno){
        super("APPLICATION FORM");


        ImageIcon i1a = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2a = i1a.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3a = new ImageIcon(i2a);
        JLabel image1 = new JLabel(i3a);   //to bring image on frame
        image1.setBounds(25,10,100,100);
        add(image1);

        this.formno = formno;


        JLabel l1 = new JLabel("Page 2:- ");
        l1.setFont(new Font("Raleway", Font.BOLD,20));
        l1.setBounds(200,30,600,40);
        add(l1);


        JLabel l2 = new JLabel("Additional Details");
        l2.setFont((new Font("Raleway", Font.BOLD, 22)));
        l2.setBounds(200,70,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100,150,100,30);
        add(l3);
        String religion[] = {"Select one option","Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionComboBox = new JComboBox(religion);
        religionComboBox.setBackground(new Color(252,208,76));
        religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        religionComboBox.setBounds(350,150,320,30);
        add(religionComboBox);


        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,200,100,30);
        add(l4);
        String category[] = {"Select one option","General", "OBC", "SC", "ST", "Other"};
        categoryComboBox = new JComboBox(category);
        categoryComboBox.setBackground(new Color(252,208,76));
        categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryComboBox.setBounds(350,200,320,30);
        add(categoryComboBox);


        JLabel l5 = new JLabel("Income");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(100,250,100,30);
        add(l5);
        String income[] = {"Select one option","< 1 LPA", "1-3 LPA","3-5 LPA", "5-8 LPA", "8+ LPA"};
        incomeComboBox = new JComboBox(income);
        incomeComboBox.setBackground(new Color(252,208,76));
        incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeComboBox.setBounds(350,250,320,30);
        add(incomeComboBox);


        JLabel l6 = new JLabel("Education");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,300,100,30);
        add(l6);
        String education[] = {"Select one option","Elementary","High School", "Intermediate","Graduation", "Post Graduation", "Doctrate"};
        educationComboBox = new JComboBox(education);
        educationComboBox.setBackground(new Color(252,208,76));
        educationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        educationComboBox.setBounds(350,300,320,30);
        add(educationComboBox);


        JLabel l7 = new JLabel("Occupation");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,350,120,30);
        add(l7);
        String occupation[] = {"Select one option","Salaried","Self Employed", "Student","Retired", "Other"};
        occupationComboBox = new JComboBox(occupation);
        occupationComboBox.setBackground(new Color(252,208,76));
        occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationComboBox.setBounds(350,350,320,30);
        add(occupationComboBox);


        JLabel l8 = new JLabel("PAN Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100,400,150,30);
        add(l8);
        textPAN = new JTextField();
        textPAN.setFont(new Font("Raleway", Font.BOLD, 18));
        textPAN.setBounds(350,400,320,30);
        add(textPAN);


        JLabel l9 = new JLabel("AADHAR Number:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100,450,180,30);
        add(l9);
        textAADHAR = new JTextField();
        textAADHAR.setFont(new Font("Raleway", Font.BOLD, 18));
        textAADHAR.setBounds(350,450,320,30);
        add(textAADHAR);


        JLabel l10 = new JLabel("Senior Citizen: ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 500, 180,30);
        add(l10);
        r1a = new JRadioButton("Yes");
        r1a.setFont(new Font("Raleway", Font.BOLD, 14));
        r1a.setBackground(new Color(252,208,76));
        r1a.setBounds(350,500,100,30);
        add(r1a);
        r1b = new JRadioButton("No");
        r1b.setFont(new Font("Raleway", Font.BOLD, 14));
        r1b.setBackground(new Color(252,208,76));
        r1b.setBounds(450,500,100,30);
        add(r1b);


        JLabel l11 = new JLabel("Existing Account: ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 550, 180,30);
        add(l11);
        r2a = new JRadioButton("Yes");
        r2a.setFont(new Font("Raleway", Font.BOLD, 14));
        r2a.setBackground(new Color(252,208,76));
        r2a.setBounds(350,550,100,30);
        add(r2a);
        r2b = new JRadioButton("No");
        r2b.setFont(new Font("Raleway", Font.BOLD, 14));
        r2b.setBackground(new Color(252,208,76));
        r2b.setBounds(450,550,100,30);
        add(r2b);


        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l12.setBounds(600,10,100,30);
        add(l12);
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 18));
        l13.setBounds(700,10,60,30);
        add(l13);


        next = new JButton("NEXT");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(570,650,100,30);
        next.addActionListener(this);
        add(next);










        setLayout(null);
        setSize(850,750);
        setLocation(450,60);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) religionComboBox.getSelectedItem();
        String cate = (String) categoryComboBox.getSelectedItem();
        String inc = (String) incomeComboBox.getSelectedItem();
        String edu = (String) educationComboBox.getSelectedItem();
        String occ = (String) occupationComboBox.getSelectedItem();

        String pan = (String) textPAN.getText();
        String aadhar = (String) textAADHAR.getText();

        String scitizen = " ";
        if ((r1a.isSelected())){
            scitizen = "Yes";
        } else if (r1b.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((r2a.isSelected())){
            eAccount = "Yes";
        } else if (r2b.isSelected()) {
            eAccount ="No";
        }

        try{
            if (textPAN.getText().equals("") || textAADHAR.getText().equals("") || inc.equals("") || occ.equals("") || edu.equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connect_DB c1 = new Connect_DB();
                String query_1 = "insert into Signup_2 values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(query_1);
                new Signup3(formno);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
