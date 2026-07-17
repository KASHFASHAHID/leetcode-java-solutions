import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();

        int i = 0;

        // Step 1 : Insert newInterval at correct position
        while (i < intervals.length && intervals[i][0] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }

        list.add(newInterval);

        while (i < intervals.length) {
            list.add(intervals[i]);
            i++;
        }

        // Step 2 : Apply Merge Interval logic
        List<int[]> result = new ArrayList<>();

        int start = list.get(0)[0];
        int end = list.get(0)[1];

        for (i = 1; i < list.size(); i++) {

            int currentStart = list.get(i)[0];
            int currentEnd = list.get(i)[1];

            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            } else {
                result.add(new int[]{start, end});
                start = currentStart;
                end = currentEnd;
            }
        }

        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}