package section8.autoboxing112unboxing;

import java.util.ArrayList;

public class Branch {

    public static ArrayList<Customer> clients;
    private String nameOfBranch;

    public Branch(String nameOfBranch) {
        this.nameOfBranch = nameOfBranch;
        clients = new ArrayList<>();
    }
    public Branch(){
    }

    public String getNameOfBranch() {
        return nameOfBranch;
    }

    public void printCustomers() {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println((i + 1) + "Client name : " + clients.get(i).getClientName());

        }
    }


    private boolean ClientAlreadyExists(String name) {

        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getClientName().equals(name))
                return true;
        }
        return false;
    }

    public ArrayList<Customer> getClients() {

        for (int i = 0; i <clients.size() ; i++) {
            System.out.println(clients.get(i).getClientName());
        }

        return clients;
    }

    public boolean addCustomer(String customerName) {
        if (ClientAlreadyExists(customerName)) {
            return false;
        } else {
            this.clients.add(Customer.createCustomer(customerName));
            return true;
        }
    }

    public boolean addTransaction(String customerName, double initialAmount) {
        if (ClientAlreadyExists(customerName)) {
            Customer customer = new Customer();
            customer.addTransaction(initialAmount);
            this.clients.add(customer);
        }
        return false;
    }


    // You job is to create a simple banking application.
////        // There should be a Bank class
////        // It should have an arraylist of Branches
////        // Each Branch should have an arraylist of Customers
////        // The Customer class should have an arraylist of Doubles (transactions)
////        // Customer:
////        // Name, and the ArrayList of doubles.
////        // Branch:
////        // Need to be able to add a new customer and initial transaction amount.
////        // Also needs to add additional transactions for that customer/branch
////        // Bank:
////        // Add a new branch
////        // Add a customer to that branch with initial transaction
////        // Add a transaction for an existing customer for that branch
////        // Show a list of customers for a particular branch and optionally a list
////        // of their transactions
////        // Demonstration autoboxing and unboxing in your code
////        // Hint: Transactions
////        // Add data validation.
////        // e.g. check if exists, or does not exist, etc.
////        // Think about where you are adding the code to perform certain actions
}
