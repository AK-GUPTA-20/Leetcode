class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(heights[i], names[i]); // Corrected order: heights[i] -> names[i]
        }

        for (int i = 0; i < n; i++) {
            int max = Collections.max(mp.keySet());
            names[i] = mp.get(max);
            mp.remove(max);
        }
        return names;
    }
}

