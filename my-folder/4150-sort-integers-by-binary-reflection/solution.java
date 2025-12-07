class Solution {
    public int[] sortByReflection(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int n : nums) list.add(n);
        Collections.sort(list,(a,b) ->{
            int x=binarynum(a);
            int y=binarynum(b);
            if(x!=y){
                return Integer.compare(x,y);
            }
            return Integer.compare(a,b);
        });
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
    public static int binarynum(int n){
        String binary=Integer.toBinaryString(n);
        String reverse=new StringBuilder(binary).reverse().toString();
        return Integer.parseInt(reverse,2);
    }
}
