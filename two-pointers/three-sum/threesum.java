class twosum{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static void threesum(int[] arr,int target){
       
      for(int i=0;i<arr.length;i++){
          int newtarget=target-arr[i];
           int left=i+1,right=arr.length-1;
          while(left<right){
            if(arr[left]+arr[right]==newtarget){
               System.out.println("indexes are : "+i+"...."+ left+"..."+right);
               return;
            }
            else if(arr[left]+arr[right]<newtarget){
                left++;
            }
             else{
                right--;
            }

        }
      }
        System.out.println("target not found");
       
    }
    public static void main(String[] args){
        int[] arr={1,3,4,4,4,4,8,8,8}; 
        //printarr(arr);
        threesum(arr,24);
        

    }
}


//[1,2,3,4,5]   5
//  8-1=7    twosum 7  
//outer loop -normal array
// 1--end  , 2-end  , 3-end.....
//basically we are following same two sum concept .
//Its just that we keep arr[i]  fix and do sum for remaining.
