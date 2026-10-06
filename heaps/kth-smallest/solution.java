import java.util.*;
class Klarge{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }
    public static int ksmall(int[] arr,int k){
        //initialize priority queue.
        //internally it is min heap; we convert to max-heap
        PriorityQueue<Integer> result=new PriorityQueue<>(Collections.reverseOrder());
        //store k elements in queue
        for(int i=0;i<k;i++){
            result.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<result.peek()){
                result.poll();
                result.add(arr[i]);
            }
        }
        return result.peek();


    }
    public static void main(String[] args){
        int[] arr={1,7,11,14,12,16,8,10,56,34}; 
        //printarr(arr);
        System.out.println(ksmall(arr,5));

        

    }
}