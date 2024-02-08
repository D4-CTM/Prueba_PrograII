/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josue
 */
public class VideoGameItem extends BlockBusterItem{
    private String Consola;
    private int Renta = 30;
    
    public VideoGameItem(int codigo, String nombre, String Consola, double PrecioRenta) {
        super(codigo, nombre, PrecioRenta);
        this.Consola = Consola;
    }
        
    public boolean isConsolaValid(String Consola){
        return (Consola.equals("WII") || Consola.equals("PLAYSTATION") || Consola.equals("XBOX"));
    }
    
    @Override
    public String toString(){
        return super.toString() + " - GAME";
    }
    
    
    @Override
    public double pagoRenta(int dias) {
        return (dias * Renta);
    }
    
}
