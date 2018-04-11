package Generics.MyChallenge;

public class Main {

    public static void main(String[] args) {

        Tournament<Universe<Earthlings>> tenkaichi = new Tournament<>("Tenkaichi Tournament");
        Universe<Earthlings> goku = new Universe<>("Son Goku");
        Universe<Earthlings> vegeta = new Universe<>("Vegeta");
        Universe<Earthlings> gohan = new Universe<>("Son Gohan");
        Universe<Earthlings> frieza = new Universe<>("Frieza");
        Universe<Universe6> kefla = new Universe<>("Kefla");
        Universe<Universe11> jiren = new Universe<>("Jiren");

        goku.matchResult(vegeta, 1, 0);
        vegeta.matchResult(gohan, 1, 0);
        gohan.matchResult(goku, 0, 1);

        tenkaichi.add(goku);
        tenkaichi.add(vegeta);
        tenkaichi.add(gohan);
        tenkaichi.add(frieza);
        //tenkaichi.add(kefla); // not accepted - good
        //tenkaichi.add(jiren); // not accepted - good

        tenkaichi.showTournamentTable();


    }
}
