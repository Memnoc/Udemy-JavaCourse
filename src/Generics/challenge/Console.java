package Generics.challenge;

import java.util.ArrayList;
import java.util.Collections;

public class Console<T extends Game & Comparable<T>> implements Comparable<Console<T>> {

    private String model;
    int copiesSold = 0;
    int sold = 0;
    int unsold = 0;
    int draw = 0;
    double date = 0.0;

    private ArrayList<T> games = new ArrayList<>();


    public Console(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public boolean addGame(T game) {
        if (games.contains(game)){
            System.out.println(game.getTitle() + " is already on the list, do not add.");
            return false;
        } else {
            games.add(game);
            System.out.println(game.getTitle() + " has been added to the " + this.model + " list");
            return false;
        }
    }

    public void showChart() {
        Collections.sort(games);
        for (T t : games) {
            System.out.println(getModel() + ": " + ranking());
        }
    }

    public int numberOfGames(){
        String result = String.valueOf(games.size());
        return Integer.parseInt(result.toString());
    }

    public void mostPopular(Console<T> gameTitle, int gamesSold, int gamesUnsold) {
        String message;


        if (gamesSold > gamesUnsold){
            System.out.println( " active");
            sold++;
        } else if (gamesSold == gamesUnsold) {
            System.out.println(" draw");
            draw++;
        } else {
            System.out.println(" loss");
                unsold++;
            }
        }

        public int ranking(){
        return this.sold;

        }

    @Override
    public int compareTo(Console<T> game) {
        if (this.ranking() > game.ranking()) {
            return -1;
        } else if (this.ranking() < game.ranking()) {
                return 1;
            } else {
                return 0;
            }
        }
}


