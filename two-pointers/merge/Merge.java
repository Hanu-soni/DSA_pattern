class Merge{


    public static int[] merge(int[] arr , int[] arr2){
        int i=0,j=0,k=0;
        int[] result=new int[arr.length+arr2.length];
        while(i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]){
                result[k]=arr[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr.length){
            System.out.println(i +"....i reached here");
            result[k]=arr[i];
            i++;
            k++;
        }
         while(j<arr2.length){
            result[k]=arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }
    public static void main(String[] args){
        int[] arr={2,4,6}; 
        int[] arr2={1,3,5,8,10,12,14}; 
        //printarr(arr);
        int[] result=merge(arr,arr2);
       // System.out.println(result,"........");
       printarr(result);
        

    }
}