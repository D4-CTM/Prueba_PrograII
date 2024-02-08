/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Calendar;
/**
 *
 * @author harle
 */
public class BlockBusterItem {
    
    int codigo;
    String nombre;
    int PrecioRenta;
    Calendar FechaAdd  = Calendar.getInstance(); 
    
    public BlockBusterItem(int codigo, String nombre, int PrecioRenta){
    
        this.nombre=nombre;
        this.codigo=codigo;
        this.PrecioRenta=PrecioRenta;
    }
    
}
