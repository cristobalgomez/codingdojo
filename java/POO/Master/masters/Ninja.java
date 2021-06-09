package masters;

public class Ninja extends Human {

    static final int TOTAL_HEALTH = 100;

    public Ninja() {
        this.stealth = TOTAL_HEALTH;
    }

    public void steal(Human attackedHuman) {
        attackedHuman.reduceHealth(this.stealth);
        this.increaseHealth(this.stealth, TOTAL_HEALTH);
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
