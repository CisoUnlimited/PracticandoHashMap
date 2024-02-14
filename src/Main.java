import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pokédex");
        ArrayList<Pokemon> pokedex = new ArrayList<>();
        pokedex.add(new Pokemon("Bulbasaur", Tipo1.PLANTA, Tipo2.VENENO));
        pokedex.add(new Pokemon("Ivysaur", Tipo1.PLANTA, Tipo2.VENENO));
        pokedex.add(new Pokemon("Venusaur", Tipo1.PLANTA, Tipo2.VENENO));
        pokedex.add(new Pokemon("Charmander", Tipo1.FUEGO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Charmeleon", Tipo1.FUEGO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Charizard", Tipo1.FUEGO, Tipo2.VOLADOR));
        pokedex.add(new Pokemon("Squirtle", Tipo1.AGUA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Wartortle", Tipo1.AGUA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Blastoise", Tipo1.AGUA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Caterpie", Tipo1.BICHO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Metapod", Tipo1.BICHO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Butterfree", Tipo1.BICHO, Tipo2.VOLADOR));
        pokedex.add(new Pokemon("Weedle", Tipo1.BICHO, Tipo2.VENENO));
        pokedex.add(new Pokemon("Kakuna", Tipo1.BICHO, Tipo2.VENENO));
        pokedex.add(new Pokemon("Beedrill", Tipo1.BICHO, Tipo2.VENENO));
        pokedex.add(new Pokemon("Pidgey", Tipo1.VOLADOR, Tipo2.NORMAL));
        pokedex.add(new Pokemon("Pidgeotto", Tipo1.VOLADOR, Tipo2.NORMAL));
        pokedex.add(new Pokemon("Pidgeot", Tipo1.VOLADOR, Tipo2.NORMAL));
        pokedex.add(new Pokemon("Rattata", Tipo1.NORMAL, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Raticate", Tipo1.NORMAL, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Spearow", Tipo1.VOLADOR, Tipo2.NORMAL));
        pokedex.add(new Pokemon("Fearow", Tipo1.VOLADOR, Tipo2.NORMAL));
        pokedex.add(new Pokemon("Ekans", Tipo1.VENENO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Arbok", Tipo1.VENENO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Pikachu", Tipo1.ELECTRICO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Raichu", Tipo1.ELECTRICO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Sandshrew", Tipo1.TIERRA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Sandslash", Tipo1.TIERRA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Nidoran♀", Tipo1.VENENO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Nidorina", Tipo1.VENENO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Nidoqueen", Tipo1.VENENO, Tipo2.TIERRA));
        pokedex.add(new Pokemon("Nidoran♂", Tipo1.VENENO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Nidorino", Tipo1.VENENO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Nidoking", Tipo1.VENENO, Tipo2.TIERRA));
        pokedex.add(new Pokemon("Clefairy", Tipo1.HADA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Clefable", Tipo1.HADA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Vulpix", Tipo1.FUEGO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Ninetales", Tipo1.FUEGO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Jigglypuff", Tipo1.NORMAL, Tipo2.HADA));
        pokedex.add(new Pokemon("Wigglytuff", Tipo1.NORMAL, Tipo2.HADA));
        pokedex.add(new Pokemon("Zubat", Tipo1.VOLADOR, Tipo2.VENENO));
        pokedex.add(new Pokemon("Golbat", Tipo1.VOLADOR, Tipo2.VENENO));
        pokedex.add(new Pokemon("Oddish", Tipo1.PLANTA, Tipo2.VENENO));
        pokedex.add(new Pokemon("Gloom", Tipo1.PLANTA, Tipo2.VENENO));
        pokedex.add(new Pokemon("Vileplume", Tipo1.PLANTA, Tipo2.VENENO));
        pokedex.add(new Pokemon("Paras", Tipo1.BICHO, Tipo2.PLANTA));
        pokedex.add(new Pokemon("Parasect", Tipo1.BICHO, Tipo2.PLANTA));
        pokedex.add(new Pokemon("Venonat", Tipo1.BICHO, Tipo2.VENENO));
        pokedex.add(new Pokemon("Venomoth", Tipo1.BICHO, Tipo2.VENENO));
        pokedex.add(new Pokemon("Diglett", Tipo1.TIERRA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Dugtrio", Tipo1.TIERRA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Meowth", Tipo1.NORMAL, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Persian", Tipo1.NORMAL, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Psyduck", Tipo1.AGUA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Golduck", Tipo1.AGUA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Mankey", Tipo1.LUCHA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Primeape", Tipo1.LUCHA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Growlithe", Tipo1.FUEGO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Arcanine", Tipo1.FUEGO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Poliwag", Tipo1.AGUA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Poliwhirl", Tipo1.AGUA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Poliwrath", Tipo1.AGUA, Tipo2.LUCHA));
        pokedex.add(new Pokemon("Abra", Tipo1.PSIQUICO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Kadabra", Tipo1.PSIQUICO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Alakazam", Tipo1.PSIQUICO, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Machop", Tipo1.LUCHA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Machoke", Tipo1.LUCHA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Machamp", Tipo1.LUCHA, Tipo2.NINGUNO));
        pokedex.add(new Pokemon("Bellsprout", Tipo1.PLANTA, Tipo2.VENENO));
        pokedex.add(new Pokemon("Weepinbell", Tipo1.PLANTA, Tipo2.VENENO));
        pokedex.add(new Pokemon("Victreebel", Tipo1.PLANTA, Tipo2.VENENO));

        System.out.println("LISTA DE POKÉMON");
        //RECORRER ARRAYLIST Y ELIMINAR UN ELEMENTO (NO PUEDE HACERSE DENTRO DEL FOR EACH
        int indiceEliminar = 0;
        boolean encontrado = false;
        for (Pokemon pokemon : pokedex){
            if (pokemon.getNombre() == "Abra") {
                //ELIMINAR
                indiceEliminar = pokedex.indexOf(pokemon);
            }
        }
        if (encontrado) {
            pokedex.remove(indiceEliminar);
        }

        //OBTENER OBJETO
        Pokemon abra ;
        if (pokedex.contains("Abra")){
            for (Pokemon pokemon : pokedex){
                if (pokemon.getNombre() == "Abra"){
                    //PODRÍAMOS HACER ESTO U OBTENER EL ÍNDICE
                    abra = pokemon;

                    //ÍNDICE
                    int indice = pokedex.indexOf(pokemon);
                    //get selecciona el objeto que hay en ese índice
                    abra = pokedex.get(indice);
                }
            }
        }
        System.out.println(pokedex.toString());

        //BORRAR ARRAYLIST
        pokedex.clear();

        //ITERADORES
        Iterator<Pokemon> iterator = new iterator<Pokemon>(){

        }
    }



}