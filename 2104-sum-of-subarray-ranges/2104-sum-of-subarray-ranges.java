class Solution {
        public long subArrayRanges(int[] nums) {

        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        long result = 0;
        
        //the last value of the array will just be zero anyway
        for(int i = 0; i < nums.length -1; i++) {
           int startVal = nums[i]; 
            for(int k = i; k < nums.length; k++) {
                int curr = nums[k];
                if(curr > max) {
                    max = curr;
                }
                if(curr < min) {
                    min = curr;
                }
                result = result + (max - min);
                
            }
            //reset max and mins
            max = nums[i+1];
            min = nums[i+1];  
        }
        return result;
    }
}