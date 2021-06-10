public class Pokemon {
    private String name;
    private int health;
    private String type;

    private static int count = 0;

    public Pokemon(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }

    public void attackPokemon(Pokemon pokemon) {
        pokemon.reduceHealth(10);
    }

    public void reduceHealth(int damage) {
        this.health -= damage;
    }

    public static int getCount() {
        return count;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
