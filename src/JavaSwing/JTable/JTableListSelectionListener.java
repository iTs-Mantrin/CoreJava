package JavaSwing.JTable;

import javax.swing.*;
import java.awt.*;

public class JTableListSelectionListener {

    JTableListSelectionListener(){
        Frame frame = new Frame("JTable");

        String data[][] = {
                {"101","Fan","1000"},
                {"102","Cooler","5000"},
                {"103","Fridge","15000"},
                {"104","PC","55000"},
                {"105","Chairs","5000"}
        };

        String column[] = {"ID","Item","Price"};

        JTable table = new JTable(data,column);
        table.setBounds(100,100,200,300);

        frame.add(table);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String args[]){
        new JTableListSelectionListener();
    }
}
