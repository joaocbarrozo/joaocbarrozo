public class HelloString{
    public static void main(String[] args) {
        //declaration
        String s;

        //instanciation
        s = new String("Hello WOrld");

        //acess the API of the object
        char c = s.charAt(4);

        System.out.println(c);

        String s1 = new String("cat");
        System.out.println(System.identityHashCode(s1));
        String s2 = new String("dog");
        System.out.println(System.identityHashCode(s2));
        String s3 = new String("cat");
        System.out.println(System.identityHashCode(s3));
    }
}