import masters.*;

public class MastersTest {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Samurai samurai = new Samurai();
        Ninja ninja = new Ninja();

        wizard.displayStats();
        samurai.displayStats();
        ninja.displayStats();

        wizard.fireBall(samurai);
        samurai.displayStats();
        ninja.steal(wizard);
        wizard.displayStats();
        samurai.deathBlow(ninja);
        ninja.displayStats();
        ninja.runAway();
        ninja.displayStats();

    }
}
