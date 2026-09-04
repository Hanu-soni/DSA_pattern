// Longest Repeating Character Replacement

class Solution {
    public int characterReplacement(String s, int k) {
        //window-maxFreq<=k  , we are good to go
        int[] freq=new int[26];
        int left=0,maxLen=0,maxFreq=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            while((right-left+1)-maxFreq>k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen=Math.max(right-left+1,maxLen);
        }
        return maxLen;


        
    }
}