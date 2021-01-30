package hermetyzacja;

public class Account {

    private int accountNumber;
    private int accountBalance;

    public boolean deposit(int a) {
        if (a < 0) {
            // wyświetl komunikat o błędzie
            return false;
        } else {
            accountBalance = accountBalance = a;
            return true;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }
}
