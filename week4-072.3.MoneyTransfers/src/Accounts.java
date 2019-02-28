
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account asAccount = new Account("A's account", 100);
        Account bsAccount = new Account("B's account", 0);
        Account csAccount = new Account("C's account", 0);
        
        transfer(asAccount, bsAccount, 50);
        transfer(bsAccount, csAccount, 25);
    }
    
    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
