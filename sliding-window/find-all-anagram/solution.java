// Given two strings s and p, return an array of all the start indices of p's
//  anagrams in s. You may return the answer in any order.

 

// Example 1:

// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".
// Example 2:

// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".




class Solution {


     public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }
    public List<Integer> findAnagrams(String source, String target) {
        List<Integer> result=new ArrayList<>();
        if(source.length()<target.length()){
            return result;
        }
        int[] map1=new int[26];
        int[] map2=new int[26];
         
        //calculate freq of target
        for(int i=0;i<target.length();i++){
            map1[target.charAt(i)-'a']++;
        }
        for(int i=0;i<target.length();i++){
            map2[source.charAt(i)-'a']++;
        }
        //sliding window start
        int left=0,right=target.length();
        while(right<source.length()){
            if(isValid(map1,map2)==true){
                result.add(left);
            }       
            map2[source.charAt(left)-'a']--;
             map2[source.charAt(right)-'a']++;
              left++;
              right++;
        }
        if(isValid(map1,map2)){
            result.add(left);
        }

        return result;





        
    }

    public boolean isValid(int[] map1 ,int[] map2){
        for(int i=0;i<map1.length;i++){
            if(map1[i]!=map2[i]){
                return false;
            }
        }
        return true;
    }

     public static void main(String[] args){
        int[] arr={5,4,3,2,1}; 
        printarr(arr);
        

    }
}