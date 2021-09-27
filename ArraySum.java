
public class ArraySum {

	public int sumOfArray (Integer[] a,int index)
	{
		if (a[index]==null)
			return 0;
		else if (index <=0)
			return a[index];
		else 
			return  sumOfArray (a, index-1) +  (a[index]);
	
		
	}
	
	
}
