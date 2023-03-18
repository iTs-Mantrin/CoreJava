package JavaExamples;

import java.util.Scanner;

import static java.lang.System.exit;

public class BankManagementPractice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("*********** Bank Portal ***********");
        System.out.print("Enter Customer Name:");
        String name = sc.nextLine();
        System.out.print("Enter Customer Id:");
        String customerId = sc.nextLine();
        BankAccount customer = new BankAccount(name, customerId);
        customer.menu();

    }
}

class BankAccount{
    double balance;
    double prevTrans;
    String customerName;
    String customerId;

    BankAccount(String customerName, String customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(double amount){
            if(amount!=0){
                balance += amount;
                prevTrans = -amount;
            }
    }
    void withdraw(double amount){
        Scanner sc = new Scanner(System.in);
        if(amount != 0 && balance >= amount){
            balance -= amount;
            prevTrans = amount;
        }
        else if (balance < amount){
            if (balance <= 0){
                System.out.println("Bank balance insufficient\n");
                System.out.println("Current Balance:" + balance);
            }
            else if (balance > 0) {
                System.out.println("Bank balance insufficient\n");
                System.out.println("Current Balance:" + balance);
                System.out.println("Please Enter Amount up to " + balance + ":");
                System.out.print("Enter a Amount to withdraw:");
                amount = sc.nextDouble();
                withdraw(amount);
            }
        }
    }

    void getPrevTrans(){
        if(prevTrans > 0){
            System.out.println("Previous transaction:");
            System.out.println("\nDeposited:" + prevTrans);
        }
        else if( prevTrans < 0) {
            System.out.println("Previous transaction:");
            System.out.println("\nWithdraw:" + prevTrans);
        }
        else {
            System.out.println("Transaction not found...!");
        }
    }

    void menu(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Customer Id:" + customerId);
        System.out.println("Current Balance:" + balance);
        System.out.print("\n");
        do{
            System.out.println("******************************");
            System.out.println("||\t.......Menu......\t\t||");
            System.out.println("||\t1. Check Balance\t\t||");
            System.out.println("||\t2. Deposit Amount\t\t||");
            System.out.println("||\t3. Withdraw Amount\t\t||");
            System.out.println("||\t4. Previous Transaction\t||");
            System.out.println("||\t5. Exit\t\t\t\t\t||");
            System.out.println("******************************");
            option = sc.next().charAt(0);

            switch (option){
                case '1':
                    System.out.println("******************************");
                    System.out.println("Customer Name:" + customerName);
                    System.out.println("Customer Id:" + customerId);
                    System.out.println("Current Balance:" + balance);
                    System.out.println("******************************");
                    break;
                case '2':
                    System.out.println("******************************");
                    System.out.println("Customer Name:" + customerName);
                    System.out.println("Customer Id:" + customerId);
                    System.out.print("Enter a Amount to deposit:");
                    double amt = sc.nextDouble();
                    deposit(amt);
                    System.out.println("******************************");
                    break;
                case '3':
                    System.out.println("******************************");
                    System.out.println("Customer Name:" + customerName);
                    System.out.println("Customer Id:" + customerId);
                    System.out.print("Enter a Amount to withdraw:");
                    amt = sc.nextDouble();
                    withdraw(amt);
                    System.out.print("\n");
                    System.out.println("******************************");
                    break;
                case '4':
                    System.out.println("******************************");
                    System.out.println("Customer Name:" + customerName);
                    System.out.println("Customer Id:" + customerId);
                    getPrevTrans();
                    System.out.println("******************************");
                    break;
                case '5':
                    System.out.println("Do you want to Exit(Y/N):");
                    option = sc.next().charAt(0);
                    if(option == 'Y' || option =='y'){
                        exit(0);
                    }
                    else {
                        menu();
                    }
                    break;
                default:
                    System.out.println("NA");
                    break;
            }
            System.out.println("\nDo you want to continue(Y/N):");
            option = sc.next().charAt(0);
        }
        while (option == 'Y' || option == 'y');




    }
}
