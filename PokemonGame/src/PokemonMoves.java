import java.util.HashMap;
import java.util.Map;

/**
 * This class contains moves of Pokemon and their damage values
 */
public class PokemonMoves{

//Move map
private Map<String, Integer> move = new HashMap<>();

/**
* The entire move list of this game.
*/
private void add(){
/*
The operation "put(Key, Value);" is used for storing values
It can even replace already set values.
Use this method to increase the number value with the corresponding Pokémon that is assigned to it.
*/
            move.put("Acid",15);
            move.put("Aurora Beam",25);
            move.put("Blizzard",45 );
            move.put("Body Slam",20 );
            move.put("Bone Club", 20);
            move.put("Bubble Beam",10 );
            move.put("Earthquake",35 );
            move.put("Drill Peck",30 );
            move.put("Fire Blast",45 );
            move.put("Flamethrower",35);
            move.put("Gust",10);
            move.put("High Jump Kick",35 );
            move.put("Hydro Pump",45);
            move.put("Hyper Beam",50 );
            move.put("Hyper Fang",30);
            move.put("Ice Beam",35 );
            move.put("Karate Chop",20);
            move.put("Razor Leaf",30);
            move.put("Mega Kick",30);
            move.put("Metronome",null);
            move.put("Poison Sting",10 );
            move.put("Psychic",45);
            move.put("Psybeam",25);
            move.put("Quick Attack",20);
            move.put("Solar Beam", 45);
            move.put("Thunder",45);
            move.put("Thunderbolt",35);
            move.put("Wing Attack",25);
}

/**
* Gets the move called.
* @return move
*/
public Map<String, Integer> getMove(){
return move;
}
/**
* Sets the move.
*
*/
public setMove(Map<String, Integer> move){
this.move = move;
}

} // End of Pokemon move class