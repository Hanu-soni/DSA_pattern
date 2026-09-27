// Given an array of intervals where intervals[i] = [starti, endi], 
// merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
// Example 2:

// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.
// Example 3:

// Input: intervals = [[4,7],[1,4]]
// Output: [[1,7]]
// Explanation: Intervals [1,4] and [4,7] are considered overlapping.


import java.util.*;
class solution{

    public static void printarr(int[][] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static int[][] interval(int[][] interval){
        //make it sorted
        Arrays.sort(interval,(a,b)->a[0]-b[0]);
        List<int[]> result=new ArrayList<>();
        
        result.add(interval[0]);

        for(int i=1;i<interval.length;i++){
            int curr[]=interval[i];
            int last[]=result.get(result.size()-1);
            if(curr[0]<=last[1]){
                
                last[1]=Math.max(curr[1],last[1]);
            }
            else{
                result.add(curr);
            }
            
            //last=curr[i];
        }
        for (int[] item : result) {
    System.out.println("[" + item[0] + ", " + item[1] + "]");
}
        return result.toArray(new int[result.size()][]);


    }
    public static void main(String[] args){
        int[][] arr={{1,14},{2,6},{8,10},{15,18}}; 
        interval(arr);
        //printarr(arr);
        

    }
}