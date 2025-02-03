import java.util.Scanner;

class ATM {
    float balance;
    int PIN = 5678;

    public void checkPin() {
        System.out.println("Enter PIN: ");
        Scanner scanner = new Scanner(System.in);
        int enteredPIN = scanner.nextInt();
        if (enteredPIN == PIN) {
            System.out.println("PIN is valid!!!");
            menu();
        } else {
            System.out.println("PIN is not valid!!!");
            System.out.println("Enter PIN again: ");
        }
    }

    public void menu() {
        System.out.println("Welcome to ATM Machine Management App!!!");
        System.out.println("Enter your choice: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                checkBalance();
            case 2:
                withdraw();
            case 3:
                deposit();
            case 4:
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public void deposit() {
        System.out.println("Enter Amount To Deposit: ");
        Scanner scanner = new Scanner(System.in);
        float enteredAmount = scanner.nextFloat();
        System.out.println("Your Balance Before Deposit Is: " + balance);
        balance = balance + enteredAmount;
        System.out.println("Money Deposit Successful");
        System.out.println("Your Balance After Deposit is: " + balance);

        menu();
    }

    public void withdraw() {
        System.out.println("Enter Amount To Withdraw: ");
        Scanner scanner = new Scanner(System.in);
        float enteredAmount = scanner.nextFloat();
        System.out.println("Your Balance Before Withdrawal is: " + balance);
        if (enteredAmount > balance) {
            System.out.println("Insufficient Balance");
            System.out.println("Money Withdrawal Unsuccessful");
        }else{
            balance = balance - enteredAmount;
            System.out.println("Money Withdrawal Successful");
            System.out.println("Your Balance After Withdrawal Is: " + balance);
        }
        menu();
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
        menu();
    }
}
public class ATMMachine{
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}

