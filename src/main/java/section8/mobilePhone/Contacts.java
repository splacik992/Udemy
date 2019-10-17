package section8.mobilePhone;

import java.util.ArrayList;

public class Contacts {

    public static ArrayList<String> names = new ArrayList<>();
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public void addContact(String name){
        if(name != null){
            names.add(name);
        }else {
            System.out.println("Enter a name!");
        }

    }

    public void removeContact(int position){
        String theContact = names.get(position-1);
        names.remove(theContact);
    }

    public void modifyContact(int position, String newName){
        names.set(position-1,newName);
        System.out.println("Contact " + (position) + " has beed modified!");
    }

    public String fintContact(String searchItem){
        int position = names.indexOf(searchItem);
        if(position >= 0) {
            return names.get(position);

        }
        return null;
    }

    public void showAllContacts(){
        for(int i = 0; i < names.size();i++){
            System.out.println(names.get(i));
        } for (int j = 0; j < numbers.size(); j++){
            System.out.println(numbers.get(j));
        }
    }

    public void addContactNumber(int number){
        numbers.add(number);
    }


}