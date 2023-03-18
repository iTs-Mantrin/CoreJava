package JavaSwing.JButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonActionListener {
    public static void main(String[] args){
        JFrame f = new JFrame("JButton Action Listener");

        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);

        JButton b = new JButton("Click Here");
        b.setBounds(50,100,95,30);

        //Java JButton with ActionListener
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome");
            }
        });

        f.add(b);
        f.add(tf);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
