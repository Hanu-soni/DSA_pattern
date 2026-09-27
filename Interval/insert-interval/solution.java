import java.util.*;
class Solution {
    public static  int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result=new ArrayList<>();

        for(int[] interval:intervals){
            //before
            if(interval[1]<newInterval[0]){
                result.add(interval);
            }
            //after
            else if(interval[0]>newInterval[1]){
                result.add(newInterval);
                newInterval=interval;
            }
            //overlapping
            else{
                newInterval[0]=Math.min(newInterval[0],interval[0]);
                newInterval[1]=Math.max(newInterval[1],interval[1]);

            }
        }
         result.add(newInterval);
        
           
        for (int[] item : result) {
    System.out.println("[" + item[0] + ", " + item[1] + "]");
}
        return result.toArray(new int[result.size()][]);



    }
     public static void main(String[] args){
        int[][] arr={{1,14},{15,18}}; 
        int[] interval={12,16};
        insert(arr,interval);
        //printarr(arr);
        

    }
}