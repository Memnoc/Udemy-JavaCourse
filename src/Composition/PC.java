package Composition;

// This is Composition:
// We are essentially extending 3 different classes in one, something that with normal inheritance would not be possible.
// This is like saying: the PC has 3 components: a case, a motherboard and a monitor.

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp () {
        theCase.pressPowerButton(); // instead of using getters, you can assign a variable and access that
        drawLogo();
    }

    private void drawLogo(){
        // Fancy graphic animation
        monitor.drawPixelAt(1200,50,"yellow"); // instead of using getters, you can assign a variable and access that
    }

    // We don't need getters anymore at this point as we are acessing the methods via variables.

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitors() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
