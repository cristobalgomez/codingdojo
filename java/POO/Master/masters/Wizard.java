package masters;

public class Wizard extends Human {

    static final int TOTAL_HEALTH = 50;

    public Wizard() {
        this.health = TOTAL_HEALTH;
        this.intelligence = 8;
    }

    public void heal(Human healedHuman) {
        healedHuman.increaseHealth(this.intelligence, TOTAL_HEALTH);
    }

    public void fireBall(Human attackedHuman) {
        int totalDamage = (this.intelligence*3);
        attackedHuman.reduceHealth(totalDamage);
    }

    @Override
    public void displayStats() {
        System.out.println("Wizard:");
        super.displayStats();
    }


}
