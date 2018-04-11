package Packages;

// imported
//import javafx.scene.Node;

public class Main {

    public static void main(String[] args) {

        // You can either import this
        //Node node = null;
        // or you can reference the package manually
        // this way you avoid importing the package
        //javafx.scene.Node node = null;

        // If you have two Node packages and you need to use them both
        // the best way to go and avoid errors is import one, and reference the other
        //Node node = null; // first - imported
        //org.w3c.dom.Node anotherNode = null; // second one, referenced
        // If you try to import them both, it will fail

        // You can also reference both, and not importing any of them:
        //javafx.scene.Node node = null;
        //org.w3c.dom.Node anotherNode = null;

        MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);

    }
}
