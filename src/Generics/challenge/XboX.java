package Generics.challenge;

public class XboX extends Game implements Comparable<XboX> {
    public XboX(String model) {
        super(model);
    }

    @Override
    public int compareTo(XboX o) {
        return 0;
    }
}
