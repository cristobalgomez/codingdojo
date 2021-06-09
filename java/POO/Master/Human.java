public class Human {
    protected int strength = 3;
    protected int intelligence = 3; 
    protected int stealth = 3;
    protected int health = 100;

    public void reduceHealth(int damage) {
        this.health -= damage;
    }

    public void attack(Human attackedHuman) {
        attackedHuman.reduceHealth(this.strength);
    }

    public void displayStats() {
        System.out.println("Strength:" + this.strength);
        System.out.println("intelligence:" + this.intelligence);
        System.out.println("stealth:" + this.stealth);
        System.out.println("health:" + this.health);
    }
}
