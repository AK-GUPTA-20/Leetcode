import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] res = new int[n];
        // map to store last day it rained on a lake
        Map<Integer, Integer> fullLakes = new HashMap<>();
        // TreeSet to store days (indices) when it's not raining
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int lake = rains[i];
            if (lake == 0) {
                // This day can be used to dry any lake
                dryDays.add(i);
                res[i] = 1; // default value, may change later
            } else {
                // It rains on lake
                if (fullLakes.containsKey(lake)) {
                    // Find a dry day after the last rain of this lake
                    Integer dryDay = dryDays.higher(fullLakes.get(lake));
                    if (dryDay == null) {
                        // No dry day available → flood
                        return new int[0];
                    }
                    // Use that dry day to dry this lake
                    res[dryDay] = lake;
                    dryDays.remove(dryDay);
                }
                // Mark current day as flooded with this lake
                fullLakes.put(lake, i);
                res[i] = -1;
            }
        }

        return res;
    }
}

