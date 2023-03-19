package JavaSwing.JPasswordField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaJPasswordField {
    public static void main(String args[]){
        JFrame f = new JFrame("java JPasswordField");
        JLabel label = new JLabel();
        label.setBounds(75,225,500,20);

        JLabel label1 = new JLabel("User Name");
        label1.setBounds(75,75,100,20);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(75,125,100,20);

        JButton button = new JButton("Login");
        button.setBounds(150,175,100,20);

        JTextField text = new JTextField();
        text.setBounds(150,75,150,20);

        final JPasswordField password = new JPasswordField();
        password.setBounds(150,125,150,20);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "User Name: " + text.getText() + "   Password: " + new String(password.getPassword());
                label.setText(data);
            }
        });

        f.add(label1);
        f.add(label2);
        f.add(button);
        f.add(text);
        f.add(password);
        f.add(label);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
