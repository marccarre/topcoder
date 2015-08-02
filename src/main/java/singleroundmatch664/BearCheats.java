package singleroundmatch664;

import java.io.*;
import java.util.*;

public class BearCheats {
	private static final int TOLERANCE = 1;

	public String eyesight(int A, int B) {
		return hasPassedOrCanCheat(A, B) ? "happy" : "glasses";
	}

	private boolean hasPassedOrCanCheat(final int A, final int B) {
		if (A == B)
			return true;

		final String a = Integer.toString(A);
		final String b = Integer.toString(B);
		int differencesCount = 0;
		for (int i = 0; i < a.length(); ++i) {
			if (a.charAt(i) != b.charAt(i))
				++differencesCount;
			if (differencesCount > TOLERANCE)
				return false;
		}

		return differencesCount >= 1;
	}

}
