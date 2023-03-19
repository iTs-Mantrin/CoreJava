package JavaSwing.JTextArea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaJTextAreaActiveListener implements ActionListener {
    JLabel label1, label2;
    JButton button;
    JTextArea area;
    JavaJTextAreaActiveListener(){
        JFrame frame = new JFrame();
        label1 = new JLabel();
        label1.setBounds(50,25,100,30);

        label2 = new JLabel();
        label2.setBounds(100,25,100,30);

        area = new JTextArea();
        area.setBounds(20,75,250,200);

        button = new JButton("Count Words");
        button.setBounds(100,300,120,30);
        button.addActionListener(this);

        frame.add(button);
        frame.add(label1);
        frame.add(label2);
        frame.add(area);

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String words[] = text.split("\\s");
        label1.setText("Words: " + words.length);
        label2.setText("  Charater: " + text.length());
    }
    public static void main(String args[]){
        new JavaJTextAreaActiveListener();
    }
}
