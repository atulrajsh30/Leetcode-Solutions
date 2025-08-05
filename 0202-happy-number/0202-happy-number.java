import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }

        return n == 1;
    }

    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r * r;
            n = n / 10;
        }
        return sum;
    }
}
