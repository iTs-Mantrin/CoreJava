package JavaAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAWT{
    ButtonAWT(){
        Frame f = new Frame();

        TextField tf = new TextField();
        tf.setBounds(50,100,200,30);
        f.add(tf);

        Button b = new Button("Click Here");
        b.setBounds(50,150,80,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Hi Kese ho");
            }
        });
        f.add(b);



        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);



    }
    public static void main(String args[]){
        new ButtonAWT();
    }
}
