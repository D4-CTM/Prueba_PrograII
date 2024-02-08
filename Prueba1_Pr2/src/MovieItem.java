/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author harle
 */
public class MovieItem extends BlockBusterItem{
    private String estado;
    
    public MovieItem(int codigo, String nombre, double PrecioRenta) {
        super(codigo, nombre, PrecioRenta);
        this.estado = "ESTRENO"; // Estado por defecto
    }
    
       // toString method
    @Override
    public String toString() {
        return super.toString() + " - " + estado + " - Movie";
    }

        // Redefine pagoRenta method
    @Override
    public double pagoRenta(int dias) {
        double pago = super.PrecioRenta; // Precio base

        // Verificar estado y aplicar recargos según los días
        if (estado.equals("ESTRENO") && dias > 2) {
            pago += 50 * (dias - 2);
        } else if (estado.equals("NORMAL") && dias > 5) {
            pago += 30 * (dias - 5);
        }

        return pago;
    }
    
    
    public void evaluarEstado() {
        Calendar fechaActual = Calendar.getInstance();
        fechaActual.add(Calendar.MONTH, -5); // Restamos 5 meses a la fecha actual

        if (FechaAdd.before(fechaActual)) {
            estado = "NORMAL";
        }
    }
}
