package JavaSwing.JButton;

import javax.swing.*;

public class JButtonImage {
    JButtonImage(){
        JFrame f = new JFrame("JButton Image");
        JButton b = new JButton(new ImageIcon("C:\\Users\\manis\\Downloads\\images.png"));
        b.setBounds(100,100,100,40);
        f.add(b);
        f.setSize(1300,1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



    public static void main(String[] args){
        new JButtonImage();

    }
}


