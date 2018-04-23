package SetandHashSet.SetChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static Map<String, HeavenlyBody> asteroidBelt = new HashMap<>();
    private static Set<HeavenlyBody> asteroids = new HashSet<>();

    public static void main(String[] args) {

//        // Asteroid belt
//        HeavenlyBody tempObjects = new HeavenlyBody("Eureka", 690);
//        asteroidBelt.put(tempObjects.getName(), tempObjects);
//        asteroids.add(tempObjects);
////        // Asteroid body type
////        HeavenlyBody tempAsteroid = new HeavenlyBody("Asteroid", 690);
////        asteroidBelt.put(tempAsteroid.getName(), tempAsteroid);
////        tempObjects.addBodyType(tempAsteroid);


        // Earth
        HeavenlyBody temp = new HeavenlyBody("Earth", 365, "Planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // Earth - rejected
//        temp = new HeavenlyBody("Earth", 365, "planet");
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);

        // Earth - accepted
//        temp = new HeavenlyBody("Earth", 365, "star");
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);


        // Moons of Earth:
        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 365, "moon");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);



        // Mars
        temp = new HeavenlyBody("Mars", 687, "Planet1");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // Moons of Mars:
        tempMoon = new HeavenlyBody("Deimos", 1.3, "moon");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 0.3, "moon");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        // Asteroids of Mars
        HeavenlyBody tempAsteroid = new HeavenlyBody("Eureka", 690, "asteroid");
        asteroidBelt.put(tempAsteroid.getName(), tempAsteroid);
        asteroids.add(tempAsteroid);
        tempAsteroid.addBodyType(tempAsteroid);


        tempAsteroid = new HeavenlyBody("VF31", 690, "asteroid");
        asteroidBelt.put(tempAsteroid.getName(), tempAsteroid);
        asteroids.add(tempAsteroid);
        tempAsteroid.addBodyType(tempAsteroid);


        // Jupiter
        temp = new HeavenlyBody("Jupiter", 4332, "Planet2");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Jupiter:
        tempMoon = new HeavenlyBody("Io", 1.8, "moon");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Europa", 3.5, "moon");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Ganymede", 7.1, "moon");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Callisto", 16.7, "moon");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);


        // Neptune
        temp = new HeavenlyBody("Neptune", 165, "Planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Neptune:


        // Saturn
        temp = new HeavenlyBody("Saturn", 10795, "Planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Saturn:


        // Uranus
        temp = new HeavenlyBody("Uranus", 30660, "Planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Uranus:


        // Venus
        temp = new HeavenlyBody("Venus", 255, "Planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Venus:


        // Mercury
        temp = new HeavenlyBody("Mercury", 88, "Planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Mercury:


//**************************************************************************************


        // display planets
        System.out.println("Planets");
        for (HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getName() + " - " + planet.getType());
        }

        // display asteroids
        System.out.println("Asteroids");
        for (HeavenlyBody asteroid : asteroids){
            System.out.println("\t" + asteroid.getName());
        }

        // Displaying Planet + moons
        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody earthMoons: body.getSatellites()) {
            System.out.println("\t" + earthMoons.getName());
        }

        // Displaying planet + asteroid
        HeavenlyBody objectBody = asteroidBelt.get("Eureka");
        System.out.println("Asteroids of Mars ");
        for (HeavenlyBody marsAsteroids: objectBody.getBodyType()) {
            System.out.println("\t" + marsAsteroids.getName());
        }
        objectBody = asteroidBelt.get("VF31");
        //System.out.println("Asteroid of Mars ");
        for (HeavenlyBody marsAsteroids: objectBody.getBodyType()) {
            System.out.println("\t" + marsAsteroids.getName());
        }

        // Grouping moons
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All moons");
        for (HeavenlyBody moon : moons){
            System.out.println("\t" + moon.getName());
        }
    }
}
