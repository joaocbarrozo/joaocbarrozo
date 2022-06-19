public class strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "world";

        String s3 = s1 + " " + s2;
        System.out.println(s3);
        System.out.println();

        // implicit number conversion
        System.out.println("bloco " + 1);
        System.out.println("versão " + 2.5);
        System.out.println();

        String si = "10";
        String sd = "22.34";
        System.out.println(si + 1);
        System.out.println(sd + 0.1);
        System.out.println();

        int i = Integer.parseInt(si);
        double d = Double.parseDouble(sd);

        System.out.println(i + 1);
        System.out.println(d + 0.1);
        System.out.println();

        System.out.println(sd.length());
    }
}
