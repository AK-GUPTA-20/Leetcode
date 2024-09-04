class Solution {
    public String minWindow(String s, String t) {
    // The idea is to make the sliding window grow till it contains all the chars of t.
    // for that we will need a freq array of each character in t.
      char[] sArr = s.toCharArray();
      char[] tArr = t.toCharArray();
      int[] freq = new int[128];
      int startIndex=0; // the start index of the final substring
      int size = Integer.MAX_VALUE;
      // fill the freq array
      for (char c : tArr){
        freq[c]++;
      }
      // the number of character min in the sliding window
      int counter = tArr.length;
      int l = 0, r = 0;
      // creating the window
      while(r < sArr.length){
        var c = sArr[r];
        // If the character is needed reduce the counter 
        if (freq[c] > 0){
            counter--;
        }
        freq[c]--;
        
        // If the window contains all the required chars, try reduce it 
        while(counter == 0){
            // save the substring 
            if (size > r - l + 1){
                startIndex = l;
                size = r - l + 1;
            }
            // move the left cursor
            var cc = sArr[l];
            freq[cc]++;

            if (freq[cc] > 0){
                counter++;
            }
            l++;
        }
        r++; 
      } 
      if(size == Integer.MAX_VALUE)
            return "";
        return s.substring(startIndex, startIndex+size);
    }
}
