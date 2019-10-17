package section8.mobilePhone.secondSolution;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("511 737 508");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        printMenu();
        while (!quit) {
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    mobilePhone.printContacts();
                    printMenu();
                    break;
                case 2:
                    addNewContact();
                    printMenu();
                    break;
                case 3:
                    updateContact()g;
                    printMenu();
                    break;
                case 4:
                    removeContact();
                    printMenu();
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }
    }


    private static void removeContact() {
        System.out.println("Enter name to update:");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if(oldContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + oldContact.getName() + " phone number is: " + oldContact.getNumber());
        if(mobilePhone.removeContact(oldContact)){
            System.out.println("Contact removed succesfully!");
        }else {
            System.out.println("Contact not removed");
        }
    }

    private static void addNewContact() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter number:");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();
        Contact newContact = Contact.addContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
        } else {
            System.out.println("Cannot add " + name + ", already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing name contact:");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if(oldContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number:");
        int newNumber = scanner.nextInt();
        Contact newContact = Contact.addContact(newName,newNumber);
        if(mobilePhone.updateContact(oldContact,newContact)){
            System.out.println("Succesfully updated!");
        }else {
            System.out.println("Update Abborted!");
        }


    }

    private static void printMenu() {

        System.out.println("--MENU--");
        System.out.println("1 - print list of contacts\n" +
                "2 - add new contact\n" +
                "3 - update contact\n" +
                "4 - remove contact\n" +
                "5 - search/find contact\n" +
                "6 - query if existing contact exists\n" +
                "0 - quit\n");
        System.out.println("Select your choice: ");
    }


}
