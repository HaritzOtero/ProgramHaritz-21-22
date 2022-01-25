package grafiko.sinplea;
import java.awt.*;
import javax.swing.*;
/**
 * Tic-Tac-Toe: Two-player Graphic version with better OO design.
 * The Board and Cell classes are separated in their own classes.
 */
/**
 * 
 * @author otero.haritz
 */
@SuppressWarnings("serial")
public class NirePanela extends JPanel {
  
 
   /** Constructor to setup the UI and game components */
   public NirePanela() {
     
   }
 
 
    @Override
   public void paintComponent(Graphics g) {  // invoke via repaint()
      super.paintComponent(g);    // fill background
      setBackground(Color.orange); // set its background color
      g.drawLine(0, 200, 600, 200);
      g.drawLine(0, 400, 600, 400);
      g.drawLine(0, 200, 600, 200);
      g.drawLine(200, 0, 200, 600);
      g.drawLine(400, 0, 400, 600);
      
   }
 
   /** The entry "main" method */
   public static void main(String[] args) {
      // Run GUI construction codes in Event-Dispatching thread for thread safety
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            JFrame frame = new JFrame("NirePanela JFrame baten barruan");
            // Set the content-pane of the JFrame to an instance of main JPanel
            frame.setContentPane(new NirePanela());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null); // center the application window
            frame.setVisible(true);            // show it
            frame.setSize(620,640);
         }
      });
   }
}
