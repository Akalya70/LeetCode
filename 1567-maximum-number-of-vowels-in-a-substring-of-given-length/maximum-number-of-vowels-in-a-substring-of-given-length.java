class Solution {
    public int maxVowels(String s, int k) {
        int currentcount=0;
        int maxcount=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                currentcount++;
            }
        }
        maxcount=currentcount;
        for(int i=k;i<s.length();i++){
                    if(isVowel(s.charAt(i-k))){
                        currentcount--;
                    }
                    if(isVowel(s.charAt(i))){
                        currentcount++;
                    }
                    maxcount=Math.max(maxcount,currentcount);

        }    return maxcount;

    }
    public boolean isVowel(char c){
    return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
}

}