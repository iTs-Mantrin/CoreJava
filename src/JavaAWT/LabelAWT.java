package JavaAWT;

import java.awt.*;
import java.net.UnknownHostException;
import java.util.List;
import java.awt.event.*;

public class LabelAWT extends Frame implements ActionListener {
    TextField tf;
    Label l;
    Button b;
    TextArea ta;
    Checkbox male,female;
    Choice ch;
    Scrollbar scroll;
    MenuBar menuBar;
    Menu menu;
    Menu subMenu;
    MenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5;
    LabelAWT(){
        scroll = new Scrollbar();
        scroll.setBounds(320,50,25,400);
        add(scroll);

        scroll.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("Vertical Scrollbar Value is: "+scroll.getValue());
            }
        });

        menuBar = new MenuBar();
        menu = new Menu("Menu");
        subMenu = new Menu("Sub Menu");
        menuItem1 = new MenuItem("Item 1");
        menuItem2 = new MenuItem("Item 2");
        menuItem3 = new MenuItem("Item 3");
        menuItem4 = new MenuItem("Item 4");
        menuItem5 = new MenuItem("Item 5");
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        subMenu.add(menuItem4);
        subMenu.add(menuItem5);
        menu.add(subMenu);
        menuBar.add(menu);
        setMenuBar(menuBar);

        tf = new TextField();
        tf.setBounds(100,100,200,25);
        add(tf);

        l = new Label("Label");
        l.setBounds(100,150,500,25);
        add(l);

        ta = new TextArea();
        ta.setBounds(100,200,200,100);
        add(ta);

        CheckboxGroup cg = new CheckboxGroup();

        male = new Checkbox("Male",cg,false); //male.getStateChange() == 1
        male.setBounds(100,300,50,30);
        add(male);

        female = new Checkbox("Female",cg,false);
        female.setBounds(150,300,50,30);
        add(female);

        ch = new Choice();    //ch.getItem(ch.getSelectedIndex())
        ch.setBounds(100,350,200,40);
        ch.add("Option 1");
        ch.add("Option 2");
        ch.add("Option 3");
        ch.add("Option 4");
        ch.add("Option 5");
        add(ch);

//        List ls = new List(5);
//        ls.add("Option 1");
//        ls.add("Option 2");
//        ls.add("Option 3");
//        ls.add("Option 4");
//        ls.add("Option 5");
//        add(ls);

        b = new Button("Click");
        b.setBounds(100,400,200,25);
        b.addActionListener(this);
        add(b);


        setBackground(Color.LIGHT_GRAY);
        setSize(400,500);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String arg[]){
        new LabelAWT();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String host = tf.getText();
        try {
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("Ip address of "+ host + " is "+ ip);
        } catch (UnknownHostException ex) {
            throw new RuntimeException(ex);
        }
    }
}
