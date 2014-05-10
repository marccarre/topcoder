package srm144;

import org.junit.Assert;
import org.junit.Test;

public class BinaryCodeTest {
	@Test
	public void example0() {
		String message = "123210122";
		String __expected[] = new String[] { "011100011", "NONE" };

		String[] __result = new BinaryCode().decode(message);
		Assert.assertArrayEquals(__expected, __result);
	}

	@Test
	public void example1() {
		String message = "11";
		String __expected[] = new String[] { "01", "10" };

		String[] __result = new BinaryCode().decode(message);

		Assert.assertArrayEquals(__expected, __result);
	}

	@Test
	public void example2() {
		String message = "22111";
		String __expected[] = new String[] { "NONE", "11001" };

		String[] __result = new BinaryCode().decode(message);

		Assert.assertArrayEquals(__expected, __result);
	}

	@Test
	public void example3() {
		String message = "123210120";
		String __expected[] = new String[] { "NONE", "NONE" };

		String[] __result = new BinaryCode().decode(message);

		Assert.assertArrayEquals(__expected, __result);
	}

	@Test
	public void example4() {
		String message = "3";
		String __expected[] = new String[] { "NONE", "NONE" };

		String[] __result = new BinaryCode().decode(message);

		Assert.assertArrayEquals(__expected, __result);
	}

	@Test
	public void example5() {
		String message = "12221112222221112221111111112221111";
		String __expected[] = new String[] { "01101001101101001101001001001101001", "10110010110110010110010010010110010" };

		String[] __result = new BinaryCode().decode(message);

		Assert.assertArrayEquals(__expected, __result);
	}

}
