package fun;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {


        Main main = new Main();
        showMenu();

        boolean quit = false;
        int menu = scanner.nextInt();
        while (!quit) {


            switch (menu) {
                case 1:
                    zapisKontaktow();
                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 0:

                    quit = true;
                    break;
            }
        }
    }


    public static void showMenu() {
        System.out.println("Kliknij 1 aby dodac napis");
        System.out.println("Kliknij 0 aby wylaczyc");
    }

    public static void zapisKontaktow() throws FileNotFoundException {
        PrintWriter plik = null;

        try {
            plik = new PrintWriter(new FileWriter("Contacts", true));
            plik.write(scanner.nextLine() + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(plik != null){
                plik.close();
            }
        }
    }
}


