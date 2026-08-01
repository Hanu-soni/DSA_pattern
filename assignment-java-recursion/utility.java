public class MathUtils {

    public static int square(int n) {
        return n*n;
      

    }

    public static int cube(int n) {
          return n*n*n;

    }

    public static boolean isEven(int n) {
         if(n%2==0){
         return true;
}
     else{
         return false; 
       }
    }

    public static int max(int a, int b) {

        if(a>b){
            return a;
        }
        else if(a<b){
            return b;
        }
        else{
            return -1;
        }

    }

    public static void main(String[] args) {

        System.out.println(square(5));      // 25
        System.out.println(cube(3));        // 27
        System.out.println(isEven(10));     // true
        System.out.println(max(8, 3));      // 8

    }
}

