class Solution {
    public String minWindow(String s, String t) {

        if(s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
           char ch = t.charAt(i);
           map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;
        int cnt = 0;

        while(r < s.length()){
            char ch = s.charAt(r);

            if(map.containsKey(ch)){
                if(map.get(ch) > 0) cnt++;
                map.put(ch, map.get(ch) - 1);
            }

            while(cnt == t.length()){

                if((r - l + 1) < minLen){
                    minLen = (r - l + 1);
                    startIndex = l;
                }

                char leftChar = s.charAt(l);

                if(map.containsKey(leftChar)){
                    map.put(leftChar , map.get(leftChar) + 1);
                    if(map.get(leftChar) > 0) cnt--;
                }
                
                l++;
            }
            r++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }
}