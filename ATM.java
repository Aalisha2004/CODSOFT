package ATMProject.src;
import java.util.*;

public class ATM{

    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account){
        this.account=account;
        this.scanner=new Scanner(System.in);
    }

    public void start(){
        while(true){
            System.out.println("\nATM Machine Interface:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice=scanner.nextInt();

            switch(choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private void checkBalance(){
        System.out.println("Your current balance is: "+account.getBalance());
    }

    private void deposit(){
        System.out.print("Enter the amount to deposit: ");
        double amount=scanner.nextDouble();
        if(amount>0){
            account.deposit(amount);
            System.out.println("Successfully deposited: "+amount);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }

    private void withdraw(){
        System.out.print("Enter the amount to withdraw: ");
        double amount=scanner.nextDouble();
        if(amount>0 && account.getBalance()>=amount){
            account.withdraw(amount);
            System.out.println("Successfully withdrew: "+amount);
        }else if(amount<=0){
            System.out.println("Invalid withdrawal amount.");
        }else{
            System.out.println("Insufficient balance for the withdrawal.");
        }
    }
}
