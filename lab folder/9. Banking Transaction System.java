
public class BankingTransactionSystem {

    static double balance = 5000.00;

    static void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    static void checkBalance() {
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public static void main(String[] args) {
        checkBalance();

        deposit(2000);
        checkBalance();

        withdraw(1500);
        checkBalance();

        withdraw(10000);
        checkBalance();
    }
}


Current Balance: 5000.00
Deposited: 2000.0
Current Balance: 7000.00
Withdrawn: 1500.0
Current Balance: 5500.00
Insufficient Balance
Current Balance: 5500.00
