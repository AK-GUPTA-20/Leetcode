class Solution {
    public String minWindow(String s, String t) {

        // assign to t -> need
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int have = 0;
        int need = tMap.size();
        int start = 0;

        HashMap<Character, Integer> window = new HashMap<>();
        while (right < s.length()) {
            //assign to window -> need
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (tMap.containsKey(c) && window.get(c).equals(tMap.get(c))) {
                have++;
            }

            // window contract and find min length
            while (have == need) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                //safe delete(contarction) 
                char leftCh = s.charAt(left);
                window.put(leftCh, window.get(leftCh) - 1);

                if (tMap.containsKey(leftCh) && window.get(leftCh) < tMap.get(leftCh)) {
                    have--;
                }

                left++;

            }

            right++;
        }
        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLen);
    }
}
