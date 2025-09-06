class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        for(int end =0; end<n;end++){
            while( set.contains(s.charAt(end)))
            {
                set.remove(s.charAt(start));
                start++;
                
            }
            set.add(s.charAt(end));
            maxLen = Math.max(maxLen,end-start+1);
        }
        return maxLen;
        
    }
}