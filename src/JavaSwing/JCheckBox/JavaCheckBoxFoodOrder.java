package JavaSwing.JCheckBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCheckBoxFoodOrder extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    JCheckBox checkBox1, checkBox2, checkBox3;
    JavaCheckBoxFoodOrder(){
        label = new JLabel("Food Ordering System");
        label.setBounds(50,50,300,20);

        checkBox1 = new JCheckBox("Pizza@120");
        checkBox1.setBounds(100,100,150,20);

        checkBox2 = new JCheckBox("Burger@70");
        checkBox2.setBounds(100,150,150,20);

        checkBox3 = new JCheckBox("Tea@20");
        checkBox3.setBounds(100,200,150,20);

        button = new JButton("Order");
        button.setBounds(100,250,100,40);
        button.addActionListener(this);

        add(label);
        add(button);
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);

        setSize(500,500);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";

        if (checkBox1.isSelected()){
            amount += 120;
            msg += "Pizza: 120\n";
        }
        if( checkBox2.isSelected()){
            amount += 70;
            msg += "Burger: 70\n";
        }
        if( checkBox3.isSelected()){
            amount += 20;
            msg += "Tea: 20\n";
        }
        msg += "__________________\n";

        JOptionPane.showMessageDialog(this,msg+"Total: " + amount);
    }
    public static void main(String args[]){
        new JavaCheckBoxFoodOrder();
    }
}
