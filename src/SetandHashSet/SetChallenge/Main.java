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


        // Earth
        HeavenlyBody temp = new HeavenlyBody("Earth", 365, "planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


        //Two bodies with the same name but different designations can be added to the same map,
        //  and can be retrieved from the map. Passed
         //Earth duplicate
        HeavenlyBody tempDuplicate = new HeavenlyBody("Earth", 365, "dwarf_planet");
        solarSystem.put(tempDuplicate.getName(), tempDuplicate);
        planets.add(tempDuplicate);

//**** Tests:
// Attempting to add a duplicate to a Set must result in no change to the set. Passed

        // Earth - rejected
        temp = new HeavenlyBody("Earth", 365, "planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // Two bodies with the same name but different designations can be added to the same set. Passed

        // Earth - accepted
//        temp = new HeavenlyBody("Earth", 360, "star");
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);


        HeavenlyBody tempSun = new HeavenlyBody("Sun", 660, "star");
        solarSystem.put(tempSun.getName(), tempSun);
        planets.add(tempSun);





        // Moons of Earth:
        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27, "moon");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);


        // Moons of Earth - accepted
        tempMoon = new HeavenlyBody("Moon", 37, "satellite");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        // Test for symmetry. Passed

        HeavenlyBody temp1 = new HeavenlyBody("Earth", 365, "planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


        HeavenlyBody temp2 = new HeavenlyBody("Earth", 365, "planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println(temp1.equals(temp2)); // true
        System.out.println(temp2.equals(temp1)); // true
        System.out.println(temp2.equals(tempMoon)); // false
        System.out.println(tempMoon.equals(temp2)); // false


        // Mars
        temp = new HeavenlyBody("Mars", 687, "planet");
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
        temp = new HeavenlyBody("Jupiter", 4332, "planet");
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
        temp = new HeavenlyBody("Neptune", 165, "planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Neptune:


        // Saturn
        temp = new HeavenlyBody("Saturn", 10795, "planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Saturn:


        // Uranus
        temp = new HeavenlyBody("Uranus", 30660, "planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Uranus:


        // Venus
        temp = new HeavenlyBody("Venus", 255, "planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Venus:


        // Mercury
        temp = new HeavenlyBody("Mercury", 88, "planet");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        // Moons of Mercury:


//**************************************************************************************


        // display planets
        System.out.println("Planets");
        for (HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getName() + " - " + planet.getType() + " : " + planet.getOrbitalPeriod());
        }

        // display asteroids
        System.out.println("Asteroids");
        for (HeavenlyBody asteroid : asteroids){
            System.out.println("\t" + asteroid.getName() + " - " + asteroid.getType());
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
            System.out.println("\t" + moon.getName() + " - " + moon.getType());
        }

        // Print the whole solar system
        System.out.println();
        System.out.println("The Solar system contains");
        for (HeavenlyBody heavenlyBody : solarSystem.values()) {
            System.out.println(heavenlyBody);
        }
    }



}
