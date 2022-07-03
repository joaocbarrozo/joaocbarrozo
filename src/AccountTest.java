public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("1234-5");
        Account a2 = new Account("5678-x");
        Account a3 = new Account("3-0");
        Account a4 = new Account();

        //a1.setNumber();
        //a2.setNumber();
        //a3.setNumber();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
