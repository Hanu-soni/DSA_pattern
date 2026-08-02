class Quick{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

     public static void quickSort(int[] arr,int pivot,int left,int right){
        if(left>=right){
           printarr(arr);
            return;
        }
        //do quick sort for elements on left and right;
        int i=0,j=0,k=0;
        int leftarr[]=new int[arr.length-1];
         int rightarr[]=new int[arr.length-1];
        while(left<right){
            if(arr[left]<pivot){
                leftarr[j]=arr[i];
                j++;
                System.out.println("leftarr"+leftarr);
            }
            else{
                 rightarr[k]=arr[i];
                k++;
                System.out.println("rightarr");
                printarr(rightarr);
            }
            i++;
        }
        quickSort(leftarr,leftarr[leftarr.length-1],0,leftarr.length-1);
        quickSort(rightarr,rightarr[rightarr.length-1],0,rightarr.length-1);
       
    }


    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        quickSort(arr,1,0,arr.length-1);
        printarr(arr);
        

    }
}





// Notes

// Thinking - We have an array.
// We choose one element as the Pivot.
// We place the pivot at its correct sorted position.
// All smaller elements go to the left.
// All larger elements go to the right.

// Once the pivot reaches its correct position,
// recursively sort the left part and the right part.

// quickSort(left, pivotIndex-1)
// quickSort(pivotIndex+1, right)

// ----------------------------------------------------

// Example
// [5,4,3,2,1]

// Choose last element as Pivot.
// Pivot = 1

// Compare every element with Pivot.

// 5 > 1
// 4 > 1
// 3 > 1
// 2 > 1

// No element is smaller than Pivot.

// Place Pivot at its correct position.

// Array becomes
// [1,4,3,2,5]

// Pivot 1 is now fixed.
// It will never move again.

// Left side
// []

// Right side
// [4,3,2,5]

// ----------------------------------------------------

// Recursive call on right side.

// Pivot = 5

// Compare
// 4 < 5
// 3 < 5
// 2 < 5

// Every element is smaller.

// Pivot is already at correct position.

// Array remains
// [1,4,3,2,5]

// Pivot 5 is fixed.

// Left side
// [4,3,2]

// Right side
// []

// ----------------------------------------------------

// Recursive call on
// [4,3,2]

// Pivot = 2

// Compare
// 4 > 2
// 3 > 2

// No element is smaller.

// Place Pivot in front.

// Array becomes
// [1,2,3,4,5]

// Pivot 2 is fixed.

// ----------------------------------------------------

// Recursive call on
// [3,4]

// Pivot = 4

// Compare
// 3 < 4

// Pivot already correct.

// Array remains
// [1,2,3,4,5]

// Pivot 4 fixed.

// Only one element remains.

// Base case reached.

// Final array
// [1,2,3,4,5]

// ----------------------------------------------------

// Remember

// 1. Choose a Pivot.
// 2. Put Pivot in its correct position.
// 3. Everything left of Pivot is smaller.
// 4. Everything right of Pivot is larger.
// 5. Pivot never moves again.
// 6. Repeat for left and right parts.


// https://chatgpt.com/s/m_6a6e8b70636c81918b85a002be78294c 
// recursion tree for reference