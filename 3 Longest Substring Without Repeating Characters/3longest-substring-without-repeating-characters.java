class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, right=0, max=0;
        Set<Character> seen_char = new HashSet<>();
        while(right<s.length()){
            if(!seen_char.contains(s.charAt(right))){
                seen_char.add(s.charAt(right++));
                max=Math.max(max,seen_char.size());
            }
            else{
                 seen_char.remove(s.charAt(left++));
            }
        }
        return max;
    }
}