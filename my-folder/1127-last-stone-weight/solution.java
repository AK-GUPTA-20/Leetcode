class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> lst = new ArrayList<>();
        for(int s : stones) lst.add(s);
        return helper(lst);
    }

    private int helper(List<Integer> stone){
        if(stone.size() == 0) return 0;
        if(stone.size() == 1) return stone.get(0);

        Collections.sort(stone);
        int y = stone.remove(stone.size()-1);
        int x = stone.remove(stone.size()-1);

        int diff = y - x;
        if (diff > 0) stone.add(diff);
        return helper(stone);
    }
}
