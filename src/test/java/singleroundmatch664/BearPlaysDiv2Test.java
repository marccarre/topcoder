package singleroundmatch664;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BearPlaysDiv2Test {
    @Test
    public void example0() {
        assertThat(new BearPlaysDiv2().equalPiles(10, 15, 35), is("possible"));
    }

    @Test
    public void example1() {
        assertThat(new BearPlaysDiv2().equalPiles(1, 1, 2), is("impossible"));
    }

    @Test
    public void example2() {
        assertThat(new BearPlaysDiv2().equalPiles(4, 6, 8), is("impossible"));
    }

    @Test
    public void example3() {
        assertThat(new BearPlaysDiv2().equalPiles(18, 18, 18), is("possible"));
    }

    @Test
    public void example4() {
        assertThat(new BearPlaysDiv2().equalPiles(225, 500, 475), is("possible"));
    }

    @Test
    public void systemTests() {
        assertThat(new BearPlaysDiv2().equalPiles(471, 471, 471), is("possible"));
        assertThat(new BearPlaysDiv2().equalPiles(1, 4, 1), is("possible"));
        assertThat(new BearPlaysDiv2().equalPiles(3, 7, 2), is("possible"));
        assertThat(new BearPlaysDiv2().equalPiles(6, 3, 9), is("possible"));
        assertThat(new BearPlaysDiv2().equalPiles(34, 11, 3), is("possible"));
    }
}
