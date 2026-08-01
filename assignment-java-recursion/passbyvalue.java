public class PassByValue {

    public static void changeNumber(int x) {
        x = 20;
    }

    public static void changeArray(int[] arr) {
        int[] arr2 = {4, 5, 6};
        arr = arr2;    
    }

    public static void main(String[] args) {

        int number = 5;
        changeNumber(number);
        System.out.println(number);

        int[] arr = {1, 2, 3};
        changeArray(arr);
        System.out.println(arr[0]);

    }
}