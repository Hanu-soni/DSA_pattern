import java.util.Arrays;
class Bubble {

    public static void main(String[] args) {

        //bubble sort
         int temp;

        int[] arr={4,5,1,2,5,7,8};

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){

                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;

                }
                   // temp=0;
            }

        }
         System.out.println(Arrays.toString(arr));

    }

}