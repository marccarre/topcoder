package srm145;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Queue;
import java.util.ArrayDeque;

public class Bonuses {
    public int[] getDivision(final int[] points) {
        final int sum = sumAllPoints(points);
        final int[] bonuses = new int[points.length];
        final int totalBonus = distributeInitialBonus(bonuses, points, sum);
        if (totalBonus != 100)
            distributeRemainder(bonuses, points, totalBonus);
        return bonuses;
    }

    private int sumAllPoints(final int[] points) {
        int sum = 0;
        for (int i = 0; i < points.length; ++i)
            sum += points[i];
        return sum;
    }

    private int distributeInitialBonus(final int[] bonuses, final int[] points, final int sum) {
        int totalBonus = 0;
        for (int i = 0; i < bonuses.length; ++i) {
            final int bonus = (int) Math.floor(100.0 * points[i] / sum);
            bonuses[i] = bonus;
            totalBonus += bonus;
        }
        return totalBonus; 
    }

    private void distributeRemainder(final int[] bonuses, final int[] points, final int totalBonus) {
        final SortedMap<Integer, Queue<Integer>> employeesByPoints = sortEmployeesByPoints(points);
        int remainder = 100 - totalBonus;
        for (int i = 0; i < remainder; ++i) {
            final int keyBest = employeesByPoints.lastKey();
            final Queue<Integer> bestEmployees = employeesByPoints.get(keyBest);
            final int best = bestEmployees.poll();
            if (bestEmployees.isEmpty())
                employeesByPoints.remove(keyBest);
            bonuses[best] += 1;
        }
    }

    private SortedMap<Integer, Queue<Integer>> sortEmployeesByPoints(final int[] points) {
        final SortedMap<Integer, Queue<Integer>> employeesByPoints = new TreeMap<Integer, Queue<Integer>>();
        for (int i = 0; i < points.length; ++i) {
            final int point = points[i];
            if (employeesByPoints.containsKey(point)) {
                employeesByPoints.get(point).add(i);
            } else {
                final Queue<Integer> employees = new ArrayDeque<Integer>();
                employees.add(i);
                employeesByPoints.put(point, employees);
            }
        }
        return employeesByPoints;
    }
}
