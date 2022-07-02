public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        a1.setNumber("1234-5");
        a2.setNumber("5678-x");
        a3.setNumber("3-0");

        System.out.println(a1);
        Account.bank = "abc";
        System.out.println(a2);
        System.out.println(a3);
    }
}
