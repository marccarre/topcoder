package srm233;

import org.junit.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PipeCutsTest {

	static void assertTcFloatEquals(double expected, double actual) {
		double eps = 1e-9;
		if (Double.isNaN(expected) || Double.isNaN(actual)
		    || Math.abs(expected - actual) > eps * Math.max(1.0, Math.abs(expected))) {
			throw new ComparisonFailure(null, String.valueOf(expected), String.valueOf(actual));
		}
	}

	@Test
	public void example0()
	{
		int weldLocations[] = new int[] {
			25,
			50,
			75
		};
		int L = 25;
		double __expected = 1.0;
	
		double __result = new PipeCuts().probability(weldLocations, L);

		assertTcFloatEquals(__expected, __result);
	}

	@Test
	public void example1()
	{
		int weldLocations[] = new int[] {
			25,
			50,
			75
		};
		int L = 50;
		double __expected = 0.0;
	
		double __result = new PipeCuts().probability(weldLocations, L);

		assertTcFloatEquals(__expected, __result);
	}

	@Test
	public void example2()
	{
		int weldLocations[] = new int[] {
			25,
			50,
			75
		};
		int L = 24;
		double __expected = 1.0;
	
		double __result = new PipeCuts().probability(weldLocations, L);

		assertTcFloatEquals(__expected, __result);
	}

	@Test
	public void example3()
	{
		int weldLocations[] = new int[] {
			99,
			88,
			77,
			66,
			55,
			44,
			33,
			22,
			11
		};
		int L = 50;
		double __expected = 0.7222222222222222;
	
		double __result = new PipeCuts().probability(weldLocations, L);

		assertTcFloatEquals(__expected, __result);
	}

}
