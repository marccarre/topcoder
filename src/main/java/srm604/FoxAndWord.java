package srm604;

import java.io.*;
import java.util.*;

public class FoxAndWord {
	public int howManyPairs(final String[] words) {
		if (words == null || words.length <= 1)
			return 0;

		int count = 0;
		for (int i = 0; i < words.length - 1; ++i)
			for (int j = i + 1; j < words.length; ++j)
				if (isRotation_MoreEfficient(words[i], words[j]))
					++count;
		return count;
	}

	/**
	 * WARNING: {@code rotate} generates three new String objects per call (2 substrings and 1 for the concatenation), which:
	 * - is O_time(2*n) and O_space(2*n)
	 * - generates quite a lot of "garbage" for a simple comparison (O_time(n) itself)
	 * Overall performance: 
	 * - O_time(3*n^2)
	 * - O_space(2*n)
	 * If this is unacceptable, consider using isRotation_MoreEfficient instead.
	 */
	private boolean isRotation(final String a, final String b) {
		if ((a == null) || (b == null) || a.isEmpty() || (a.length() != b.length()))
			return false;

		for (int pivot = 1; pivot < a.length(); ++pivot)
			if (rotate(a, pivot).equals(b))
				return true;
		return false;
	}

	private String rotate(final String string, final int pivot) {
		return string.substring(pivot) + string.substring(0, pivot);
	}

	/**
	 * More efficient implementation of {@code isRotation}:
	 * - O_time(n^2)
	 * - O_space(1)
	 */
	private boolean isRotation_MoreEfficient(final String a, final String b) {
		if ((a == null) || (b == null) || a.isEmpty() || (a.length() != b.length()))
			return false;

		for (int pivot = 1; pivot < a.length(); ++pivot)
			if (isRotationAt(pivot, a, b))
				return true;
		return false;
	}

	private boolean isRotationAt(final int pivot, final String a, final String b) {
		final int n = a.length();
		for (int i = 0; i < n; ++i)
			if (a.charAt(i) != b.charAt((n + i - pivot) % n))
				return false;
		return true;
	}
}
