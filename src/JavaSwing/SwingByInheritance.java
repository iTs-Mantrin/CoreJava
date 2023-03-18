package JavaSwing;

import javax.swing.*;

public class SwingByInheritance {
    public static void main(String[] args){
        new SwingInheritance();

    }
}
class SwingInheritance extends JFrame{  //inheriting JFrame
    JFrame f;
    SwingInheritance(){
        JButton b = new JButton("Click");
        b.setBounds(130,100,100,40);

        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
}
