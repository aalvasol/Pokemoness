
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author solan
 */
public class Llamado {
    public void llamarTienda(){
        Tienda m = new Tienda();
       Menu me = new Menu();
        m.nombreTienda.setText(me.pokemonSeleccionado);
        m.setVisible(true);
        
    }
    public void llamarCuidados(){
        Cuidados m = new Cuidados();
       Menu me = new Menu();
        m.nombreCuidado.setText(me.pokemonSeleccionado);
        m.setVisible(true);
        
    }
     public void llamarEstado(){
        Estado m = new Estado();
       Menu me = new Menu();
     m.imagenPokemon(me.identificadorPokemon);
        m.nombreEstado.setText(me.pokemonSeleccionado);
        m.setVisible(true);
        
    }
   
}
