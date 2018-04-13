package Scope.challenge;

public class X {

    private int x = 0;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        int x = 2;
        for (x = 1; x <= 12; x++) {
            System.out.println(this.x * x);

        }
    }


}
