import java.util.ArrayDeque;
import java.util.Random;

public class CarQueue {


 
	Random random=new Random();


	private ArrayDeque<Integer> que = new ArrayDeque<Integer>();

	public CarQueue() 

	{
		for (int i =0; i< 6; i++) 
		{
			que.add(random.nextInt(4));
		}

	}


	public void addToQueue() 
	{
	  class rundable implements Runnable
	  {

			@Override
		 public void run() 
		  {
			 while(true) {	
				
			  try {

					que.add(random.nextInt(4));
					Thread.sleep(400);

				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		  }
		
	}
		Runnable run = new rundable();
		Thread t= new Thread(run);
		t.start();

}


	public int deleteQueue() 
	{ 
		return que.remove();
	}



}
