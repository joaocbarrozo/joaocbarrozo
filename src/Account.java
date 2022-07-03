public class Account {
    private String number; // Instance variable
    static final String bank = "xyz";

    /**
     * Default constructor
     */
    public Account(){
        System.out.println(String.format("Object %s was created", System.identityHashCode(this)));
        this.number = "0"; 
    }
    //Overload constructor
    public Account(String number){
        setNumber(number);
    }

    /**
     * The account format is formed by two parts separeted by hyphen: 
     * the first part is composed by at least one digit and the second
     * is composed by a single digit oe x or X
     * e.g.12345-6 567-X
     * @param number the account number
     */
    private void validateNumber(String number){
        final String pattern = "\\d+-(\\d|x|X)";
     
        if(!number.matches(pattern)){
            throw new IllegalArgumentException("Invalid account number");
        }
    }

    /**
     * Getter for account number
     * @return the account number
     */
    public String getnumber(){
        return number;
    }
    /**
     * Setter for account number
     
     * @param number number to set in the account
     */
    public void setNumber(String number){
        validateNumber(number);
        this.number = number;
    }

    public String toString(){
        return "Account number: "+ number +"\n" + "Bank: " + Account.bank;
    }
}