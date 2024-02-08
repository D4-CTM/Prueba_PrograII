/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1pr2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author harle
 */
public abstract class BlockBusterItem {
    int codigo;
    String nombre;
    double PrecioRenta;
    Calendar FechaAdd  = Calendar.getInstance(); 
    
    public BlockBusterItem(int codigo, String nombre, double PrecioRenta){
    
        this.nombre=nombre;
        this.codigo=codigo;
        this.PrecioRenta=PrecioRenta;
    }
    
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Precio de renta: $" + PrecioRenta;
    }

    // Abstract method
    public abstract double pagoRenta(int dias);
    
}
