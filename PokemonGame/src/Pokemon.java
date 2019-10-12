import java.util.HashMap;
import java.util.Map;

/**
 * The purpose of this class is to give each pokemon their own health, and move.
 */


public class Pokemon {
private Map<Integer, String> entry = new HashMap<>();
/**
* Sets up
*/
public void pokes() {

/*
The operation "put(Key, Value);" is used for storing values
It can even replace already set values.
Use this method to increase the number value with the corresponding Pokémon that is assigned to it.
*/
    entry.put(1, "Bulbasaur");
    entry.put(2, "Ivysaur");
    entry.put(3, "Venusaur");
    entry.put(4, "Charmander");
    entry.put(5, "Charmeleon");
    entry.put(6, "Charizard");
    entry.put(7, "Squirtle");
    entry.put(8, "Wartortle");
    entry.put(9, "Blastoise");
    entry.put(10, "Caterpie");
    entry.put(11, "Metapod");
    entry.put(12, "Butterfree");
    entry.put(13, "Weedle");
    entry.put(14, "Kakuna");
    entry.put(15, "Beedrill");
    entry.put(16, "Pidgey");
    entry.put(17, "Pidgeotto");
    entry.put(18, "Pidgeot");
    entry.put(19, "Rattata");
    entry.put(20, "Raticate");
    entry.put(21, "Spearow");
    entry.put(22, "Fearow");
    entry.put(23, "Ekans");
    entry.put(24, "Arbok");
    entry.put(25, "Pikachu");
    entry.put(26, "Raichu");
    entry.put(27, "Sandshrew");
    entry.put(28, "Sandslash");
    entry.put(29, "Nidoran♀");
    entry.put(30, "Nidorina");
    entry.put(31, "Nidoqueen");
    entry.put(32, "Nidoran♂");
    entry.put(33, "Nidorino");
    entry.put(34, "Nidoking");
    entry.put(35, "Clefairy");
    entry.put(36, "Clefable");
    entry.put(37, "Vulpix");
    entry.put(38, "Ninetales");
    entry.put(39, "Jigglypuff");
    entry.put(40, "Wigglytuff");
    entry.put(41, "Zubat");
    entry.put(42, "Golbat");
    entry.put(43, "Oddish");
    entry.put(44, "Gloom");
    entry.put(45, "Vileplume");
    entry.put(46, "Paras");
    entry.put(47, "Parasect");
    entry.put(48, "Venonat");
    entry.put(49, "Venomoth");
    entry.put(50, "Diglett");
    entry.put(51, "Dugtrio");
    entry.put(52, "Meowth");
    entry.put(53, "Persian");
    entry.put(54, "Psyduck");
    entry.put(55, "Golduck");
    entry.put(56, "Mankey");
    entry.put(57, "Growlithe");
    entry.put(58, "Arcanine");
    entry.put(59, "Poliwag");
    entry.put(60, "Poliwhirl");
    entry.put(61, "Nidorina");
    entry.put(62, "Abra");
    entry.put(63, "Nidoran♂");
    entry.put(64, "Kadabra");
    entry.put(65, "Alakazam");
    entry.put(66, "Machop");
    entry.put(67, "Machoke");
    entry.put(68, "Machamp");
    entry.put(69, "Bellsprout");
    entry.put(70, "Weepinbell");
    entry.put(71, "Victreebel");
    entry.put(72, "Tentacool");
    entry.put(73, "Tentacruel");
    entry.put(74, "Geodude");
    entry.put(75, "Graveler");
    entry.put(76, "Golem");
    entry.put(77, "Ponyta");
    entry.put(78, "Rapidash");
    entry.put(79, "Slowpoke");
    entry.put(80, "Slowbro");
    entry.put(81, "Dugtrio");
    entry.put(82, "Magneton");
    entry.put(83, "Farfetch'd");
    entry.put(84, "Doduo");
    entry.put(85, "Dodrio");
    entry.put(86, "Seel");
    entry.put(87, "Dewgong");
    entry.put(88, "Grimer");
    entry.put(89, "Muk");
    entry.put(90, "Shellder");
    entry.put(91, "Cloyster");
    entry.put(92, "Gastly");
    entry.put(93, "Haunter");
    entry.put(94, "Gengar");
    entry.put(95, "Onix");
    entry.put(96, "Drowzee");
    entry.put(97, "Hypno");
    entry.put(98, "Krabby");
    entry.put(99, "Kingler");
    entry.put(100, "Voltorb");
    entry.put(101, "Electrode");
    entry.put(102, "Exeggcute");
    entry.put(103, "Exeggutor");
    entry.put(104, "Cubone");
    entry.put(105, "Marowak");
    entry.put(106, "Hitmonlee");
    entry.put(107, "Hitmonchan");
    entry.put(108, "Lickitung");
    entry.put(109, "Koffing");
    entry.put(110, "Weezing");
    entry.put(111, "Rhyhorn");
    entry.put(112, "Rhydon");
    entry.put(113, "Chansey");
    entry.put(114, "Tangela");
    entry.put(115, "Kangaskhan");
    entry.put(116, "Horsea");
    entry.put(117, "Seadra");
    entry.put(118, "Goldeen");
    entry.put(119, "Seaking");
    entry.put(120, "Staryu");
    entry.put(121, "Starmie");
    entry.put(122, "Mr. Mime");
    entry.put(123, "Scyther");
    entry.put(124, "Jynx");
    entry.put(125, "Electabuzz");
    entry.put(126, "Magmar");
    entry.put(127, "Pinsir");
    entry.put(128, "Tauros");
    entry.put(129, "Magikarp");
    entry.put(130, "Gyarados");
    entry.put(131, "Lapras");
    entry.put(132, "Ditto");
    entry.put(133, "Eevee");
    entry.put(134, "Vaporeon");
    entry.put(135, "Jolteon");
    entry.put(136, "Flaeron");
    entry.put(137, "Porygon");
    entry.put(138, "Omanyte");
    entry.put(139, "Omastar");
    entry.put(140, "Kabuto");
    entry.put(141, "Kabutops");
    entry.put(142, "Aerodactyl");
    entry.put(143, "Snorlax");
    entry.put(144, "Articuno");
    entry.put(145, "Zapdos");
    entry.put(146, "Moltres");
    entry.put(147, "Dratini");
    entry.put(148, "Dragonair");
    entry.put(149, "Dragonite");
    entry.put(150, "Mewtwo");
    entry.put(151, "Mew");
}
/**
* Gets the pokemon called.
* @return pokemon
*/
public Map<Integer, String> getPoke(){
return entry;
}

/**
* Sets the Pokemon.
*/
public setPoke(Map<Integer, String> entry){
this.entry = entry;
}
/**
* Sets the Pokemon's health.
*/
public setHealth(){
}
/**
* Gets the Pokemon's health.
*/
public getHealth(){
}



} //End of Pokemon class



