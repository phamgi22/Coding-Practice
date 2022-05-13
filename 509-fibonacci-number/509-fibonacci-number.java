class Solution {
    public int fib(int n) {
//         // recursion solution
//         if(n == 0) return 0;
//         if(n == 1) return 1;
        
//         return fib(n-1) + fib(n-2);
        
        
        // O(1) time complexity solution
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int a = 0;
        int b = 1;
        int sum = 0;
        
        while(n > 1) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }

        return sum;
    }
}