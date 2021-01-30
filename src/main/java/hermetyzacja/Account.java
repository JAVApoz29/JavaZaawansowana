package hermetyzacja;

public class Account {

    private int accountNumber;
    private int accountBalance;

    public void deposit(int a) {
        if (a < 0) {
            // wyświetl komunikat o błędzie
        } else {
            accountBalance = accountBalance = a;
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
