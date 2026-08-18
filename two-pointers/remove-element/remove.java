class remove{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static void remove(int[] arr,int val){
        int left=0,right=arr.length-1;
        int k=0;
        while(left<=right){
            boolean x=arr[left]==val;
           System.out.println("came herer......"+x);
           if(arr[left]!=val){
            // System.out.println("came herer");
            arr[k]=arr[left];
            k++;
           }
           left++;

        }
        System.out.println("result arr without duplicate target");
       
       
    }
    public static void main(String[] args){
        int[] arr={1,3,4,4,4,4,8}; 
        printarr(arr);
        remove(arr,4);
         printarr(arr);
        

    }
}


//thinking approach
//i have a sorted array and i want to find 2 numbers from the array which
//sums up to target.
//[1,3,4,6,8,10,11,13,14]  and target 16
// two pointer  start and end   sum them 
//1+14=15  , now this 15<target , meaning our number is more than 
//first+last  . so keep last at its position, cause we need higher number
//shift first and then try again
//3+14=17   , 17>target . meaning that our number first+last is less than
//target , so what we have summed up is actually more than what we need.
//to reduce the sum , we will reduce last by one step back.
//3+13=16 and we found the number.



// first = 0, last = n-1

// while first < last:
//     sum = arr[first] + arr[last]
    
//     if sum == target: found it!
//     else if sum < target: first++   // sum too small, need bigger, so drop smallest element and pick next one up
//     else: last--                    // sum too big, need smaller, so drop biggest element and pick next one down