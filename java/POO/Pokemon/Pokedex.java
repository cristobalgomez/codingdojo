import java.util.ArrayList;
import java.util.List;

public class Pokedex extends AbstractPokemon {

    private List<Pokemon> pokemonList = new ArrayList<>();

    public void addPokemon(String name, int health, String type) {
        pokemonList.add(createPokemon(name, health, type));
    }

    @Override
    public void listPokemon() {
        for(int i = 0; i < Pokemon.getCount(); i++) {
            System.out.println(pokemonInfo(pokemonList.get(i)));
        }
    }

    public Pokemon getPokemon(String name) {
        for(int i = 0; i < pokemonList.size(); i++) {
            if(pokemonList.get(i).getName() == name) return pokemonList.get(i);
        }

        return null;
    }
}
