package section8.autoboxing112unboxing;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank("Santander");

    public static void main(String[] args) {

        showOptions();

        boolean quit = false;
        int menu = scanner.nextInt();
        while (!quit) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    showOptions();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addClient();
                    break;
                case 4:
                    addTransaction();
                    break;
                case 5:
                    showContactList();
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }
    }

    public static void showOptions() {
        System.out.println("\n Please choose option below:");
        System.out.println("\t 1 - show options");
        System.out.println("\t 2 - add branch");
        System.out.println("\t 2 - add customer");
        System.out.println("\t 3 - add transaction");
        System.out.println("\t 4 - show customers list");
        System.out.println("\t 0 - quit");
    }

    private static void showContactList() {
        System.out.println(" Choose branch :");
        String branchName = scanner.nextLine();

        if (bank.findBranch(branchName) != -1) {
            bank.showCustomerListBranch(branchName);
        } else {
            System.out.println("Cannot find a " + branchName + " branch.");
        }
    }

    private static void addTransaction() {
        System.out.println("Choose branch :");
        String branchName = scanner.nextLine();

        if (bank.findBranch(branchName) != -1) {
            System.out.println("Choose customer :");
            String name = scanner.nextLine();
            if (!bank.addCustomerBranch(branchName, name)) {
                System.out.println("Choose amount :");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                bank.addTransactionBranch(name, branchName, amount);
                System.out.println("Customer : " + name + " ,from " + branchName
                        + " branch , added " + amount);
            } else {
                System.out.println("Cannot find customer : " + name + " on the " + branchName + " branch");
            }
        }
    }

    private static void addBranch() {
        System.out.println("Choose branch: ");
        String branchName = scanner.nextLine();
        Branch newBranch = new Branch(branchName);

        if (bank.addBranch(newBranch)) {
            System.out.println("branch " + branchName + " added to the list");
        } else {
            System.out.println("cannot add, " + branchName + " already exists");
        }
    }

    private static void addClient() {
        System.out.println("Choose branch : ");
        String branchName = scanner.nextLine();

        if (bank.findBranch(branchName) != -1) {
            System.out.println("Enter new customer name :");
            String name = scanner.nextLine();
            bank.addCustomerBranch(branchName, name);
            System.out.println("Customer : " + name + " added to branch : " + branchName);
        } else {
            System.out.println("Branch not exists");
        }
    }
}


//    	     You job is to create a simple banking application.
//         There should be a Bank class
//         It should have an arraylist of Branches
//         Each Branch should have an arraylist of Customers
//         The Customer class should have an arraylist of Doubles (transactions)
//         Customer:
//         Name, and the ArrayList of doubles.
//         Branch:
//         Need to be able to add a new customer and initial transaction amount.
//         Also needs to add additional transactions for that customer/branch
//         Bank:
//         Add a new branch
//         Add a customer to that branch with initial transaction
//         Add a transaction for an existing customer for that branch
//         Show a list of customers for a particular branch and optionally a list
//         of their transactions
//         Demonstration autoboxing and unboxing in your code
//         Hint: Transactions
//         Add data validation.
//         e.g. check if exists, or does not exist, etc.
//         Think about where you are adding the code to perform certain actions

