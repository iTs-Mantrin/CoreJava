package JavaSwing.JTextField;

import javax.swing.*;

public class JavaJTextField {
    public static void main(String args[]){
        JFrame f = new JFrame("JTextField");
        JTextField t1,t2;

        t1 = new JTextField("TextField 1");
        t1.setBounds(50,100,200,30);

        t2 = new JTextField("TextField 2");
        t2.setBounds(50,150,200,30);

        f.add(t1);
        f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
