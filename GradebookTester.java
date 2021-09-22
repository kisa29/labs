
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class GradebookTester 
{
	// two private object of GradeBook 
	private GradeBook g1;
	private GradeBook g2;

	
	@Before
	
	public void setup() 
	{
	   g1 = new GradeBook(5);
	   g2 = new GradeBook(5);
				g1.addScore(50.0);
				g1.addScore(75.0);
				g2.addScore(10.0);
				g2.addScore(30.0);
				g2.addScore(60.0);
	}
	 
	
	@After
	public void Teardown() 
	{
		g1=null;
		g2=null;
	}
	
	
	@Test
	public void addScoreTest()
	{
		//compare content from the score array to what is expected
		assertTrue((g1.toString()).equals(" 50.0 75.0 "));
		assertTrue((g2.toString()).equals(" 10.0 30.0 60.0 "));
		
		//compare scireSize to score entered
		assertEquals(2, g1.getScoreSize(), 0.001) ;
		assertEquals(3, g2.getScoreSize(), 0.001) ;
		
	}
	
	@Test
	public void sumTest() 
	{
		//Compare what is returned by the sum method to the expected sum of the scores entered.
		assertEquals (125.0, g1.sum(), 0.0001);
		assertEquals (100.0, g2.sum(), 0.0001);
		
	}
	
	@Test
	public void  minimumTest()
	{
		// compare what is returned by the minimum method and what is expected
		assertEquals(50.0, g1.minimum(), 0.001);
		assertEquals(10.0, g2.minimum(), 0.001);
		
	}
	
	@Test
	public void finalScoreTest() 
	{
		//Compare what is returned by finalScore() to the expected finalscore of the scores entered
		assertEquals(75.0, g1.finalScore(), 0.001);
		assertEquals(90.0, g2.finalScore(), 0.001);
	}
	
	
}
