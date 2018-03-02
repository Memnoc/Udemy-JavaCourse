package Composition;

// This is Composition:
// We are essentially extending 3 different classes in one, something that with normal inheritance would not be possible.
// This is like saying: the PC has 3 components: a case, a motherboard and a monitor.

public class PC {

    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitors() {
        return monitors;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
