import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * This documents bank account type.
     */
    public enum BankAccountType {
        /** checkings account. */
        CHECKINGS,
        /** savings account. */
        SAVINGS,
        /** student account. */
        STUDENT,
        /** workplace account. */
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public void setAccountNumber(int num) {
        this.accountNumber = num;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setBalance(double amount) {
        accountBalance = amount;
    }
    public double getBalance() {
        return accountBalance;
    }
    public void setOwnerName(String name) {
        ownerName = name;
    }
    public String getOwnderName() {
        return ownerName;
    }
    public void setInterestEarner(double earned) {
        interestEarned = earned;
    }
    public double getInterestEarned() {
        return interestEarned;
    }
}