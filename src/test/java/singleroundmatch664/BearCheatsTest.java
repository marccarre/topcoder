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

	@Test
	public void systemTests() {
		assertThat(new BearCheats().eyesight(385900, 123000), is("glasses"));
		assertThat(new BearCheats().eyesight(1, 1), is("happy"));
		assertThat(new BearCheats().eyesight(99, 99), is("happy"));
		assertThat(new BearCheats().eyesight(98, 89), is("glasses"));
		assertThat(new BearCheats().eyesight(222, 323), is("glasses"));
		assertThat(new BearCheats().eyesight(654321, 123456), is("glasses"));
		assertThat(new BearCheats().eyesight(848097, 848997), is("happy"));
		assertThat(new BearCheats().eyesight(50000, 10000), is("happy"));
		assertThat(new BearCheats().eyesight(1111, 1011), is("happy"));
		assertThat(new BearCheats().eyesight(999758, 999758), is("happy"));
		assertThat(new BearCheats().eyesight(879000, 889000), is("happy"));
		assertThat(new BearCheats().eyesight(59390, 58391), is("glasses"));
		assertThat(new BearCheats().eyesight(278548, 276348), is("glasses"));
		assertThat(new BearCheats().eyesight(109, 110), is("glasses"));
		assertThat(new BearCheats().eyesight(1000, 1089), is("glasses"));
		assertThat(new BearCheats().eyesight(12, 22), is("happy"));
		assertThat(new BearCheats().eyesight(12121, 22222), is("glasses"));
		assertThat(new BearCheats().eyesight(11, 23), is("glasses"));
	}
}
