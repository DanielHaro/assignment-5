import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class jPanelExt extends JPanel implements Runnable{

	/**
	 * Create the panel.
	 */
	
	int mover = 50;
	Boolean moving = false;
	
	public jPanelExt() 
	
	{
		Thread thread = new Thread (this);
	 	thread.start();
		
	}
	
	
	
	public void paintComponent(Graphics g)
	{
	    super.paintComponent(g);
		this.setBackground(Color.green);
	    this.validate(); 	
	  //  	this.repaint();
	
	    	g.drawString("DVC 10.0",mover,50);
	
	
	//g.drawRect(50, 50, 200, 100);
	//g.drawOval(50, 50, 200, 100);
	
		
	}	
	
	
	public void setMoving(Boolean moving) {
		this.moving = moving;
	
	}



	public void run() 
	{
	  while(true)
		{
		  if(moving)
		  {
			this.mover = this.mover + 3;
			
            if(this.mover > this.getWidth() - 88)
            	{mover = 0;}
			//this.mover = 10;
				this.repaint();
	       
		   }		
				try{		
			          Thread.sleep(30);
	               }
	            catch (InterruptedException e)
	                { e.printStackTrace();}	
		 
		}
		
	}
	

}
