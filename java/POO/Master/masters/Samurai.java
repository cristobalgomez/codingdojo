package masters;

public class Samurai extends Human {

    public Samurai() {
        this.health = 200;
        this.TOTAL_HEALTH = 200;
    }

    public void deathBlow(Human attackedHuman) {
        attackedHuman.setHealth(0);
        this.health /= 2;
    }

    public void meditate() {
        this.health *= 1.5;
    }

    @Override
    public void displayStats() {
        System.out.println("Samurai:");
        super.displayStats();
    }

    // public void howMany() {}
}
