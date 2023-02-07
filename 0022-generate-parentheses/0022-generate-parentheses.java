class Solution {
    public List<String> generateParenthesis(int n) {
        // only add open parentheses if open < n
        // only add a closing pareanthesis if close < open
        // valid if open  == close == n
        
        List<String> output = new ArrayList<>();
        backtrack(output, "", 0, 0, n);
        return output;
        
       
    }
    
    
    
    public void  backtrack(List<String> output, String current, int open, int close, int max) {
        // base case (successful case) where we add to the output
        if (current.length() == max * 2) {
            output.add(current);
            return;
        }
        
        
        if (open < max) {
            backtrack(output, current + "(", open + 1, close, max);
        }
        
        if (close < open) {
            backtrack(output, current + ")", open, close + 1, max);
        }
    }
}