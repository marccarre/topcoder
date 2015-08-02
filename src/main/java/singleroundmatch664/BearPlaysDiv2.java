package singleroundmatch664;

import java.util.HashSet;
import java.util.Set;

public class BearPlaysDiv2 {
	private static final int MAX_DEPTH = 1000;

    private Set<Set<Integer>> visited = new HashSet<Set<Integer>>();

	public String equalPiles(final int a, final int b, final int c) {
		return canBeSolved(a, b, c) ? "possible" : "impossible";
	}

	private boolean canBeSolved(final int a, final int b, final int c) {
		if ((a + b + c) % 3 != 0)
			return false;
        return depthFirstSearch(a, b, c, 0);
	}

	private boolean depthFirstSearch(final int a, final int b, final int c, int depth) {
        // System.out.println("[" + depth + "]: (" + a + ", " + b + ", " + c + ")");

        if (isSolution(a, b, c))
            return true;

        if ((depth > MAX_DEPTH) || (a <= 0) || (b <= 0) || (c <= 0) || !visited.add(set(a, b, c)))
            return false;

        ++depth;
        return (depthFirstSearch(a, b+b, c-b, depth) ||
                depthFirstSearch(a, b-c, c+c, depth) ||
                depthFirstSearch(a+a, b, c-a, depth) ||
                depthFirstSearch(a-c, b, c+c, depth) ||
                depthFirstSearch(a+a, b-a, c, depth) ||
                depthFirstSearch(a-b, b+b, c, depth));
	}

    private boolean isSolution(final int a, final int b, final int c) {
        return (a == b) && (b == c);
    }

    private Set<Integer> set(final int a, final int b, final int c) {
        final Set<Integer> set = new HashSet<Integer>();
        set.add(a);
        set.add(b);
        set.add(c);
        return set;
    }
}
