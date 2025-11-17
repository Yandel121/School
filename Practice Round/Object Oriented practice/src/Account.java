public class Account {
    private int balance;
    private String accountNumber;
    public Account(int balance, String accountNumber){
        boolean hasError=false;
        if(accountNumber== null || accountNumber.isEmpty()){
            System.err.println("Error:Account Number cannot be empty");
            hasError=true ;
        }

        if(balance < 0){
            System.err.println("Error:Balance cannot be negative");
            hasError=true;
        }
        if(!hasError){
            this.balance=balance;
            this.accountNumber=accountNumber;
        }
    }
    public int getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public static void main(String[] args){
        Account account=new Account(1000,"123456789");
        System.out.println("Account 1 Balance: "+account.getBalance());
        System.out.println("Account 1 Account Number: "+account.getAccountNumber());

        Account account2=new Account(-1, "");



    }
}
