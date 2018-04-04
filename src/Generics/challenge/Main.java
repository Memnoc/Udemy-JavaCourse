package Generics.challenge;

public class Main {

    public static void main(String[] args) {

        // Building games
        PlayStation DevilMayCry = new PlayStation("DevilMayCry 1");
        PlayStation DevilMayCryReboot = new PlayStation("DevilMayCryReboot");
        PlayStation DevilMayCry2 = new PlayStation("DevilMayCry2");
        XboX Halo = new XboX("XboX 360");
        GameBoy Pokemon = new GameBoy("GameBoy");

        // Building consoles
        Console<PlayStation> PlayStation1 = new Console<>("PlayStation1");
        PlayStation1.addGame(DevilMayCry);
        PlayStation1.addGame(DevilMayCry2);
        PlayStation1.addGame(DevilMayCryReboot);

        Console<PlayStation> PlayStation2 = new Console<>("PlayStation2");
        PlayStation2.addGame(DevilMayCry2);
        //PlayStation1.addGame(Halo); // not compatible

        // Adding games to console
        Console<XboX> XboX360 = new Console<>("Xbox360");
        XboX360.addGame(Halo);
        //XboX360.addGame(DevilMayCry); // not compatible

        Console<GameBoy> GameBoy = new Console<>("GameBoy Pro");
        GameBoy.addGame(Pokemon);
        //GameBoy.addGame(Halo); // not compatible

        PlayStation1.mostPopular(PlayStation1, 1, 2);
        PlayStation2.mostPopular(PlayStation2, 21, 1);
        XboX360.mostPopular(XboX360, 5, 22);
        GameBoy.mostPopular(GameBoy, 33, 0);


        System.out.println("Chart");
        System.out.println(PlayStation1.getModel() + ": " + PlayStation1.ranking());
        System.out.println(XboX360.getModel() + ": " + XboX360.ranking());
        System.out.println(GameBoy.getModel() + ": " + GameBoy.ranking());

        System.out.println(PlayStation1.compareTo(PlayStation2));

        System.out.println(PlayStation1.numberOfGames());

        //System.out.println(PlayStation1.displayChart());








    }
}
