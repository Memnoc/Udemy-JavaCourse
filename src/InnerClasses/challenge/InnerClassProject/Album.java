package InnerClasses.challenge.InnerClassProject;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
//  private ArrayList<Song> songs; -> old code, deleted.
    private SongList songs; // declaring the Song object.


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
//      this.songs = new ArrayList<Song>(); -> old code, deleted
        this.songs = new SongList(); // initializing the Song constructor
    }

    public boolean addSong (String title, double duration) {
        return this.songs.add(new Song(title, duration));
//        if (findSong(title) == null) {
//            this.songs.add(new Song(title, duration)); -> old block deleted
//            return true;
//        }
//        return false;
    }

//    Deleted method -> implemented in the inner class

//    private Song findSong (String title) {
//        for (Song checkedSong: this.songs) {
//            if (checkedSong.getTitle().equals(title)) {
//                return checkedSong;
//            }
//        }
//        return null;
//    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
//        int index = trackNumber -1;
//        if ((index >=0) && (index <= this.songs.size())) { -> old code, deleted
//            playList.add(this.songs.get(index));
//            return true;
//        }
        // Using the inner class to find the function we wrote
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
//      Song checkedSong = findSong(title); -> old code
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }


    // implementing the inner class
    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        // For adding a song, we create a method that takes a Song object as parameter
        public boolean add (Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        // findSong(); based on the title

        private Song findSong (String title) {
            for (Song checkedSong: this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        // findSong() based on int -> taken out from the final solution

        public Song findSong(int trackNUmber) {
            int index = trackNUmber - 1;
            if ((index >0) && (index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
