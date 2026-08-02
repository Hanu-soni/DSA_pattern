class Insertion{
    public static void insertionsort(int[] arr){
        for(int j=1;j<arr.length;j++){
            int curr=arr[j];
            int prev=j-1;
            while(prev>=0 && arr[prev]>curr){
                
                 arr[prev+1]=arr[prev];
                 prev--;
                 //arr[j]=arr[temp];
        }
        arr[prev+1]=curr;
       // System.out.println("this is loop "+ j);
        printarr(arr);
            }
           // int temp=arr[prev+1];
           
    }

    public static void printarr(int[] arr){
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");
    }
    public static void main(String[] args){
        int[] arr={5,4,3,2,1}; 
        insertionsort(arr);
        printarr(arr);
        

    }
}






//notes
//thinking - fix curr to arr[1]
//check pre>curr until pre becomes -1 meaning  from 0--->0 1--->0 2->0 and so check numbers greater than curr
//if yes , then move them one step forward by arr[prev+1]=arr[prev]

// Initial Array
// [5,4,3,2,1]

// ---------------------------------------------------
// i = 1

// curr = 4
// prev = i-1 = 0

// while(prev>=0 && arr[prev]>curr)

// 5 > 4 && 0>=0  -> YES

// store arr[prev] into arr[prev+1]

// [5,5,3,2,1]

// prev--

// prev = -1

// while(-1>=0) -> NO

// store curr at arr[prev+1]

// arr[0] = 4

// Result:

// [4,5,3,2,1]

// ---------------------------------------------------
// i = 2

// curr = 3

// prev = 1

// 5 > 3 && 1>=0 -> YES

// Shift 5

// [4,5,5,2,1]

// prev = 0

// 4 > 3 && 0>=0 -> YES

// Shift 4

// [4,4,5,2,1]

// prev = -1

// Stop while

// Store curr at arr[0]

// [3,4,5,2,1]

// ---------------------------------------------------
// i = 3

// curr = 2

// prev = 2

// 5 > 2 -> YES

// Shift 5

// [3,4,5,5,1]

// prev = 1

// 4 > 2 -> YES

// Shift 4

// [3,4,4,5,1]

// prev = 0

// 3 > 2 -> YES

// Shift 3

// [3,3,4,5,1]

// prev = -1

// Stop

// Store curr at arr[0]

// [2,3,4,5,1]

// ---------------------------------------------------
// i = 4

// curr = 1

// prev = 3

// 5 > 1 -> YES

// Shift 5

// [2,3,4,5,5]

// prev = 2

// 4 > 1 -> YES

// Shift 4

// [2,3,4,4,5]

// prev = 1

// 3 > 1 -> YES

// Shift 3

// [2,3,3,4,5]

// prev = 0

// 2 > 1 -> YES

// Shift 2

// [2,2,3,4,5]

// prev = -1

// Stop

// Store curr at arr[0]

// [1,2,3,4,5]

// ---------------------------------------------------

// Final Sorted Array

// [1,2,3,4,5]

//i=2;