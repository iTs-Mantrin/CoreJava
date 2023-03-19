package JavaSwing.JTextArea;

import javax.swing.*;

public class JavaJTextArea {
    JavaJTextArea(){
        JFrame frame = new JFrame("Java JText Area");
        JTextArea area = new JTextArea("Manish Kumar");
        area.setBounds(10,30,400,400);
        frame.add(area);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String args[]){
        new JavaJTextArea();
    }
}
