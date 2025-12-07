class Solution {
    public boolean isPrime(int n){
        if (n <= 1) return false;  
        if (n <= 3) return true;  
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public int largestPrime(int n) {
        int sum = 0;
        int ans = 0;
        for(int i=2 ; i<= n ; i++){
            if(isPrime(i)) {
                sum += i;
                if(sum>n) break;
                if(isPrime(sum)){
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
