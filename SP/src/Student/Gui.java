package Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {
    JLabel l1, l2, l3, l4, l5;
    JButton b1, b2;
    JTextField t1, t2, t3, t4;
    JFrame frame;
    JPanel panel;
    studentInfo info = new studentInfo();

    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.click();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String s = t1.getText();
            String s1 = t2.getText();
            long s2 = Long.parseLong(t3.getText());
            Float s3 = Float.valueOf(t4.getText());

            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");

            info.data(s, s1, s2, s3);
        }
        if (e.getSource() == b2) {
            info.print();
        }
    }

    public static void click() {


        Gui m = new Gui();
        m.frame = new JFrame("Student Portal");
        m.panel = new JPanel();
        m.frame.setSize(600, 500);
        m.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        m.l1 = new JLabel("Name");
        m.l1.setBounds(20, 20, 100, 20);
        m.panel.add(m.l1);

        m.l2 = new JLabel("Branch");
        m.l2.setBounds(20, 80, 100, 20);
        m.panel.add(m.l2);

        m.l3 = new JLabel("Phone number");
        m.l3.setBounds(20, 140, 100, 20);
        m.panel.add(m.l3);

        m.l4 = new JLabel("Marks");
        m.l4.setBounds(20, 200, 100, 20);
        m.panel.add(m.l4);

        m.l5 = new JLabel();
        m.l5.setBounds(10, 250, 300, 300);
        m.panel.add(m.l5);

        m.t1 = new JTextField();
        m.t1.setBounds(130, 20, 200, 35);
        m.panel.add(m.t1);

        m.t2 = new JTextField();
        m.t2.setBounds(130, 80, 200, 35);
        m.panel.add(m.t2);

        m.t3 = new JTextField();
        m.t3.setBounds(130, 140, 200, 35);
        m.panel.add(m.t3);

        m.t4 = new JTextField();
        m.t4.setBounds(130, 200, 200, 35);
        m.panel.add(m.t4);


        m.b1 = new JButton("Add new Student Data");
        m.b1.setBounds(10, 300, 200, 40);
        m.b1.addActionListener(m);
        m.panel.add(m.b1);

        m.b2 = new JButton("View Data of all student");
        m.b2.setBounds(250, 300, 200, 40);
        m.b2.addActionListener(m);
        m.panel.add(m.b2);

        m.panel.setLayout(null);
        m.frame.add(m.panel);
        m.frame.setVisible(true);
    }

}
