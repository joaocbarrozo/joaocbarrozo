public class recursion {
    public static long factorial(int n) {
        if ( n < 0){
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static long fibonacci(int n) {
        if ( n < 0){
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(20));
        System.out.println();
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(10));
    }
}
