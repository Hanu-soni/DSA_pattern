class removedup{

    public static void printarr(int[] arr,int k){
        
        System.out.print("[ ");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+(i==k-1?"":", "));
        }
        System.out.print("]");

    }

    public static int removedup(int[] arr){
        if(arr.length<=2){
            System.out.println(arr.length);
            return arr.length;
        }
        int left=2,right=arr.length-1;
        int k=2;
        while(left<=right){
            if(arr[left]!=arr[k-1] || arr[left]!=arr[k-2]){
                arr[k]=arr[left];
                k++;
            }
            left++;    
        }
        System.out.println("result arr without duplicate ...."+k);
        return k;
       
       
    }
    public static void main(String[] args){
        int[] arr={1,1,1,1,1,1}; 
        printarr(arr,arr.length);
        int k=removedup(arr);
         printarr(arr,k);
        

    }
}


//thinking approach

