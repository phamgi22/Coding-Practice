class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()) return false;
        int[] arr = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        
        int i = 0;
        int j = 0;
        
        for (; j < s1.length(); j++) {
            arr[s2.charAt(j) - 'a']--;
        }
        
        j--;
        
        if (isEmpty(arr)) return true;
        
        while(j < s2.length()) {
            arr[s2.charAt(i) -  'a']++;
            i++;
            j++;
            if (j < s2.length()) arr[s2.charAt(j) - 'a']--;
            if (isEmpty(arr)) return true;
        }
        
        return isEmpty(arr);
    }
    
    
    public boolean isEmpty(int[] arr) {
        for (int i : arr) {
            if (i != 0) return false;
        }
        
        return true;
    }
}