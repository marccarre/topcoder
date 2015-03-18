package srm552;

public class FoxPaintingBalls {
    public long theMax(final long R, final long G, final long B, final int N) {
        final long numBalls = N * (N + 1) / 2;
        final long numColors = 3;
        final long minNumBallsPerColor = numBalls / numColors;
        final long rgb = R + G + B;
        
        if (rgb < numBalls)
            return 0;

        if (R < minNumBallsPerColor || G < minNumBallsPerColor || G < minNumBallsPerColor)
            return 0;

        if (N == 1)
            return rgb;

        if (N % 3 != 1) 
            return numColors * min(R, G, B) / numBalls;
        else
            return rgb / numBalls;
    }

    private long min(final long R, final long G, final long B) {
        return Math.min(R, Math.min(G, B));
    }
}
