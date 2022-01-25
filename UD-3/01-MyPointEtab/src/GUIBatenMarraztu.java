import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.MyCircle;
import model.MyPoint;
import model.MyTriangle;
import model.marrazgarria.MyPointMarrazgarria;

@SuppressWarnings("serial")

public class GUIBatenMarraztu extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.DARK_GRAY);
        g2d.drawString("Testu bat idazi dut", TOP_ALIGNMENT, TOP_ALIGNMENT);

        g2d.setColor(Color.RED);
        int erradioa = 5;
        g2d.fillOval(37, 80, erradioa, erradioa);
            g2d.drawString("(-3,7)", 37, 80);
        
        g2d.setColor(Color.BLACK);
        g2d.drawLine(100,0 ,100,300);
        
        g2d.drawLine(0,200 , 300,200);
        g2d.setColor(Color.LIGHT_GRAY);
       
        g2d.drawLine(140,190 , 140,200);
       
        g2d.drawLine(120,190 , 120,200);
       
        g2d.drawLine(160,190 , 160,200);
        
        g2d.drawLine(180,190 , 180,200);
        
        g2d.drawLine(80,190 , 80,200);
        
        g2d.drawLine(60,190 , 60,200);
        
        g2d.drawLine(40,190 , 40,200);
      
        
        g2d.setColor(Color.BLUE);
        g2d.fillOval(200, 120, erradioa, erradioa);
        
        g2d.drawString("(5,4)", 200, 120);
        
        g2d.setColor(Color.green);
        g2d.fillOval(55, 220, erradioa, erradioa);
        g2d.drawString("(-2,1)", 55, 220);
        
        g2d.setColor(Color.magenta);
        g2d.drawLine(200, 120, 55, 220);
        g2d.drawLine(55, 220, 37, 80);
        g2d.drawLine(37, 80, 200, 120);
        
        
        
        
        /*MyTriangle tri1 = new MyTriangle(0,16,-3,12,3,12);
        
        g2d.fillPolygon(tri1.getV1().getX(),tri1.getV2().getX(),tri1.getV3().getX(), yPoints, WIDTH);
        
        g2d.fil
        
        MyCircle zirkulu1 = new MyCircle();
         
        g2d.fillOval(zirkulu1.getCenterXY(), erradioa, erradioa);
         
        MyPoint p1 = new MyPoint();
        
        MyPointMarrazgarria p = new MyPointMarrazgarria((int)Math.random()*50,(int)Math.random()*50);
        p.marraztu(g2d);*/      


    }

    public GUIBatenMarraztu() {
          System.out.println("JFramea sortua, baina momentuz ez dago ikusgai.");       
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("JFramearen Izenburua");
        frame.add(new GUIBatenMarraztu());
        frame.setSize(370, 320);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

    }
}
