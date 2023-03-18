package JavaSwing.JButton;

import javax.swing.*;

public class JavaJButton {
    //Commonly used Constructors:
    //JButton()	It creates a button with no text and icon.
    //JButton(String s)	It creates a button with the specified text.
    //JButton(Icon i)	It creates a button with the specified icon object.

    //Commonly used Methods of AbstractButton class:
    //void setText(String s)	It is used to set specified text on button
    //String getText()	It is used to return the text of the button.
    //void setEnabled(boolean b)	It is used to enable or disable the button.
    //void setIcon(Icon b)	It is used to set the specified Icon on the button.
    //Icon getIcon()	It is used to get the Icon of the button.
    //void setMnemonic(int a)	It is used to set the mnemonic on the button.
    //void addActionListener(ActionListener a)	It is used to add the action listener to this object.

    public static void main(String[] args){
        JFrame f = new JFrame();
        JButton b = new JButton("Click");

        b.setBounds(100,130,100,49);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

}
