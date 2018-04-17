package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        //java.util.Map<String, String> languages = new HashMap<>();
        Map<String,String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "A compiled high level, object-oriented, platform independent language");
            System.out.println("java added successfully");
        }
//        languages.put("Java", "A compiled high level, object-oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instructions Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        // validation to avoid overwriting and duplicates
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }
        //System.out.println(languages.get("Java"));
        //System.out.println(languages.get("Java"));

        System.out.println("===================================================================================");

        // simple removal
//        languages.remove("Lisp");

        if(languages.remove("Algol", "An algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key value paired not found");
        }

        // Replacing values
//        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));
//        System.out.println(languages.replace("Scala", "this will not be added"));

        // Replacing values with validation
        if (languages.replace("Lisp", "this will not work", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
