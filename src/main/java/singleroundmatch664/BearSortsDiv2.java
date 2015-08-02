package singleroundmatch664;

import java.util.*;

public class BearSortsDiv2 {
    private int[] sortedT;
    private int[] brokenT;
	public double getProbability(final int[] seq) {
        brokenT = seq.clone(); // safe-copy.
        sortedT = generateSortedSequence(seq.length);
        return Math.log(reproduceBrokenMergeSort(0, seq.length));
	}

    private int[] generateSortedSequence(final int length) {
        final int[] sorted = new int[length];
        for (int i = 0; i < length; ++i)
            sorted[i] = i + 1;
        return sorted;
    }

    private double reproduceBrokenMergeSort(final int left, final int right) {
        double probability = 1.0;

        if ((left + 1) >= right)
            return probability;

        int mid = (left + right) / 2;
        probability *= reproduceBrokenMergeSort(left, mid);
        probability *= reproduceBrokenMergeSort(mid, right);

        final List<Integer> merged = new ArrayList<Integer>();
        int p1 = left;
        int p2 = mid;
        while ((p1 < mid) || (p2 < right)) {
            if (p1 == mid) {
                // Deterministic: probability doesn't change when we hit this branch.
                merged.add(sortedT[p2++]);
            } else if (p2 == right) {
                // Deterministic: probability doesn't change when we hit this branch.
                merged.add(sortedT[p1++]);
            } else if (less(sortedT[p1], sortedT[p2])) {
                probability *= 0.5;
                merged.add(sortedT[p1++]);
            } else {
                probability *= 0.5;
                merged.add(sortedT[p2++]);
            }
        }

        for (int i = left; i <= (right - 1); ++i)
            sortedT[i] = merged.get(i - left);

        return probability;
    }

    private boolean less(final int p1, final int p2) {
        for (int i = 0; i < brokenT.length; ++i) {
            if (brokenT[i] == p1) {
                return true;
            } else if (brokenT[i] == p2) {
                return false;
            }
        }
        throw new RuntimeException("Should never be reached.");
    }
}
