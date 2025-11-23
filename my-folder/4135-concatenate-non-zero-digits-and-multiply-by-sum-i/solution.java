class Solution {
    public long sumAndMultiply(int n) {
        long digit = 0;
        long sum = 0;
        String st = Integer.toString(n);
        for(int i=0 ; i<st.length() ; i++){
            long num = (st.charAt(i) - '0');
            sum += num;
            if(num != 0){
                digit = digit * 10 + num;
            }
            
        }
        return digit * sum;
    }
}
