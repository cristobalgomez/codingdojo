public class PokedexTest {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();

        pokedex.addPokemon("Pikachu", 100, "Electric");
        pokedex.addPokemon("Pidgeot", 99, "Normal");
        pokedex.addPokemon("Charmander", 55, "Fire");
        pokedex.listPokemon();

        pokedex.getPokemon("Pikachu").attackPokemon(pokedex.getPokemon("Charmander"));
        pokedex.listPokemon();

    }
}
