class Quick{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static void quickSort(int[] arr){
        int start=0,end=arr.length-1;
       // int pivot=arr[end];
        quickSortHelper(start,end,arr);
    }

    public static void quickSortHelper(int start, int end , int[] arr){
        if(start>=end){
            return;
        }
        int pivotIndex=partition(arr,start,end);
        quickSortHelper(start,pivotIndex-1,arr);
        quickSortHelper(pivotIndex+1,end,arr);
    }

    public static int partition(int[] arr,int start,int end){
        //[5,4,3,2,1]---->  1   
        //5<1 no, 4<1 ,no......1<=1 yes , pivotIndex still sits on 0 , swap(0-->i);
        //[1,4,3,2,5]
        //pIndex=-1   0->-2,  
        int pivotIndex=start,pivot=arr[end];
        for(int i=start;i<=end;i++){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[pivotIndex];
                arr[pivotIndex]=temp;
                pivotIndex++;
            }
        }
        return pivotIndex-1;
        

    }

    


    public static void main(String[] args){
        int[] arr={50,4,30,2,10};
        printarr(arr);
        quickSort(arr);
        printarr(arr);
        

    }
}





// Notes

// Thinking - We have an array.
// We choose one element(generally end) as the Pivot.
// We place the pivot at its correct sorted position.
// All smaller elements go to the left.
// All larger elements go to the right.
//return pivotIndex
//Repeat the same for 0->pivotIndex-1 and pivotIndex+1->right