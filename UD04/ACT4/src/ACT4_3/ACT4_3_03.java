package ACT4_3;
public class ACT4_3_03 {
    public static void main(String[] args) {
        String title = "OPCIONES DEL PROGRAMA", opciones = "¿Qué opción deseas escoger? ";
        String[] menu = {"Primera opción", "Segunda opción", "tercera opción", "Cuarta opción"};
        switch(UtilitatsConsola.gestionarMenu(title, menu, opciones)){
            case 1->
                System.out.println("¡Has escogido la primera opción!");
            case 2->
                System.out.println("¡Has escogido la segunda opción!");
            case 3->
                System.out.println("¡Has escogido la tercera opción!");
            case 4->
                System.out.println("¡Has escogido la cuarta opción!");
        }
    }
}