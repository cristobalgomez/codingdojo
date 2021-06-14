package masters;

public class Wizard extends Human {

    public Wizard() {
        this.health = 50;
        this.TOTAL_HEALTH = 50;
        this.intelligence = 8;
    }

    public void heal(Human healedHuman) {
        healedHuman.increaseHealth(this.intelligence);
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
