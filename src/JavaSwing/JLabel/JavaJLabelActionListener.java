package JavaSwing.JLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaJLabelActionListener extends Frame implements ActionListener {
    JTextField tf;
    JButton b;
    JLabel l;
    JavaJLabelActionListener(){
        tf = new JTextField();
        tf.setBounds(50,50,250,20);

        l = new JLabel();
        l.setBounds(50,100,250,20);

        b = new JButton("Find IP");
        b.setBounds(50,150,95,30);
        b.addActionListener(this);

        add(b);
        add(l);
        add(tf);

        setSize(400,400);
        setLayout(null);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is " + ip);
        }
        catch (Exception ex){
            System.out.println(ex);
        }

    }

    public static void main(String[] args){
        new JavaJLabelActionListener();
    }
}
