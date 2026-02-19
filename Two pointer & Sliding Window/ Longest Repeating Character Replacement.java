import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        int maxFreq = 0, maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            char ch = s.charAt(r);

            // Correct frequency update
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            // Shrink window if invalid
            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);

            r++;   // Important!
        }

        return maxLen;
    }
}