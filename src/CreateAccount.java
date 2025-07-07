public class CreateAccount {
    public static void main(String[]args)
    {
        Account chelseaAccount = new Account();
        chelseaAccount.AccountNo = 1423;
        chelseaAccount.AccountName = "chelsea";
        chelseaAccount.balance = 500;

        System.out.println("AccountNo" + chelseaAccount.AccountNo + "AccountName" +chelseaAccount.AccountName);

    }
}
