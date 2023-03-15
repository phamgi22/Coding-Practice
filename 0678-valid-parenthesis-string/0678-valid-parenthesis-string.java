class Solution {
    public boolean checkValidString(String s) {
        int lo = 0;
        int hi =  0;
        for (char c : s.toCharArray()) {
            if (c == '(') lo += 1;
            else lo += -1;
            
            
            if (c != ')') hi += 1;
            else hi += -1;
            
            if (hi < 0) break;
            lo = Math.max(lo, 0);
        }
        
        return lo == 0;
    }
}