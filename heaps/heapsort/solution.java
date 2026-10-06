class solution{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static void swap(int[] arr , int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void heapify(int[] arr , int n , int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        System.out.println(largest+"......"+left+"........"+right);
        if(left<n &&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n &&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(arr,i,largest);
            printarr(arr);
            heapify(arr,n,largest);
        }

    }
    public static void heapsort(int[] arr){
        //convert array to heap
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        System.out.println("checking");
        printarr(arr);

        for(int j=n-1;j>=0;j--){
            swap(arr,j,0);
            heapify(arr,j,0);
        }
    }
    public static void main(String[] args){
        int[] arr={2,4,1,6,3,12}; 
        printarr(arr);
         System.out.println();
        heapsort(arr);
         System.out.println();
        printarr(arr);
        

    }
}