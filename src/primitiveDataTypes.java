public class primitiveDataTypes{
    public static void main(String[] args) {
        byte by = 0;
        char c = 0;
        short s = 0;
        int i = 0;
        long l = 0L;

        float f = 0.0f;
        double d = 0.0;

        boolean b1 = true;
        boolean b2 = false;

        //protect aganist implicity lossy convertion

        int i1 = 256;
        short s1 = (short) i1;


    }
}