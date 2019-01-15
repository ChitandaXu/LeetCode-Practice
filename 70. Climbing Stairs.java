class Solution {
    public int climbStairs(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        int fib1 = 1, fib2 = 2;
        for(int i = 2; i < n; i++) {
            int temp = fib2;
            fib2 = fib2 + fib1;
            fib1= temp;
        }
        return fib2;
    }
}
