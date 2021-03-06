package masters;

public class Human {
    protected int strength = 3;
    protected int intelligence = 3; 
    protected int stealth = 3;
    protected int health = 100;
    protected int TOTAL_HEALTH = 100;

    public void reduceHealth(int damage) {
        if(this.health < damage) this.health = 0;
        else this.health -= damage;
    }

    public void increaseHealth(int heal) {
        if(this.health + heal > this.TOTAL_HEALTH) this.health = this.TOTAL_HEALTH;
        else this.health += heal;
    }

    public void attack(Human attackedHuman) {
        attackedHuman.reduceHealth(this.strength);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void displayStats() {
        System.out.println("- Strength:" + this.strength);
        System.out.println("- intelligence:" + this.intelligence);
        System.out.println("- stealth:" + this.stealth);
        System.out.println("- health:" + this.health);
    }
}
