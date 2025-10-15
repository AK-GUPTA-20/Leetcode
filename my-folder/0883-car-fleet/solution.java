class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int[][] car = new int[n][2];

        for(int i=0 ; i<n ; i++){
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }

        Arrays.sort(car,(a,b)-> Integer.compare(b[0] , a[0]));
        Stack<Double> st = new Stack<>();

        for(int[] c : car){
            int pos = c[0];
            int spd = c[1];
            double timeRem = (double)(target-pos)/spd;
            if(st.isEmpty() || timeRem > st.peek()){
                st.push(timeRem);
            }
        }
        return st.size();
    }
}
