// Given an integer array nums and an integer k, 
// return true if there are two distinct indices i and j in 
// the array such that nums[i] == nums[j] and abs(i - j) <= k.


// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

import java.util.*;
class Solution{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static boolean duplicate(int[] arr , int k){
        int left=0,right=0;
        HashSet<Integer> set = new HashSet<>();
        while(right<arr.length){
            if(set.contains(arr[right])){
                if(set.size()<=k){
                    return true;
                }
            }
            set.add(arr[right]);
            if(set.size()>k){
                set.remove(arr[right-k]);
            }
            right++;

        }
        return false;

    }
    public static void main(String[] args){
        int[] arr={1,0,1,1}; 
        System.out.println(duplicate( arr,1));
        //System.out.println(duplicate( [1,2,3,1,2,3],2));
        //System.out.println(duplicate( [1,0,1,1], 1));
        printarr(arr);
        

    }
}