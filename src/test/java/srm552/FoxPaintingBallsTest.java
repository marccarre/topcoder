package srm552;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FoxPaintingBallsTest {
	@Test
	public void example0()
	{
		long R = 2L;
		long G = 2L;
		long B = 2L;
		int N = 3;
		long __expected = 1L;
	
		long __result = new FoxPaintingBalls().theMax(R, G, B, N);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example1()
	{
		long R = 1L;
		long G = 2L;
		long B = 3L;
		int N = 3;
		long __expected = 0L;
	
		long __result = new FoxPaintingBalls().theMax(R, G, B, N);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example2()
	{
		long R = 8L;
		long G = 6L;
		long B = 6L;
		int N = 4;
		long __expected = 2L;
	
		long __result = new FoxPaintingBalls().theMax(R, G, B, N);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example3()
	{
		long R = 7L;
		long G = 6L;
		long B = 7L;
		int N = 4;
		long __expected = 2L;
	
		long __result = new FoxPaintingBalls().theMax(R, G, B, N);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example4()
	{
		long R = 100L;
		long G = 100L;
		long B = 100L;
		int N = 4;
		long __expected = 30L;
	
		long __result = new FoxPaintingBalls().theMax(R, G, B, N);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example5()
	{
		long R = 19330428391852493L;
		long G = 48815737582834113L;
		long B = 11451481019198930L;
		int N = 3456;
		long __expected = 5750952686L;
	
		long __result = new FoxPaintingBalls().theMax(R, G, B, N);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example6()
	{
		long R = 1L;
		long G = 1L;
		long B = 1L;
		int N = 1;
		long __expected = 3L;
	
		long __result = new FoxPaintingBalls().theMax(R, G, B, N);

		assertThat(__result, is(__expected));
	}

}
