class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int needed = p.length();

        while (right < s.length()) {
            if (count[s.charAt(right) - 'a'] > 0) {
                needed--;
            }

            count[s.charAt(right) - 'a']--;
            right++;

            if (right - left > p.length()) {
                count[s.charAt(left) - 'a']++;
                if (count[s.charAt(left) - 'a'] > 0) {
                    needed++;
                }
                left++;
            }

            if (needed == 0) {
                ans.add(left);
            }
        }

        return ans;
    }
}