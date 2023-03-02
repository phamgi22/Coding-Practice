class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            int current = n;
            int sum = 0;
            while(current != 0) {
                sum += Math.pow(current % 10, 2);
                current /= 10;
            }
            
            if (seen.contains(sum)) return false;
            seen.add(sum);
            n = sum;
        }
        
        return true;
    }
}