
import java.util.ArrayList;

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
    
    public final VideoGameItem getGame(String nombre, int pos){
        if (pos < Stock.size()){
            if (Stock.get(pos).getName().equals(nombre)){
                return (VideoGameItem) Stock.get(pos);
            }
        }
        return null;
    }
    // -- ARRAY MANAGER DE PELICULAS --
    public final void addMove(int codigo, String nombre, double PrecioRenta){
        Stock.add(new MovieItem(codigo, nombre, PrecioRenta));
    }
    
    public final MovieItem getMovie(String nombre, int pos){
        if (pos < Stock.size()){
            if (Stock.get(pos).getName().equals(nombre)){
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
    
}
