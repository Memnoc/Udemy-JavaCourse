package Generics.practice;

public class Main {

    public static void main(String[] args) {

        Milan milan = new Milan("AC Milan");
        Inter inter = new Inter("Inter");
        Barcelona barcelona = new Barcelona("AC Barcelona");

        Campionato<Milan> serieA = new Campionato<>("SerieA");
        Campionato<Milan> serieA1 = new Campionato<>("SerieA");
        Campionato<Inter> serieb = new Campionato<>("SerieB");
        Campionato<Barcelona> liga = new Campionato<>("Liga Espanola");

        serieA.addTeam(milan);
        serieb.addTeam(inter);
        liga.addTeam(barcelona);
//        serieA.addTeam(barcelona); // error
//        liga.addTeam(milan); // error

        System.out.println(serieA.numTeams());

        Campionato<Barcelona> liga2 = new Campionato<>("Liga 2");
        liga2.addTeam(barcelona);

        System.out.println(liga2.numTeams());

    }
}
