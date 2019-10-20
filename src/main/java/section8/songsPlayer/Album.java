package section8.songsPlayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getSongName().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    private boolean addToPlayList(int position, LinkedList<Song> playList){
        int index = position -1;
        if(index>0 && index <= playList.size()){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have track: " + position);
        return false;
    }

    private boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("Song " + title + " is not in this album");
        return false;
    }
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


