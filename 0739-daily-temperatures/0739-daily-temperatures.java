class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        
        Stack<Integer> stack = new Stack<>();
        
        for (int currentDay = 0; currentDay < temperatures.length; currentDay++) {
            while (!stack.isEmpty() && temperatures[currentDay] > temperatures[stack.peek()]) {
                int preDay = stack.pop();
                ans[preDay] = currentDay - preDay;
            }
            
            stack.push(currentDay);
        }
        
        return ans;
    }
}