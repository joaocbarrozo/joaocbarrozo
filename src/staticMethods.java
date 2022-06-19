public class staticMethods {
    public static long abs (long x) {
        return (x < 0) ? -x : x;
    }
    /**
     * calcula a potência de base b e expoente e
     * Com ambos positivos
     * @param b base
     * @param e expoente
     * @return b elevado a e
     */
    public static long power (long b, long e){
        long p = 1;
        for (int i = 0; i < e; i++){
            p *= b;
        }
        return p;
    }
    /**
     * Calcula a potencia de base b e expoente e
     * ambos inteiros
     * @param b base
     * @param e expoente
     * @return b elevado a e
     */
    public static long power2 (long b, long e){
        if (b == 0 && e < 0){
            throw new UnsupportedOperationException("zero raised to negative exponent is undefined");
        }
        if (e >= 0){
            return power(b, e);
        }
        else {
            return (long) (1.0 / power(b, abs(e)));
        }

    }
    public static void main(String[] args) {
        System.out.println(abs(-1));
        System.out.println(abs(1));
        System.out.println(abs(-1));

        System.out.println();

        System.out.println(power(0, 10));
        System.out.println(power(10, 0));
        System.out.println(power(0, 0));
        System.out.println(power(10, 3));
        System.out.println(power(2, 8));
        System.out.println(power(-2, -7));
        System.out.println(power2(0, -3));
    }
}
