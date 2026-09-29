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

        while(left<=right){
            int mid=(left+right)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,7,8,12,19,24}; 
        int index=binarysearch(arr,24);
        System.out.println(index);
        

    }
}


//  https://www.youtube.com/watch?v=ywx-Onrdx4U