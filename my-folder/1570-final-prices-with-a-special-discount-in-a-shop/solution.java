class Solution {
    public int Minidx(int[] arr , int i){
        for(int j = i + 1; j < arr.length; j++){
            if(arr[j] <= arr[i]) return j;
        }
        return -1;
    }

    public int[] finalPrices(int[] prices) {
        for(int i=0 ; i<prices.length ; i++){
            int k = Minidx(prices,i);
            if(k!=-1){
                prices[i] = prices[i]-prices[k];
            }
        }

        return prices;
    }
}
