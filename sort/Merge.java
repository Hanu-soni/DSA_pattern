class Merge{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static void merge(int[] arr ,int left,int mid, int right){
        int[] temp=new int[right-left+1];
        int i=left,j=mid+1,k=0;
        while(i<=mid && j<=right){
           
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
             k++;
        }
        while(i<=mid){
           // k++;
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right){
          //  k++;
            temp[k]=arr[j];
            j++;
            k++;
        }
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
       
    }

    

    public static void mergesort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        merge(arr,left,mid,right);

    }
    public static void main(String[] args){
        int[] arr={5,4,3,2,1}; 
        mergesort(arr,0,arr.length-1);
        printarr(arr);
    }
}



//notes
//thinking - we have an array . we divide it into 2 parts 
//we do recursively division till we meet left>=right.
//mergesort(lefthalf)
//mergesort(righthalf)
//Example - [5,4,3,2,1]
//First -  [5,4,3]  [2,1]
//Second -  [5,4] [3]  [2] [1] 
//Third -  [5]-[4] return  return return
//Fourth -  return-return return  return return
//once mergesort is done on left and right.
//go with merge()




//Generated with AI for more understanding

// Notes

// Thinking - We have an array. We divide it into 2 parts.

// We keep dividing recursively until left >= right.
// At that point there is only one element, and a single element is already sorted.

// mergeSort(leftHalf)
// mergeSort(rightHalf)

// Example
// [5,4,3,2,1]

// First division
// [5,4,3]      [2,1]

// Second division
// [5,4] [3]    [2] [1]

// Third division
// [5] [4]      [3]      [2] [1]

// Fourth division
// [5] [4]      [3]      [2] [1]
// Base case reached (left >= right), so start returning.

// ----------------------------------------------------

// Now the recursion starts coming back.

// merge([5],[4])
// Compare 5 and 4
// temp = [4,5]
// Copy temp back
// Array becomes
// [4,5] [3] [2] [1]

// ----------------------------------------------------

// merge([4,5],[3])
// Compare 4 and 3
// temp = [3]
// Right part finished
// Copy remaining left elements
// temp = [3,4,5]
// Copy back
// Array becomes
// [3,4,5] [2] [1]

// ----------------------------------------------------

// merge([2],[1])
// Compare 2 and 1
// temp = [1]
// Left element remains
// temp = [1,2]
// Copy back
// Array becomes
// [3,4,5] [1,2]

// ----------------------------------------------------

// Final merge
// merge([3,4,5],[1,2])

// Compare 3 and 1
// temp = [1]

// Compare 3 and 2
// temp = [1,2]

// Right half finished
// Copy remaining left half
// temp = [1,2,3,4,5]

// Copy temp back into original array

// Final array
// [1,2,3,4,5]

// ----------------------------------------------------

// Remember:
//
// 1. Divide until one element remains.
// 2. One element is already sorted.
// 3. While returning, merge two sorted halves.
// 4. Store merged result in temp.
// 5. Copy temp back into original array.
// 6. Repeat until the whole array becomes sorted.
