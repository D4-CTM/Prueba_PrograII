
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class BlockBuster {
    private ArrayList<BlockBusterItem> Stock;
    
    public BlockBuster(){
        Stock = new ArrayList();
    }
    // -- ARRAY MAGER DE JUEGOS --
    public final void addGame(int codigo, String nombre, String Consola, double PrecioRenta){
        Stock.add(new VideoGameItem(codigo, nombre, Consola, PrecioRenta));
    }
    
    public final VideoGameItem getGame(int Codigo, int pos){
        if (pos < Stock.size()){
            if (Stock.get(pos).getCodigo() == (Codigo)){
                return (VideoGameItem) Stock.get(pos);
            }
        }
        return null;
    }
    // -- ARRAY MANAGER DE PELICULAS --
    public final void addMove(int codigo, String nombre, double PrecioRenta){
        Stock.add(new MovieItem(codigo, nombre, PrecioRenta));
    }
    
    public final MovieItem getMovie(int Codigo, int pos){
        if (pos < Stock.size()){
            if (Stock.get(pos).getCodigo() == (Codigo)){
                return (MovieItem) Stock.get(pos);
            }
        }
        return null;
    }
    // -- FUNCIONES GENERALES --
    public final boolean isCodeValid(int Codigo){
        for (BlockBusterItem Item : Stock){
            if (Item.getCodigo() == Codigo){
                return false;
            }
        }
        return true;
    }
    
    public final void Rentar(int Codigo, String TipoItem, int Dias){
        if (isCodeValid(Codigo)){
            double Data;
            String Info;
            switch (TipoItem){
                case "PELICULA" ->{
                    Data = getMovie(Codigo, 0).pagoRenta(Dias);
                    Info = getMovie(Codigo, 0).toString();
                }
                case "JUEGO" ->{
                    Data = getGame(Codigo, 0).pagoRenta(Dias);
                    Info = getGame(Codigo, 0).toString();
                }
                default -> {
                    Info = "Item no existe";
                    Data = 0;
                }
            }
            if (Info.equals("Item no existe")){
                JOptionPane.showMessageDialog(null, Info + "\nPrecio a pagar: "+Data, TipoItem, Dias);
            } else JOptionPane.showMessageDialog(null, Info);
        }
    }
    
}
