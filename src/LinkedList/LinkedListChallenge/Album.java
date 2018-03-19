package LinkedList.LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String artist;
    private String albumTitle;
    private ArrayList<Song> songs;

    public Album(String artist, String albumTitle) {
        this.artist = artist;
        this.albumTitle = albumTitle;
        this.songs = new ArrayList<Song>();
    }

    public Album() {

    }

    // add song to album
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            //System.out.println("Track title: " + title + " duration: " + duration);
            return true;
        }
        return false;
    }

    // find song
    private Song findSong(String songTitle) {
        for (int i = 0; i <this.songs.size(); i++) {
            Song checkedSong = this.songs.get(i);
            if (checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }

        }
        return null;
    }

    // add song to playlist
    public void addSongsToPlaylist (String songTitle, LinkedList<Song> playlist){
        Song existingSong = findSong(songTitle);
        if (existingSong != null){
            playlist.add(existingSong);
            return;

        }
        System.out.println("Could not find the song " + songTitle + " in the album");
    }

}
