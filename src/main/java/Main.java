
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author solan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      inicializar();
        // TODO code application logic here
        Menu m = new Menu();
       m.PokemonesVivos(Pokemones());
        m.setVisible(true);
    }
    public static int y,x =0;
    public static int [][] vida =new int [151][12];
      
      public static void inicializar(){
       for( x=  0; x < 151 ; x++){
            for ( y=  0; y <12; y++){
               vida[x][y]=0;    
            }          
        }
       }
      
    
      public static String[][] Pokemones() {
    String[][] Pokemon = {
{"Bulbasaur"},
{"Ivysaur"},
{"Venusaur"},
{"Charmander"},
{"Charmeleon"},
{"Charizard"},
{"Squirtle"},
{"Wartortle"},
{"Blastoise"},
{"Caterpie"},
{"Metapod"},
{"Butterfree"},
{"Weedle"},
{"Kakuna"},
{"Beedrill"},
{"Pidgey"},
{"Pidgeotto"},
{"Pidgeot"},
{"Rattata"},
{"Raticate"},
{"Spearow"},
{"Fearow"},
{"Ekans"},
{"Arbok"},
{"Pikachu"},
{"Raichu"},
{"Sandshrew"},
{"Sandslash"},
{"Nidoran♀"},
{"Nidorina"},
{"Nidoqueen"},
{"Nidoran♂"},
{"Nidorino"},
{"Nidoking"},
{"Clefairy"},
{"Clefable"},
{"Vulpix"},
{"Ninetales"},
{"Jigglypuff"},
{"Wigglytuff"},
{"Zubat"},
{"Golbat"},
{"Oddish"},
{"Gloom"},
{"Vileplume"},
{"Paras"},
{"Parasect"},
{"Venonat"},
{"Venomoth"},
{"Diglett"},
{"Dugtrio"},
{"Meowth"},
{"Persian"},
{"Psyduck"},
{"Golduck"},
{"Mankey"},
{"Primeape"},
{"Growlithe"},
{"Arcanine"},
{"Poliwag"},
{"Poliwhirl"},
{"Poliwrath"},
{"Abra"},
{"Kadabra"},
{"Alakazam"},
{"Machop"},
{"Machoke"},
{"Machamp"},
{"Bellsprout"},
{"Weepinbell"},
{"Victreebel"},
{"Tentacool"},
{"Tentacruel"},
{"Geodude"},
{"Graveler"},
{"Golem"},
{"Ponyta"},
{"Rapidash"},
{"Slowpoke"},
{"Slowbro"},
{"Magnemite"},
{"Magneton"},
{"Farfetch'd"},
{"Doduo"},
{"Dodrio"},
{"Seel"},
{"Dewgong"},
{"Grimer"},
{"Muk"},
{"Shellder"},
{"Cloyster"},
{"Gastly"},
{"Haunter"},
{"Gengar"},
{"Onix"},
{"Drowzee"},
{"Hypno"},
{"Krabby"},
{"Kingler"},
{"Voltorb"},
{"Electrode"},
{"Exeggcute"},
{"Exeggutor"},
{"Cubone"},
{"Marowak"},
{"Hitmonlee"},
{"Hitmonchan"},
{"Lickitung"},
{"Koffing"},
{"Weezing"},
{"Rhyhorn"},
{"Rhydon"},
{"Chansey"},
{"Tangela"},
{"Kangaskhan"},
{"Horsea"},
{"Seadra"},
{"Goldeen"},
{"Seaking"},
{"Staryu"},
{"Starmie"},
{"Mr. Mime"},
{"Scyther"},
{"Jynx"},
{"Electabuzz"},
{"Magmar"},
{"Pinsir"},
{"Tauros"},
{"Magikarp"},
{"Gyarados"},
{"Lapras"},
{"Ditto"},
{"Eevee"},
{"Vaporeon"},
{"Jolteon"},
{"Flareon"},
{"Porygon"},
{"Omanyte"},
{"Omastar"},
{"Kabuto"},
{"Kabutops"},
{"Aerodactyl"},
{"Snorlax"},
{"Articuno"},
{"Zapdos"},
{"Moltres"},
{"Dratini"},
{"Dragonair"},
{"Dragonite"},
{"Mewtwo"},
{"Mew"}, 
    }; 
    return Pokemon;
       }

}
