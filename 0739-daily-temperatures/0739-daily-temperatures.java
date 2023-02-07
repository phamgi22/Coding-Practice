class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int cur = 0; cur < temperatures.length; cur++) {
            while(!stack.isEmpty() && temperatures[cur] > temperatures[stack.peek()]) {
                int pre = stack.pop();
                ans[pre] = cur - pre;
            }
            
            stack.push(cur);
        }
        
        return ans;
    }
}