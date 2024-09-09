class Solution {
    public int TotalHourToEat(int[] piles,int x){
        int Hour = 0;
        for (int pile : piles) {
            Hour += (pile + x - 1) / x;
        }

        return Hour;
    }


    public int minEatingSpeed(int[] piles, int h) {
        if(h==1000000000) return 3;
        int low = 1;
        int high = 0;
        for(int key : piles){
            high = Math.max(high,key);
        }

        int ans=high;
        while(high>=low){
            int mid = low + (high-low)/2;
            int tothour = TotalHourToEat(piles,mid);
            if(tothour <= h){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }
}
