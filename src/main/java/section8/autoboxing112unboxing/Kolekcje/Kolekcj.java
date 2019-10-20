package section8.autoboxing112unboxing.Kolekcje;

import java.util.*;

public class Kolekcj {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Marcin");
        lista.add("Wojtek");
        lista.add("Pali");
        lista.add("Krzychu");

        System.out.println(lista.isEmpty() + " - Czy jest pusta?");
        System.out.println(lista);
        System.out.println(lista.size() + " -Wielkosc listy");
        System.out.println(lista.add("Robert") + " - Dodaje Robert do listy");

        System.out.println(lista);
        System.out.println(lista.contains("Monika" + " - Czy jest Monika w liscie?"));
        System.out.println(lista.contains("Pali") + " - Czy jest Pali w liscie?" );
        lista.clear();
        System.out.println(lista + " - lista po wyczyszczeniu przez lista.clear()");

//    ------------------------------------------

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(5);

        System.out.println(set);

        Map<String, Integer> oceny = new LinkedHashMap<>();
        oceny.put("Polski", 5);
        oceny.put("Matma", 2);
        oceny.put("Angielski", 1);
        oceny.put("Przyroda", 6);

        System.out.println(oceny);
    }




//    ----------------------------------------





}
