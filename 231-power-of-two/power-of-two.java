class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        int a = 1;

        while (a < n) {
            if (a > Integer.MAX_VALUE / 2) {
                break; // prevents overflow
            }
            a *= 2;
        }

        return a == n;
    }
}