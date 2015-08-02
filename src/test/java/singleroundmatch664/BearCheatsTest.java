package singleroundmatch664;

import org.junit.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BearCheatsTest {
	@Test
	public void example0()
	{
		int A = 8072;
		int B = 3072;
		String __expected = "happy";
	
		String __result = new BearCheats().eyesight(A, B);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example1()
	{
		int A = 508;
		int B = 540;
		String __expected = "glasses";
	
		String __result = new BearCheats().eyesight(A, B);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example2()
	{
		int A = 854000;
		int B = 854000;
		String __expected = "happy";
	
		String __result = new BearCheats().eyesight(A, B);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example3()
	{
		int A = 1;
		int B = 6;
		String __expected = "happy";
	
		String __result = new BearCheats().eyesight(A, B);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example4()
	{
		int A = 385900;
		int B = 123000;
		String __expected = "glasses";
	
		String __result = new BearCheats().eyesight(A, B);

		assertThat(__result, is(__expected));
	}

}
