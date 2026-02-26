class Solution {
    public int longestKSubstr(String s, int k) {

        int maxLen = -1;   // usually required in this problem
        Map<Character, Integer> map = new HashMap<>();

        int l = 0, r = 0;

        while (r < s.length()) {

            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftCh = s.charAt(l);
                map.put(leftCh, map.get(leftCh) - 1);

                if (map.get(leftCh) == 0) {
                    map.remove(leftCh);
                }
                l++;
            }

            if (map.size() == k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }

            r++;
        }

        return maxLen;
    }
}