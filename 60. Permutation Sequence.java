class Solution {
    public String getPermutation(int n, int k) {
        int[] factor = new int[n+1];
        List<Integer> numbers = new ArrayList<>();
        factor[0] = 1;
        for(int i = 1; i <= n; i++) {
            factor[i] = factor[i-1] * i;
        }
        for(int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        k--;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            int num = k / factor[n-i];
            sb.append(numbers.get(num));
            numbers.remove(num);
            k = k - factor[n-i] * num;
        }
        return sb.toString();
    }
}
