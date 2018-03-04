package Polymorphism;

// We are going to demonstrate polymorphism here by creating a series of inner classes
// We are going to create a basic class called Movie, and then we are going to create another
// class to is going to relate to a specific Movie defined in the Movie class

import Composition.Motherboard;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws"); // Bit different constructor, we are initializing directly the name field from the Movie.class
        // possible because of inheritance
    }

    public String plot() {
        return "A shark eats lots of people";
    }

}

class IndipendenceDay extends Movie {

    public IndipendenceDay() {
        super("Indipendence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "imperial forces try to take over the universe";
    }
}

class ForgettableMovies extends Movie {

    public ForgettableMovies() {
        super ("Forgettable");
    }

    // No plot method
}



public class Polymorphism {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie(); // calling the method creating a variable
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n"); // This line right here is polymorphism in action!
            // First aspect: -> different functionality to different objects
            // By calling the object movie, Java is going through all the classes available to look for
            // the method plot(); and it finds it, prints out a different output for each one of them.
            // In other words: we are assigning different functionality depending on the type of object
            // we have created, bearing in mind that all these objects inherits from the base Movie class,
            // but we still have assigned a unique functionality to each plot() method for each of those classes.

            // Second aspect: ->  the default effect
            // At some point one of our random results is:
            // Random number generated was: 5
            // Movie #7 : Forgettable
            // Plot: No plot here
            // This code is coming from the Movie class, and this is happening because we haven't defined
            // (better, overridden) the method from the parent class (Movie) in the child class (ForgettableMovies)
            // When the compiler comes to that class, finds not override for plot() but sees that the child class
            // is inheriting from the Movie class, which does have a plot() method, so it is smart enough to jump
            // to the method in the parent class and execute that instead.
            // This shows how polymorphism is the actual ability of assigning different behaviours to different
            // objects (if you override, of course).
            // ** In the code you see that sometimes @override is called, sometimes it's not. The result is the same,
            // but technically speaking, calling @override each time would be the correct way to go **

        }

    }


    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndipendenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovies();

        }

        return null;
    }
}
