package JavaSwing.JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaJRadioButton extends Frame implements ActionListener {

    JRadioButton radioButton1,radioButton2;
    JButton button;
    JavaJRadioButton(){
        radioButton1 = new JRadioButton("Male");
        radioButton1.setBounds(100,100,100,20);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setBounds(100,150,100,20);

        button = new JButton("Click");
        button.setBounds(100,200,100,50);
        button.addActionListener(this);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        add(button);
        add(radioButton1);
        add(radioButton2);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(radioButton1.isSelected()){
            JOptionPane.showMessageDialog(this,"You selected Male");
        }
        if(radioButton2.isSelected()){
            JOptionPane.showMessageDialog(this,"You selected Female");
        }
    }
    public static void main(String args[]){
        new JavaJRadioButton();
    }
}
