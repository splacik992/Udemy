package section8.mobilePhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    showAllContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }

    }

    private static void findContact() {
        System.out.println("Enter name of contact :");
        String searchContact = scanner.nextLine();
        if(contacts.fintContact(searchContact) !=null){
            System.out.println("Found " + searchContact + " in the contact list!");
        }else {
            System.out.println(searchContact + " is not in the list!");
        }
    }

    private static void modifyContact() {
        System.out.println("Please enter position of contact :");
        int nameInt = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter new name of contact :");
        String newName = scanner.nextLine();
        contacts.modifyContact(nameInt, newName);
        System.out.println("Contact has been modified!");
    }

    private static void removeContact() {
        System.out.println("Please enter position of contact :");
        int nameInt = scanner.nextInt();
        scanner.nextLine();
        contacts.removeContact(nameInt);
        System.out.println("Contact has beed removed");

    }

    private static void addContact() {
        System.out.println("Plesae enter name of contact :");
        contacts.addContact(scanner.nextLine());
        System.out.println("Please enter number of contact");
        contacts.addContactNumber(scanner.nextInt());
        System.out.println("Contact has beed added!");
    }


    private static void showAllContacts() {
        contacts.showAllContacts();
    }



    private static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print all contacts");
        System.out.println("\t 2 - To add contact");
        System.out.println("\t 3 - To reomcve contact");
        System.out.println("\t 4 - To modify contact");
        System.out.println("\t 5 - To find Contact");
        System.out.println("\t 6 - To quit");
    }


}
