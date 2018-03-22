package Interfaces.InterfacesProject;

import LinkedList.LinkedListChallengeTim.Song;

import java.util.*;

public class Player {

    private static List<Album> albums = new ArrayList<>();


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

        List<Song> playList = new ArrayList<>();
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


    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("no songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("we have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - to play the next song\n" +
                "2 - to play the previous song\n" +
                "3 - to re-play the previous song\n" +
                "4 - for list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - delete current song from playlist");
    }

    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==================");
    }
}
