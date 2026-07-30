
   class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int answer = 0;

        while (a >= b) {

            long temp = b;
            int count = 1;

            while (a >= temp + temp) {
                temp = temp + temp;
                count = count + count;
            }

            a = a - temp;
            answer = answer + count;
        }

        if ((dividend < 0) != (divisor < 0)) {
            answer = -answer;
        }

        return answer;
    }
}