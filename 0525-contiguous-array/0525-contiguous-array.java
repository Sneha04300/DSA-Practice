import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int count = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                count--;
            }

            if (map.containsKey(count)) {

                int length = i - map.get(count);

                if (length > maxLength) {
                    maxLength = length;
                }

            } else {
                map.put(count, i);
            }
        }

        return maxLength;
    }
}