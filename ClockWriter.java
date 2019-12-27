import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.util.*;

public class ClockWriter extends JPanel
 {
  
     
     public ClockWriter()
{
          
     JFrame obj = new JFrame();
      obj.setSize(600,600);
      obj.setTitle("Ora Jone");
      obj.setVisible(true);
      obj.getContentPane().add(this);
     
     
      
}
       
      public void paintComponent(Graphics g)
   {
       int height = 800;
       int width = 800;
      
       
         g.setColor(Color.orange);
         g.fillRect(0, 0, height, width);  
         GregorianCalendar time = new GregorianCalendar();
         int minutes_angle = 90 - (time.get(Calendar.MINUTE)* 6);
         int hours_angle = 90 - (time.get(Calendar.HOUR_OF_DAY)* 30);
         
         
         hours_angle = hours_angle - (90 - minutes_angle)/12;
      
        
         g.setColor(Color.black);
        
         int left_edge = 50;
         int top = 50;
         int diameter = 300;
                
                
         g.setColor(Color.black);
         g.fillOval(left_edge-5, top-5, diameter+10, diameter+10);        
        
          
         g.setColor(Color.white);
         g.fillOval(left_edge, top, diameter, diameter);

         g.setColor(Color.red);
         g.fillArc(left_edge + 5, top + 5, diameter - 10, diameter - 10,hours_angle, 7);

         g.setColor(Color.blue);
         g.fillArc(left_edge + 5, top + 5, diameter - 10, diameter - 10, minutes_angle, 5);
         
                 
         
         
         g.setColor(Color.black);         
         g.drawString("The time is " + time.get(Calendar.HOUR) + ":" + time.get(Calendar.MINUTE) ,160,380);
                     
         
        }
          
        
         
            
        public static void main(String [] args)
     {
      new ClockWriter();
      }

}
