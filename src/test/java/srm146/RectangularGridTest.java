package srm146;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RectangularGridTest {
	@Test
	public void example0()
	{
		int width = 3;
		int height = 3;
		long __expected = 22L;
	
		long __result = new RectangularGrid().countRectangles(width, height);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example1()
	{
		int width = 5;
		int height = 2;
		long __expected = 31L;
	
		long __result = new RectangularGrid().countRectangles(width, height);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example2()
	{
		int width = 10;
		int height = 10;
		long __expected = 2640L;
	
		long __result = new RectangularGrid().countRectangles(width, height);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example3()
	{
		int width = 1;
		int height = 1;
		long __expected = 0L;
	
		long __result = new RectangularGrid().countRectangles(width, height);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example4()
	{
		int width = 592;
		int height = 964;
		long __expected = 81508708664L;
	
		long __result = new RectangularGrid().countRectangles(width, height);

		assertThat(__result, is(__expected));
	}
}
