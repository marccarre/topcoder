package srm604;

import org.junit.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PowerOfThreeEasyTest {
	@Test
	public void example0()
	{
		int x = 1;
		int y = 3;
		String __expected = "Possible";
	
		String __result = new PowerOfThreeEasy().ableToGet(x, y);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example1()
	{
		int x = 1;
		int y = 1;
		String __expected = "Impossible";
	
		String __result = new PowerOfThreeEasy().ableToGet(x, y);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example2()
	{
		int x = 3;
		int y = 0;
		String __expected = "Impossible";
	
		String __result = new PowerOfThreeEasy().ableToGet(x, y);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example3()
	{
		int x = 1;
		int y = 9;
		String __expected = "Impossible";
	
		String __result = new PowerOfThreeEasy().ableToGet(x, y);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example4()
	{
		int x = 3;
		int y = 10;
		String __expected = "Possible";
	
		String __result = new PowerOfThreeEasy().ableToGet(x, y);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example5()
	{
		int x = 1093;
		int y = 2187;
		String __expected = "Possible";
	
		String __result = new PowerOfThreeEasy().ableToGet(x, y);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example6()
	{
		int x = 0;
		int y = 0;
		String __expected = "Possible";
	
		String __result = new PowerOfThreeEasy().ableToGet(x, y);

		assertThat(__result, is(__expected));
	}

}
