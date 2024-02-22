package ACT9_3B;
//import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList<Publicacio> publicacions;
        Publicacio llibre = new Llibre("Mein Kampf", 1925, 14.88, "Adolf Hitler");
        Publicacio revista = new Revista("NS-Frauen-Warte", 1934, 14.88, 1);
        //Llibre llibre = new Llibre("Java Programming", 2020, "John Smith", 35.0);
        //Revista revista = new Revista("Tech Magazine", 2021, 25, 10.0);
        Publicacio[] publicacions = {llibre, revista};
        /*for(Publicacio publicacio : publicacions){
            if(publicacio instanceof Llibre){
                
            }
        }*/
        // Polimorfismo
        for (Publicacio p : publicacions) {
            System.out.println(p.toString());
            System.out.println("Precio: €" + p.calculaPrecio());
            System.out.println("--------------");
        }
    }
}