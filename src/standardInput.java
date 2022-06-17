import java.util.Scanner;

public class standardInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        long b = scan.nextLong();
        float c = scan.nextFloat();
        double d = scan.nextDouble();
        boolean b1 = scan.nextBoolean();

        String s = scan.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b1);
        System.out.println(s);
    }
}
