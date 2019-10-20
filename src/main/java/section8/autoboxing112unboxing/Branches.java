package section8.autoboxing112unboxing;

import java.util.ArrayList;

public class Branches {

    private String name;
    private ArrayList<Customer> customers;


    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    public Branches(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public boolean addNewCustomer(String customerName, double amount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(name, amount));
            return true;
        } else {

        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (findCustomer(customerName) == null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size() ; i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }return null;
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
