package section8.autoboxing112unboxing;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branchList;
    private String name;

    public Bank(String bankName) {
        this.name = bankName;
        this.branchList = new ArrayList<Branch>();
    }
    public Bank(){}


    public String getName() {
        return name;
    }

    public boolean addBranch(Branch branch) {
        if (findBranch(branch.getNameOfBranch()) >= 0) {
            return false;
        }
        branchList.add(branch);
        return true;
    }

    public boolean addCustomerBranch(String branchName, String customerName) {
        return branchList.get(findBranch(branchName)).addCustomer(customerName);
    }

    public int findBranch(String name) {
        for (int i = 0; i < this.branchList.size(); i++) {

            if (branchList.get(i).getNameOfBranch().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addTransactionBranch(String name, String branchName, double amount){
        return branchList.get(findBranch(branchName)).addTransaction(name,amount);
    }

    public void showCustomerListBranch(String branchName){
        branchList.get(findBranch(branchName)).printCustomers();
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
}
