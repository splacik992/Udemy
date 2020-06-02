package section10.Generics;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("Rafal");
        items.add(4);
        items.add(5);

        pringDoubled(items);
    }

    private static void pringDoubled(ArrayList<Integer> n){
        for (int i : n){
            System.out.println( i*2);
        }
    }
}
