public class Account {
    public int AccountNo;
    public String AccountName;
    public double balance;

    public void deposit (double amount){
        balance = balance + amount;
    }

}
