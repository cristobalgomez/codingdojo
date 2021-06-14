package masters;

public class Ninja extends Human {

    public Ninja() {
        this.stealth = 10;
    }

    public void steal(Human attackedHuman) {
        attackedHuman.reduceHealth(this.stealth);
        this.increaseHealth(this.stealth);
    }

    public void runAway() {
        this.reduceHealth(10);
    }

    @Override
    public void displayStats() {
        System.out.println("Ninja:");
        super.displayStats();
    }
}
