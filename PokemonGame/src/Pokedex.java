// This is the Utility for the project. This is the class do the actions that the Pokedex is involved with
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Pokedex {

    public static void main(String[] args) {
        Map<Integer, String> entry = new HashMap<>();


        /*
        The operation "put(Key, Value);" is used for storing values
        It can even replace already set values.
        Use this method to increase the number value with the corresponding Pokémon that is assigned to it.
         */
        entry.put(1, "Bulbasaur: A strange seed was planted on its back at birth. The plant sprouts and grows with this POKéMON.");
        entry.put(2, "Ivysaur: When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.");
        entry.put(3, "Venusaur: The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.");
        entry.put(4, "Charmander: Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.");
        entry.put(5, "Charmeleon: When it swings its burning tail, it elevates the temperature to unbearably high levels.");
        entry.put(6, "Charizard: Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally.");
        entry.put(7, "Squirtle: After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.");
        entry.put(8, "Wartortle: Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance.");
        entry.put(9, "Blastoise: A brutal POKéMON with pressurized water jets on its shell. They are used for high speed tackles.");
        entry.put(10, "Caterpie: Its short feet are tipped with suction pads that enable it to tirelessly climb slopes and walls.");
        entry.put(11, "Metapod: This POKéMON is vulnerable to attack while its shell is soft, exposing its weak and tender body.");
        entry.put(12, "Butterfree: In battle, it flaps its wings at high speed to release highly toxic dust into the air.");
        entry.put(13, "Weedle: Often found in forests, eating leaves. It has a sharp venomous stinger on its head.");
        entry.put(14, "Kakuna: Almost incapable of moving, this POKéMON can only harden its shell to protect itself from predators.");
        entry.put(15, "Beedrill: Flies at high speed and attacks using its large venomous stingers on its forelegs and tail.");
        entry.put(16, "Pidgey: A common sight in forests and woods. It flaps its wings at ground level to kick up blinding sand.");
        entry.put(17, "Pidgeotto: Very protective of its sprawling territorial area, this POKéMON will fiercely peck at any intruder.");
        entry.put(18, "Pidgeot: When hunting, it skims the surface of water at high speed to pick off unwary prey such as MAGIKARP.");
        entry.put(19, "Rattata: Bites anything when it attacks. Small and very quick, it is a common sight in many places.");
        entry.put(20, "Raticate: It uses its whiskers to maintain its balance. It apparently slows down if they are cut off.");
        entry.put(21, "Spearow: Eats bugs in grassy areas. It has to flap its short wings at high speed to stay airborne.");
        entry.put(22, "Fearow: With its huge and magnificent wings, it can keep aloft without ever having to land for rest.");
        entry.put(23, "Ekans: Moves silently and stealthily. Eats the eggs of birds, such as PIDGEY and SPEAROW, whole.");
        entry.put(24, "Arbok: It is rumored that the ferocious warning markings on its belly differ from area to area.");
        entry.put(25, "Pikachu: It keeps its tail raised to monitor its surroundings. If you yank its tail, it will try to bite you.");
        entry.put(26, "Raichu: Its long tail serves as a ground to protect itself from its own high voltage power.");
        entry.put(27, "Sandshrew: Burrows deep underground in arid locations far from water. It only emerges to hunt for food.");
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
        entry.put(39, "Jigglypuff:Jigglypuff (Japanese: プリン Purin) is a dual-type Normal/Fairy Pokémon " + "introduced in Generation I.\n " + "Prior to Generation VI, it was a pure Normal-type Pokémon.\n" + "It evolves from Igglybuff when leveled up with high friendship and evolves into Wigglytuff when exposed to a Moon Stone.");
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
        entry.put(149, "Dragonite:Dragonite (Japanese: カイリュー Kairyu) is a dual-           type Dragon/Flying pseudo-legendary Pokémon " + "introduced in Generation I.\n " + "It evolves from Dragonair at level 55 and is the final form of Dratini.");
        entry.put(150, "Mewtwo");
        entry.put(151, "Mew");

        //This is to take User input. Example I input 1, I should get Bulbasuar returned
        //#TODO if Pokemon is owned then add the extra text
        Scanner sc = new Scanner(System.in);
        System.out.println("Search a Pokémon by their National Pokédex Number: ");
        int i = sc.nextInt();
        System.out.println(entry.get(i));
    }
}
