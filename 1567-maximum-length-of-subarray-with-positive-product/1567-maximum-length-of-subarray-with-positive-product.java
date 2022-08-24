class Solution {
    public int getMaxLen(int[] nums) {
//         int positive = 0, negative = 0;    // length of positive and negative results
//         int ans = 0;
//         for(int x : nums) {
//             if(x == 0)  {
//                 positive = 0;
//                 negative = 0;
//             }
//             else if(x > 0) {
//                 positive++;
//                 negative = negative == 0 ? 0  : negative+1;
//             }
//             else {
//                 int temp = positive;
//                 positive = negative == 0 ? 0  : negative+1;
//                 negative = temp+1;
//             }
//             ans = Math.max(ans, positive);
//         }
//         return ans;
        
        
        int pos = 0;
        int neg = 0;
        int out = 0;
        
        for (int num : nums) {
            if (num == 0) {
                pos = 0;
                neg = 0;
            } else if (num > 0) {
                pos++;
                neg = neg == 0 ? 0 : neg+1;
            } else {
                int temp = pos;
                pos = neg == 0 ? 0 : neg+1;
                neg = temp+1;
            }
            out = Math.max(out, pos);
        }
        
        return out;
    }
}