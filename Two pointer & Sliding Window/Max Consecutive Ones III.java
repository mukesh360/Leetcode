class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>(255);
        for(int i = 0; i < 255; i++){
            map.put((char) i , -1);
        }
        int l = 0 , r = 0;
        
        while(r < s.length()){
            char ch = s.charAt(r);

            if(map.get(ch) != -1 && map.get(ch) >= l){
                l = map.get(ch) + 1;
            }

            map.put(ch , r);
            max = Math.max(max ,r - l + 1);
            r++;
        }
        return max;
    }
}