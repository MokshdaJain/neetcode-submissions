class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> mp=new HashSet<>();
        int left=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            while(mp.contains(s.charAt(i))){
                mp.remove(s.charAt(left));
                left++;
            }
            mp.add(s.charAt(i));
            maxLength=Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }
}
