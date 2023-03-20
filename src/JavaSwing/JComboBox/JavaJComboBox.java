package JavaSwing.JComboBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaJComboBox {
    JFrame frame;
    JLabel label;
    JButton button;
    JComboBox comboBox;
     JavaJComboBox(){
        frame = new JFrame("Java JComboBox");

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(500,100);

        String languages[] = {"C++","Java","C#","PHP"};
        comboBox = new JComboBox(languages);
        comboBox.setBounds(100,100,100,30);

        button = new JButton("Click");
        button.setBounds(100,200,100,30);

        frame.add(label);
        frame.add(comboBox);
        frame.add(button);

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = "Programming language selected:" + comboBox.getItemAt(comboBox.getSelectedIndex());
                label.setText(str);
            }
        });

     }
     public static void main(String args[]){
         new JavaJComboBox();
     }
}