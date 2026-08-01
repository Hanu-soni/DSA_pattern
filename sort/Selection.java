import java.util.Arrays;
class Bubble {

    public static void main(String[] args) {

        //bubble sort
         int temp;

        int[] arr={4,5,1,2,5,7,8};

        for(int i=0;i<arr.length-1;i++){
            let min=i;

            for(int j=i+1;j<arr.length;j++){

                if(arr[j]<arr[min]){
                        min=j;
                }
                   // temp=0;
            }
            //swap i with j
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
         System.out.println(Arrays.toString(arr));

    }

}