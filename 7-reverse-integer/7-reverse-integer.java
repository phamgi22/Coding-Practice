class Solution {
    public int reverse(int x) {
        if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE) return 0;
        long output = 0;
        int isPos = 1;
        if (x < 0) {
            isPos = -1;
            x *= -1;
        }
        
        while (x > 0) {
            int rem = x % 10;
            x /= 10;
            output = output * 10 + rem;
        }
        
        
        if (output <= Integer.MIN_VALUE || output >= Integer.MAX_VALUE) return 0;
        
        return (int)output * isPos;
    }
}