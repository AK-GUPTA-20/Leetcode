class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        if(numBottles == 1 ) return 1;
        int total = numBottles;
        while (numBottles >= numExchange) {
            numBottles -= numExchange -1;
            total ++;
            numExchange++;
        }
        return total;
    }
}
