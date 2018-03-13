package AutoboxingAndUnboxing;

import java.util.ArrayList;

public class Autoboxing {

    public static void main(String[] args) {

        String[] myArray = new String[10]; // standard Array String
        int[] myArray2 = new int[10]; // standard array with int

        ArrayList<String> myArrayList = new ArrayList<String>(); // ArrayList with String

        // error:
        // type argument cannot be of primitive
        //ArrayList<int> myArrayList2 = new ArrayList<int>();
        //ArrayList<double> myArrayList3 = new ArrayList<double>();

        // To fix this, we can use Autoboxing

        ArrayList<Integer> myArrayList4 = new ArrayList<Integer>(); // good
        ArrayList<Double> myArrayList5 = new ArrayList<Double>(); // good

        // Integer is actually a class that allows creation of objects of type integer

        Integer integerValue = new Integer(50); // the boxing is actually unnecessary here
        // This would do as well and it does the same
        // At compiling time it will b executed as: Integer integerValue2 = Integer.valueOf(50);
        Integer integerValue2 = (50);

        Double doubleValue3 = new Double(200.00); // same as above
        Double doubleValue4 = (300.00); // same as above

        // Typically, you run it like this:
        ArrayList<Integer> myArrayValue6 = new ArrayList<>(); // this is also ok
        for (int i = 0; i <10; i++) {
            myArrayValue6.add(Integer.valueOf(i));// this is autoboxing
            // converting a base primitive type (int) to an Integer

        }
        for (int i = 0; i <10; i++) {
            System.out.println(i + " --> " + myArrayValue6.get(i).intValue()); // this is unboxing
            // converting an Integer back into the primitive type int
        }

        // As said above, some of the specific declarations are redundant
        // So the code:
        Integer myInt = new Integer(50);
        // Can be shortened to:
        Integer myInt2 = 50; // Java will put Integer.valueOf(50); under the hood

        //Similarly:
        int myInt3 = myInt2; // Java will put myInt2.valueOf(); under the hood

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5){
            //myDoubleValues.add(Double.valueOf(dbl));// long boxing
            myDoubleValues.add(dbl);// short boxing
        }
        for (int i = 0; i <myDoubleValues.size() ; i++) {
            //double value = myDoubleValues.get(i).doubleValue(); // long unboxing
            double value = myDoubleValues.get(i); // short unboxing
            System.out.println(i + " --> " + value);
        }



    }



}
