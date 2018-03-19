package LinkedList.LinkedListChallenge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Player {

    public static void main(String[] args) {

        Album album = new Album("Queen", "Bohemian Rapsody");
        Album album2 = new Album("Metallica", "Black Album");
        LinkedList<Song> playList = new LinkedList<>();
        album.addSong("Innuendo1", 3.00);
        album.addSong("Innuendo2", 6.00);
        album.addSong("Innuendo3", 7.00);
        album.addSong("Innuendo4", 8.00);
        album.addSong("Innuendo5", 9.00);
        album.addSong("Innuendo6", 10.00);
        album.addSong("Innuendo7", 11.00);
        album.addSong("Innuendo8", 12.00);
        album.addSong("Innuendo9", 13.00);
        album2.addSong("Nothing else matters", 5.00);
        album2.addSong("Unforgiven", 7.00);
        album2.addSong("Unforgiven II", 9.00);
        album2.addSongsToPlaylist("Nothing else matters", playList);
        album2.addSongsToPlaylist("Unforgiven", playList);
        album2.addSongsToPlaylist("Unforgiven II", playList);
        album.addSongsToPlaylist("Innuendo1", playList);
        album.addSongsToPlaylist("Innuendo2", playList);
        album.addSongsToPlaylist("Innuendo3", playList);
        album.addSongsToPlaylist("Innuendo4", playList);
        album.addSongsToPlaylist("Innuendo5", playList);
        album.addSongsToPlaylist("Innuendo6", playList);
        album.addSongsToPlaylist("Innuendo7", playList);
        album.addSongsToPlaylist("Innuendo8", playList);
        album.addSongsToPlaylist("Innuendo9", playList);
        // throws an error if the song is not added to the album first
        album.addSongsToPlaylist("Innuendo10", playList);

        printMenuOptions();
        play(playList);

    }

    private static void printPlaylist(LinkedList<Song> playList) {
        Iterator<Song> i = playList.iterator();
        Song song = new Song();
        while (i.hasNext()) {
            System.out.println("Track title: " + i.next().getTitle() + " Duration: " + i.next().getDuration());
        }
        System.out.println("===================");
    }

    private static void play(LinkedList playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator listIterator = playList.listIterator();

        if (playList.isEmpty()) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Choose an option from the list: ");

        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Stop music");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("now playing " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenuOptions();
                    break;
                case 4:
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                        System.out.println("The current song has been removed. Press play");
                        listIterator.hasNext();
                        goingForward = true;
                    }
                    break;
                case 5:
                   printPlaylist(playList);


            }
        }
    }

    private static void printMenuOptions() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - quit\n" +
                "1 - play/next song\n" +
                "2 - go to previous song\n" +
                "3 - print menu options\n" +
                "4 - remove song from playlist\n" +
                "5 - print playlist list");
    }
}
