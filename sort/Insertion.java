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
//check pre>curr until pre becomes -1 meaning  from 0--->0 check numbers greater than curr
//if yes , then move them one step forward by arr[prev+1]=arr[prev]

//[5,4,3,2,1]
//