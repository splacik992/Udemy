package section8.songsPlayer;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        int menu = scanner.nextInt();
        while (!quit){
            switch (menu){


                case 0:
                    System.out.println("You just turned off app!");
                    quit = true;
                    break;
            }
        }
    }

    public static void showMenu(){
        System.out.println("MENU\n" +
                "1 - show list of songs\n" +
                "2 - skip forward to the next song\n" +
                "3 - skip backwards to a previous song\n" +
                "4 - replay the current song\n" +
                "5 - add new song from album\n" +
                "0 - quit");
    }
    //    	    // Create a program that implements a playlist for songs
//        // Create a Song class having Title and Duration for a song.
//        // The program will have an Album class containing a list of songs.
//        // The albums will be stored in an ArrayList
//        // Songs from different albums can be added to the playlist and will appear in the list in the order
//        // they are added.
//        // Once the songs have been added to the playlist, create a menu of options to:-
//        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
//        // List the songs in the playlist
//        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
//        // you own).
//        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
//        // started tracking the direction we were going.
//        // As an optional extra, provide an option to remove the current song from the playlist
//        // (hint: listiterator.remove()
}
