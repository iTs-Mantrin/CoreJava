package JavaSwing.JTable;

import javax.swing.*;

public class JavaJTable {
    JFrame frame;
    JavaJTable(){
        frame = new JFrame("Java JTable");
        String data[][] = {
                {"101","Amit","350000"},
                {"102","Puneet","500000"},
                {"103","Pulkit","250000"}
        };
        String column[] = {"ID","Name","Salary"};

        JTable table = new JTable(data,column);
        table.setBounds(100,100,200,300);

        frame.add(table);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    public static void main(String args[]){
        new JavaJTable();
    }
}
