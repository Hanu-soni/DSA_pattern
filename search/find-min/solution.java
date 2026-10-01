class solution{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }
    public static int min(int[] arr){
        //minimum is always on left . whatever the left is at the end is min. why?
        //cause array is sorted , even if min is on right half , it gets divided into 
        //left and right , now sorted array , so left part is min.
        //for rotated sorted array , one more rule gets added. that min is in
        //unsorted part.
        int left=0, right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }
            else{
                right=mid;
            } 
        }
        return arr[left];
    }
    public static void main(String[] args){
        int[] arr={4,5,1,2,3}; 
       // printarr(arr);
        int result=min(arr);
        System.out.println("result is "+result);
        

    }
}