package JavaSwing;

import javax.swing.*;

public class JFrameClickButton {
    public static void main(String[] args){
        JFrame objF = new JFrame(); //creating instance of JFrame

        JButton objB = new JButton("Click"); //Creating instance of JButton
        objF.add(objB); //adding button in JFrame

        objF.setSize(500,400); //Frame width 500 and height 400
        //objF.setLayout(null); //using no layout manager
        objF.setVisible(true);
    }
}
