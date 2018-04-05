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


        PlayStation1.mostPopular(PlayStation1, 1, 1);
        PlayStation1.mostPopular(PlayStation1, 2, 1);
        PlayStation1.mostPopular(PlayStation1, 3, 1);

        PlayStation1.addGame(DevilMayCry);
        PlayStation1.addGame(DevilMayCry2);
        PlayStation1.addGame(DevilMayCryReboot);

        PlayStation1.showChart();



        Console<PlayStation> PlayStation2 = new Console<>("PlayStation2");
        PlayStation2.addGame(DevilMayCry2);
        //PlayStation1.addGame(Halo); // not compatible
        PlayStation2.mostPopular(PlayStation2, 4, 1);
        PlayStation2.mostPopular(PlayStation1, 5, 1);
        PlayStation2.mostPopular(PlayStation2, 6, 1);
        PlayStation1.showChart();


        // Adding games to console
        Console<XboX> XboX360 = new Console<>("Xbox360");
        XboX360.addGame(Halo);
        //XboX360.addGame(DevilMayCry); // not compatible
        XboX360.mostPopular(XboX360, 10, 10);
        XboX360.mostPopular(XboX360, 11, 10);
        PlayStation1.showChart();


        Console<GameBoy> GameBoy = new Console<>("GameBoy Pro");
        GameBoy.addGame(Pokemon);
        //GameBoy.addGame(Halo); // not compatible
        GameBoy.mostPopular(GameBoy, 5, 2);
        GameBoy.mostPopular(GameBoy, 5, 2);
        PlayStation1.showChart();








//        System.out.println("Chart============================");
//        System.out.println(XboX360.getModel() + ": " + XboX360.ranking());
//        System.out.println(PlayStation1.getModel() + ": " + PlayStation1.ranking());
//        System.out.println(PlayStation2.getModel() + ": " + PlayStation2.ranking());
//        System.out.println(GameBoy.getModel() + ": " + GameBoy.ranking());














    }
}
