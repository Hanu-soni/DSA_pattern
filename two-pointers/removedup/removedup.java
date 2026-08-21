class removedup{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static void removedup(int[] arr){
         if(arr.length<=1){
            System.out.println(arr.length);
            return;
        }
        int left=1,right=arr.length-1;
        int k=1;
        while(left<=right){
            if(arr[left]!=arr[k-1]){
                arr[k]=arr[left];
                k++;
            }
            left++;    
        }
        System.out.println("result arr without duplicate ...."+k);
       
       
    }
    public static void main(String[] args){
        int[] arr={1,1,1,1,1,1}; 
        printarr(arr);
        removedup(arr);
         printarr(arr);
        

    }
}


//thinking approach

