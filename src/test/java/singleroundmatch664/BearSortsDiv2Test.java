package singleroundmatch664;

import org.junit.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BearSortsDiv2Test {

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
		int seq[] = new int[] {
			1,
			2
		};
		double __expected = -0.6931471805599453;
	
		double __result = new BearSortsDiv2().getProbability(seq);

		assertTcFloatEquals(__expected, __result);
	}

	@Test
	public void example1()
	{
		int seq[] = new int[] {
			1,
			3,
			2
		};
		double __expected = -1.3862943611198906;
	
		double __result = new BearSortsDiv2().getProbability(seq);

		assertTcFloatEquals(__expected, __result);
	}

	@Test
	public void example2()
	{
		int seq[] = new int[] {
			10,
			13,
			18,
			2,
			4,
			6,
			24,
			22,
			19,
			5,
			7,
			20,
			23,
			14,
			21,
			17,
			25,
			3,
			1,
			11,
			12,
			8,
			15,
			16,
			9
		};
		double __expected = -57.53121598647546;
	
		double __result = new BearSortsDiv2().getProbability(seq);

		assertTcFloatEquals(__expected, __result);
	}

    @Test
    public void systemTests() {
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{1}), -0.0);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{1, 2}), -0.6931471805599453);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{2, 1}), -0.6931471805599453);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{1, 2, 3, 4, 5, 6, 7}), -6.238324625039508);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{6, 2, 4, 5, 8, 1, 7, 3}), -11.090354888959125);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{9, 8, 7, 1, 5, 4, 6, 2, 3}), -13.16979643063896);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{14, 4, 5, 9, 3, 6, 7, 8, 10, 13, 11, 16, 2, 1, 15, 12}), -29.805328764077647);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{6, 7, 3, 4, 5, 13, 2, 8, 9, 10, 11, 17, 14, 1, 15, 16, 12}), -33.96421184743732);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{9, 19, 1, 2, 8, 3, 13, 18, 17, 12, 16, 14, 10, 11, 20, 7, 21, 15, 4, 6, 5}), -45.054566736396445);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{23, 22, 19, 18, 17, 13, 21, 16, 5, 4, 8, 20, 9, 10, 11, 12, 7, 6, 15, 14, 3, 2, 1}), -51.986038541995896);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{7, 16, 29, 19, 11, 8, 6, 12, 14, 21, 2, 28, 10, 15, 13, 4, 26, 22, 25, 30, 32, 27, 5, 3, 9, 23, 17, 20, 24, 18, 1, 31}), -85.95025038943322);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 15, 10, 11, 12, 13, 14, 9, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 34, 32, 33, 31, 35}), -64.46268779207492);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}), -72.78045395879425);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{40, 28, 24, 37, 36, 19, 34, 32, 33, 31, 22, 29, 39, 27, 20, 13, 1, 10, 30, 21, 8, 15, 18, 17, 16, 35, 14, 25, 12, 11, 23, 9, 26, 7, 6, 5, 4, 3, 2, 38}), -110.2104017090313);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{27, 10, 8, 5, 31, 13, 29, 1, 30, 32, 36, 24, 39, 11, 21, 22, 3, 4, 15, 12, 20, 2, 33, 6, 37, 38, 16, 28, 18, 9, 25, 34, 23, 19, 14, 7, 35, 17, 26}), -110.90354888959125);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{1, 26, 17, 19, 5, 4, 39, 8, 9, 10, 11, 31, 13, 14, 15, 16, 3, 18, 24, 20, 12, 22, 23, 6, 36, 2, 27, 28, 29, 30, 33, 32, 21, 34, 7, 25, 37, 38, 35, 40}), -108.82410734791141);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{7, 37, 31, 1, 21, 24, 32, 36, 25, 26, 28, 33, 34, 17, 29, 6, 3, 19, 20, 27, 14, 4, 16, 15, 18, 35, 12, 23, 10, 9, 8, 38, 11, 5, 30, 22, 2, 13}), -105.35837144511169);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{10, 13, 18, 2, 4, 6, 24, 22, 19, 5, 7, 20, 23, 14, 21, 17, 25, 3, 1, 11, 12, 8, 15, 16, 9}), -57.53121598647546);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{10, 1, 5, 4, 7, 6, 2, 3, 9, 8}), -15.942385152878742);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{1, 3, 2}), -1.3862943611198906);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40}), -72.0873067782343);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{2, 1, 3}), -2.0794415416798357);
        assertTcFloatEquals(new BearSortsDiv2().getProbability(new int[]{19, 4, 33, 39, 10, 16, 12, 2, 11, 30, 15, 38, 18, 35, 22, 5, 13, 24, 37, 21, 8, 27, 20, 36, 17, 23, 6, 34, 28, 9, 25, 29, 14, 7, 1, 3, 31, 32, 26}), -107.43781298679151);
    }
}
