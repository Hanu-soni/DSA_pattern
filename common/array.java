class give_name{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }
    public static void main(String[] args){
        int[] arr={5,4,3,2,1}; 
        printarr(arr);
        

    }
}