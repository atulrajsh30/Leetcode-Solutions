class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;  // Covers x = 0 and x = 1

        int left = 1;
        int right = x / 2;  // Optimization: sqrt(x) can't be more than x/2 for x ≥ 4
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
