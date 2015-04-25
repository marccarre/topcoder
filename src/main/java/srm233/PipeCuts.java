package srm233;

import java.io.*;
import java.util.*;
import static java.lang.Math.max;

public class PipeCuts {
	public double probability(int[] weldLocations, int L) {
		if (weldLocations == null || weldLocations.length < 2 || weldLocations.length > 50)
			throw new IllegalArgumentException("Invalid weld locations.");
		if (L < 1 || L > 100)
			throw new IllegalArgumentException("Invalid pipe length.");
		
		Arrays.sort(weldLocations);
		int numPossibleCuts = 0;
		int numCuts = 0;
		for (int i = 0; i < weldLocations.length; ++i) {
			for (int j = i + 1; j < weldLocations.length; ++j) {
				++numCuts;
				if ((weldLocations[i] > L) || (weldLocations[j] - weldLocations[i] > L) || (100 - weldLocations[j] > L))
					++numPossibleCuts;
			}
		}
		return (double) numPossibleCuts / numCuts;
	}

}
