class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] nse = new int [n];     // next smallest element array
        int[] pse = new int[n];      // prev smallest element array.


        // claculating next smallest element array

        nse[n-1] = n;
        st.push(n-1);
        for(int i=n-2 ; i>=0 ; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i] ){
                st.pop();


            }
            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);

        }

        // clearing Stack
        while(st.size()>0) st.pop();

        // calculating prev smallest element (Index) array
        pse[0] = -1;
        st.push(0);
        for(int k=1 ; k<=n-1 ; k++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[k]){
                st.pop();
            }
            if(st.isEmpty()) pse[k] = -1;
            else pse[k] = st.peek();
            st.push(k);
        }

        // finding maximum area = heights[i] *(nse[i]-pse[i]-1)
        int max = -1;
        for(int j=0 ; j<n ; j++){
            int area = heights[j] *(nse[j]-pse[j]-1);
            max = Math.max(area,max);
        }
        return max;
    }
}
