package srm604;

import java.io.*;
import java.util.*;

public class PowerOfThreeEasy {
    private static final int LIMIT = 1000000000;

    private static final String POSSIBLE = "Possible";
    private static final String IMPOSSIBLE = "Impossible";

    private static final int NO_MOVE = 0;
    private static final int FORWARD = 1;

    public String ableToGet(final int targetX, final int targetY) {
        if ((targetX > LIMIT) || (targetY > LIMIT))
            return IMPOSSIBLE;

        return (moveTo(targetX, targetY, 0, 0, FORWARD,  NO_MOVE,  0) || 
                moveTo(targetX, targetY, 0, 0, NO_MOVE,  FORWARD,  0))
            ? POSSIBLE
            : IMPOSSIBLE;
    }

    private boolean moveTo(final int targetX, final int targetY, int x, int y, final int xDirection, final int yDirection, int step) {
        if ((x == targetX) && (y == targetY))
            return true;

        if ((x > targetX) || (y > targetY))
            return false;

        final int stepSize = (int) Math.pow(3, step++);
        x += xDirection * stepSize;
        y += yDirection * stepSize;

        return (moveTo(targetX, targetY, x, y, FORWARD,  NO_MOVE,  step) || 
                moveTo(targetX, targetY, x, y, NO_MOVE,  FORWARD,  step));
    }
}
