class solution{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static int rotatedsearch(int[] arr , int target){
        int left=0, right=arr.length-1;

        //array fully sorted not confirmed
        //[5,6,7,1,2,3,4]...
        while(left<=right){
             int mid = left + (right - left) / 2;
            if(target==arr[mid]){
                return mid;
            }
            //which half is sorted
            else if(arr[left]<=arr[mid]){
                //left half is sorted
                if(target>=arr[left] && target<=arr[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
           else {
                //right half is sorted
                if(target>arr[mid] && target<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={6,7,8,2,3,4,5}; 
        int index=rotatedsearch(arr,5);
        System.out.println(index);
        

    }
}


//  https://www.youtube.com/watch?v=ywx-Onrdx4U