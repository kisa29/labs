
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   This component draws two car shapes.
*/
public class CarPanel extends JComponent
{  
	private Car car1;
	private int x,y, delay;
	private CarQueue carQueue;
	private int direction;
	
	CarPanel(int x1, int y1, int d, CarQueue queue)
	{
		delay = d;
        x=x1;
        y=y1;
        car1 = new Car(x, y, this);
        carQueue = queue;
	}
	public void startAnimation()
	   {
	      class AnimationRunnable implements Runnable
	      {
	         public void run()
	         {
	            try
	            {
	               for(int i=0;i<10;i++)
	               {
	            	   int dx, dy;
	            	   dx=10;
	            	   dy=10;
	            	   direction = carQueue.deleteQueue();
	            	   //delay =10;
	            	   x = x+10;
	            	   repaint();
	            	   Thread.sleep(delay*1000);
	            	   switch(direction)
	            
	            	   {
	            	   case 0:
	            		   y=y-dy;
	            		   break;
	            	   case 1:
	            		   y=y+dy;
	            		   break;
	            	   case 2:
	            		   x=x+dx;
	            		   break;
	            	   case 3:
	            	       x=x-dx;
	            	   
	            	   }
	            	   
	            	 if (x<0)
	                 {
	            		 dx=dx*-1;
	            		// x=x+50;
	                 }
	            	 else if (x>300)
	            		 {
	            		   dx=dx*-1;
	            		   //x=x-50;
	            		 }
	            	 else if  (y<0)
	            	 {
	            		 dy=dy*-1;
	            		 //y=y+50;
	            	 }
	            	 else if (y>400) 
	            	   {
	            		 dy=dy*-1;
	            		   //y=y-50;
	            	   }
	            	   
	            	 switch(direction)
	            	 {
	            	 case 0:
	            		   y=y-10;
	            		   break;
	            	   case 1:
	            		   y=y+10;
	            		   break;
	            	   case 2:
	            		   x=x+10;
	            		   break;
	            	   case 3:
	            	       x=x-10;
	            	 
	            	 
	            	 
	            	 }
	            	 
	            	 
	               }
	            }
	            catch (InterruptedException exception)
	            {
	            	
	            }
	            finally
	            {
	            	
	            }
	         }
	      }
	      
	      Runnable r = new AnimationRunnable();
	      Thread t = new Thread(r);
	      t.start();
	   }
	
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      car1.draw(g2,x,y);    
   }
}

