class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] prev = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(start <= prev[1]){
                prev[1] = Math.max(end , prev[1]);
            }
            else{
                merged.add(prev);
                prev = arr[i];
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]); 
    }
}
