//  For each day, return how many days until a strictly warmer temperature; use 0 if none.
// Example: [73,74,75,71,69,72,76,73] → [1,1,4,2,1,1,0,0]


import java.util.*;

public class Main {



    public static void printarr(int[] arr){
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }


    public static int[] temperature(int[] arr){
      int index=0;
      //find next greater for each element.
      //if yes , add diff . else 0
      int[] result=new int[arr.length];
      for(int i=0;i<arr.length-1;i++){
        //compare one with prev - if greater than diff
        for(int j=i+1;j<arr.length;j++){
          if(arr[j]>arr[i]){
            result[index]=j-i;
            index++;
            break;
          }
        }
       
      }
      result[index]=0;
      return result;
    }


    //use max-stack
    public static void main(String[] args) {

      int[] arr={73,74,75,71,69,72,76,73};
      int[] result=temperature(arr);
      printarr(result);
      //System.out.println(result+"Hello, World!");
    }
}