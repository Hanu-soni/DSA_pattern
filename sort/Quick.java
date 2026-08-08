class Quick{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static void quickSort(int[] arr){
       // int pivot=arr[end];
        quickSortHelper(0,arr.length-1,arr);
    }

    public static void quickSortHelper(int start, int end , int[] arr){
        if(start>=end){
            return;
        }
        int partitionIndex=partition(arr,start,end);
        quickSortHelper(start,partitionIndex-1,arr);
        quickSortHelper(partitionIndex+1,end,arr);
    }

    public static int partition(int[] arr,int start, int end){
        int partitionIndex=start;
        int pivot=arr[end];
        int i=start;
        // 1    2    8 6 3
        //1          8 6 3
        //             3     6 8
        //                     8
        while(i<=end){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[partitionIndex];
                arr[partitionIndex]=temp;
                partitionIndex++;
                i++;
            }
            else{
                i++;
            }
           // return partiionIndex-1;
        }
        return partitionIndex-1;
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



