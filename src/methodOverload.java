public class methodOverload {
    public static long abs (long x) {
        System.out.println("long version");
        return (x < 0) ? -x : x;
    }
    public static int abs (int x) {
        System.out.println("int version");
        return (x < 0) ? -x : x;
    }
    public static short abs (short x) {
        System.out.println("short version");
        return (x < 0) ? (short)-x : x;
    }
    public static double abs (double x) {
        System.out.println("double version");
        return (x < 0) ? -x : x;
    }
    public static float abs (float x) {
        System.out.println("float version");
        return (x < 0) ? -x : x;
    }
    public static void main(String[] args) {
        System.out.println(abs(-1));
        System.out.println(abs(-1L));
        System.out.println(abs((short)-1));
        System.out.println(abs(-1.0));
        System.out.println(abs(-1.0f));
    }
}
