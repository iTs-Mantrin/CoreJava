package JavaSwing;

import javax.swing.*;

public class SwingBYAssociationInsideConstructor{
    public static void main(String[] args){
    new Frame();
    }
}
class Frame{
    JFrame f;
    Frame(){
        f = new JFrame(); //creating new instance of JFrame

        JButton b = new JButton("Click");

        //etBounds(int xaxis, int yaxis, int width, int height)is used in the above example that sets the position of the button
        b.setBounds(130,100,100,40);
        f.add(b); //adding button in JFrame
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);

    }
}

