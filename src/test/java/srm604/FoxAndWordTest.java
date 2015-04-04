package srm604;

import org.junit.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FoxAndWordTest {
	@Test
	public void example0()
	{
		String words[] = new String[] {
			"tokyo",
			"kyoto"
		};
		int __expected = 1;
	
		int __result = new FoxAndWord().howManyPairs(words);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example1()
	{
		String words[] = new String[] {
			"aaaaa",
			"bbbbb"
		};
		int __expected = 0;
	
		int __result = new FoxAndWord().howManyPairs(words);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example2()
	{
		String words[] = new String[] {
			"ababab",
			"bababa",
			"aaabbb"
		};
		int __expected = 1;
	
		int __result = new FoxAndWord().howManyPairs(words);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example3()
	{
		String words[] = new String[] {
			"eel",
			"ele",
			"lee"
		};
		int __expected = 3;
	
		int __result = new FoxAndWord().howManyPairs(words);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example4()
	{
		String words[] = new String[] {
			"aaa",
			"aab",
			"aba",
			"abb",
			"baa",
			"bab",
			"bba",
			"bbb"
		};
		int __expected = 6;
	
		int __result = new FoxAndWord().howManyPairs(words);

		assertThat(__result, is(__expected));
	}

	@Test
	public void example5()
	{
		String words[] = new String[] {
			"top",
			"coder"
		};
		int __expected = 0;
	
		int __result = new FoxAndWord().howManyPairs(words);

		assertThat(__result, is(__expected));
	}

}
