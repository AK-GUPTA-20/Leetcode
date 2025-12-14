class Solution {
    private String reverse(String word){
        return new StringBuilder(word).reverse().toString();
    }
    private int CountVowel(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch =='e' || ch == 'i' || ch =='o' || ch =='u') count++;
        }
        return count;
    }
    
    public String reverseWords(String s) {
        String[] word  = s.split(" ");
        String res = word[0];
        
        int vowels = CountVowel(word[0]);
        
        
        for(int i=1 ; i<word.length ; i++){
            String str = word[i];
            if(CountVowel(str) == vowels){
                res= res+" "+reverse(word[i]);
            }
            else {
                res= res+" "+word[i];
            }
            
        }
        return res.toString();
    }
}
