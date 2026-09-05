// 76. Minimum Window Substring
// Hard
// Topics
// premium lock icon
// Companies
// Hint
// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

// The testcases will be generated such that the answer is unique.

 

// Example 1:

// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
// Example 2:

// Input: s = "a", t = "a"
// Output: "a"
// Explanation: The entire string s is the minimum window.
// Example 3:

// Input: s = "a", t = "aa"
// Output: ""
// Explanation: Both 'a's from t must be included in the window.
// Since the largest window of s only has one 'a', return empty string.
class Solution {


     public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }


    public static String minWindow(String source, String target) {
        String result="";
         if(source.length()<target.length()){
            return result;
        }
        int[] map1=new int[256];
        int[] map2=new int[256];

        for(int i=0;i<target.length();i++){
            map1[target.charAt(i)]++;
        }
        int left=0,right=0;
        while(right<source.length()){
             map2[source.charAt(right)]++;
             
            while(isValid(map1,map2)==true && left<=right){
                 
                 if(result=="" || (right-left+1)<result.length()){
                    result=source.substring(left,right+1);
                 }
                 map2[source.charAt(left)]--;
                // map2[source.charAt(right)]++;
                 left++;
                 //right++;
            }
            right++;
           
           

        }
        return result;



        
        
    }

    public static boolean isValid(int[] map1 ,int[] map2){
        for(int i=0;i<map1.length;i++){
            if(map1[i]>map2[i]){
                return false;
            }
        }
        return true;
    }

     public static void main(String[] args){
        String str="abbcc"  ,str2="bcb";
        System.out.println(minWindow(str,str2));  
    }
}
