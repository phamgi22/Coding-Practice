class Solution {
    public int minimumKeypresses(String s) {
        Integer[] charCOunt = new Integer[26];
        
        Arrays.fill(charCOunt,0);
        
        for(int i=0;i<s.length();i++)
            charCOunt[s.charAt(i)-'a']++;
        
        Arrays.sort(charCOunt,Collections.reverseOrder());
        
        int ans =0;
        
        for(int i=0;i<26;i++)
            ans += charCOunt[i] * (i/9+1); 
        
        return ans;

    }
}