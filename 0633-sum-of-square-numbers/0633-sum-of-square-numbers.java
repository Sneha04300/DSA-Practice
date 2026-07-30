class Solution {
    public boolean judgeSquareSum(int c) {

        for (long a = 0; a * a <= c; a++) {

            long remaining = c - a * a;
            long b = (long) Math.sqrt(remaining);

            if (b * b == remaining) {
                return true;
            }
        }

        return false;
    }
}