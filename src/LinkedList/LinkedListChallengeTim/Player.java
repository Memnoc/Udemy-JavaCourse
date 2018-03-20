package LinkedList.LinkedListChallengeTim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Player {

    private static ArrayList<Album> albums = new ArrayList<>();


    public static void main(String[] args) {


        Album album = new Album("Storm bringer", "Deep Purple");
        album.addSong("Stormbringer1", 4.6);
        album.addSong("Stormbringer2", 4.22);
        album.addSong("Stormbringer3", 4.36);
        album.addSong("Stormbringer4", 1.6);
        album.addSong("Stormbringer5", 5.6);
        album.addSong("Stormbringer6", 7.64);
        album.addSong("Stormbringer7", 8.6);

        albums.add(album);
        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock1", 5.44);
        album.addSong("For those about to rock2", 6.44);
        album.addSong("For those about to rock3", 7.44);
        album.addSong("For those about to rock4", 8.44);
        album.addSong("For those about to rock5", 9.44);
        album.addSong("For those about to rock6", 9.24);
        album.addSong("For those about to rock7", 15.44);
        album.addSong("For those about to rock8", 25.44);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPLayList("Stormbringer1", playList);
        albums.get(0).addToPLayList("Stormbringer3", playList);
        albums.get(0).addToPLayList("you can't do it right", playList); // does not exist
        albums.get(0).addToPLayList(9, playList);
        albums.get(1).addToPLayList(8, playList);
        albums.get(1).addToPLayList(3, playList);
        albums.get(1).addToPLayList(2, playList);
        albums.get(1).addToPLayList(24, playList); // There is no track

        play(playList);


    }




    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("no songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
    }
}
