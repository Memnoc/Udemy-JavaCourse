package SetandHashSet.SetChallenge;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Set<HeavenlyBody> bodyType;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    // Returning new HashSet of satellites
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    // Returning new HashSet of bodyTypes
    public Set<HeavenlyBody> getBodyType() {
        return new HashSet<>(this.bodyType);
    }

    // adding moons
    public boolean addMoon(HeavenlyBody moon) {
        return  this.satellites.add(moon);
    }

    // adding body types
    public boolean addBodyType(HeavenlyBody bodyType) {
        return  this.bodyType.add(bodyType);
    }
}
