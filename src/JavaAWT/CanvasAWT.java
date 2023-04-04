package JavaAWT;

import java.awt.*;

public class CanvasAWT {
    CanvasAWT(){
        Frame f = new Frame();
        f.add(new MyCanvas());

        f.setSize(900,700);
        f.setLayout(null);
        f.setVisible(true);
    }

    class MyCanvas extends Canvas{
        public MyCanvas(){
            setBackground(Color.GRAY);
            setSize(300,300);
            setLocation(200,200);
        }

        public void paint(Graphics g){
            g.setColor(Color.BLUE);
            g.fillOval(75,75,150,75);
            g.drawOval(75,90,150,75);
            g.drawOval(75,105,150,75);
            g.drawOval(75,120,150,75);
        }
    }

    public static void main(String args[]){
     new CanvasAWT();
    }
}
