package srm146;

import java.io.*;
import java.util.*;

public class RectangularGrid {
	public long countRectangles(final int width, final int height) {
		// return countRectanglesBruteForce(width, height);
		return countRectanglesClosedFormula(width, height);
	}

	private long countRectanglesClosedFormula(final int width, final int height) {
		return numRectanglesAndSquares(width, height) - numSquares(width, height);
	}

	private long numRectanglesAndSquares(final long width, final long height) {
		return height * (height + 1) * width * (width + 1) / 4;
	}

	private long numSquares(final int width, final int height) {
		final int m = Math.min(width, height);
		long count = 0L;
		for (int i = 0; i < m; ++i)
			count += (width - i) * (height - i);
		return count;
	}

	// Unused:
	private long countRectanglesBruteForce(final int width, final int height) {
		long count = 0;
		for (int i = 0; i < height; ++i)
			for (int j = 0; j < width; ++j)
				for (int x = i; x < height; ++x)
					for (int y = j; y < width; ++y)
						if ((x-i) != (y-j))
							++count;
		return count;
	}
}
