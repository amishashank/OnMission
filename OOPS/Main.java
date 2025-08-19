// Base class (Encapsulation)
class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Deposit method (same for all)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        }
    }

    // Withdraw method (will be overridden → polymorphism)
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Derived class (Inheritance + Polymorphism)
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Override withdraw → add restriction
    @Override
    public void withdraw(double amount) {
        if (amount > 5000) {
            System.out.println("Savings account withdrawal limit exceeded!");
        } else {
            super.withdraw(amount);
        }
    }
}

// Another derived class (Inheritance + Polymorphism)
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw → allow overdraft
    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            System.out.println(amount + " withdrawn (with overdraft allowed).");
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Objects (Classes & Objects)
        BankAccount acc1 = new SavingsAccount("Alice", 10000, 0.03);
        BankAccount acc2 = new CheckingAccount("Bob", 2000, 1000);

        // Encapsulation (balance accessed via getter)
        System.out.println(acc1.getAccountHolder() + " Balance: " + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + " Balance: " + acc2.getBalance());

        // Polymorphism (different withdraw behaviors)
        acc1.withdraw(6000); // SavingsAccount restriction
        acc2.withdraw(2500); // CheckingAccount allows overdraft
    }
}

/* 
 * Class & Object → BankAccount acc1 = new SavingsAccount(...);

Inheritance → SavingsAccount and CheckingAccount extend BankAccount.

Polymorphism → withdraw() behaves differently depending on account type.

Encapsulation → balance is private, accessed only via getBalance() and controlled methods.
 */
