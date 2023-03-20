package JavaSwing.JCheckBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JavaJCheckBox {
    JavaJCheckBox(){
        JFrame frame = new JFrame("Java JCheckBox");
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);

        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(150,100,50,50);
        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ Checkbox: " + (e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });

        JCheckBox checkBox2 = new JCheckBox("C++");
        checkBox2.setBounds(150,150,50,50);
        checkBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox: " + (e.getStateChange() == 1? "Checked":"Unchecked"));
            }
        });


        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(label);

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);


    }
    public static void main(String args[]){
        new JavaJCheckBox();
    }
}
