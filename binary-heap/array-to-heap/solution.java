class arraytoheap{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }
    public static void heap(int[] arr){
        int n=arr.length;
        int[] heap=new int[n];
        //List<Integer> heap=new ArrayList<>();
        
        for(int i=1;i<n;i++){
            //formula  parent - i/2 left- i*2 and right i*2+1;
            int largest=i,left=i*2,right=i*2+1;
            if(left<n && arr[left]>arr[largest]){
                largest=left;
            }
            if(right<n && arr[right]>arr[largest]){
                largest=right;
            }
            if(largest!=i){
                int a=arr[largest];
                arr[largest]=arr[i];
                arr[i]=a;
            }
        }
        

    }
    public static void main(String[] args){
        int[] arr={5,4,3,2,1}; 
        printarr(arr);
        heap(arr);
        printarr(arr);
        

    }
}



//this is incomplete . will do it ....