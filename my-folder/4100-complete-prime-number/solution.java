class Solution {
    public boolean completePrime(int num) {
        String s=String.valueOf(num);
        int l=s.length();

        for(int i=1;i<=l;i++){
            int prefix=Integer.parseInt(s.substring(0,i));
            if(!(isprime(prefix))) return false;
        }

        for(int i=0;i<l;i++){
            int suffix=Integer.parseInt(s.substring(i));
            if(!(isprime(suffix))) return false;
        }

        return true;
    }
    boolean isprime(int n){
        if (n <= 1) return false;  
        if (n <= 3) return true;  
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
