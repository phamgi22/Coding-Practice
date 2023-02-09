class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 1;
        for (int pile : piles) r = Math.max(r, pile);
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            int hourSpent = 0;
            
            for (int pile : piles) hourSpent += Math.ceil((double) pile / mid);
            
            if (hourSpent <= h) r = mid;
            else l = mid + 1;
        }
        
        return r;
    }
}