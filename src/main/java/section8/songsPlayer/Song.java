package section8.songsPlayer;

public class Song {

    private String title;
    private double duration;

    public Song(String songName, double duration) {
        this.title = songName;
        this.duration = duration;
    }

    public String getSongName() {
        return title;
    }

    public void setSongName(String songName) {
        this.title = songName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

