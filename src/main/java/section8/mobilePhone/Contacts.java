package section8.mobilePhone;

import java.util.ArrayList;

public class MobileContact {

public static ArrayList<Integer> numbers = new ArrayList<Integer>();
public static ArrayList<String> names = new ArrayList<String>();


    public void addContact(String name){
        if(name != null){
            names.add(name);
        }else {
            System.out.println("Enter a name!");
        }

    }

    public void removeContact(int position){
        String theContact = names.get(position - 1);
        names.remove(theContact);
    }


    protected void addContactNumber(int nextInt) {
        if(nextInt != 0){
            numbers.add(nextInt);
        }
    }

    public String showPosition(int searchItem){
        int position = names.indexOf(searchItem);
        if(position >= 0) {
            return names.get(position);

        }
        return null;
    }
}
