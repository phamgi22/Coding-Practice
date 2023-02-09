class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 1;
        
        for (int i : piles) r = Math.max(r, i);
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            int hours_spent = 0;
            
            for (int pile : piles) {
                hours_spent += Math.ceil((double) pile/mid);
            }
            
            
            if (hours_spent <= h) r = mid;
            else l = mid + 1;
        }
        
        return r;
    }
}