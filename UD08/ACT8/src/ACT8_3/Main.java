package ACT8_3;
// Clase principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        // Crear instancias de empleados
        // Empleat empleat = new Empleat("pere","martinez",1000); // -> no es pot instanciar per ser abstract
        EmpleatPerCompteAliena alien1 = new EmpleatPerCompteAliena("Khris", "Máximo", 3000);
        EmpleatPerComptePropia propia1 = new EmpleatPerComptePropia("Mario", "Layton", 300, 8);
        EmpleatPerCompteAliena alien2 = new EmpleatPerCompteAliena("Khris", "Máximo", 3000);
        // Mostrar detalles de los empleados
        System.out.println(alien1.toString());
        System.out.println(propia1.toString());
        // Compara si los valores de los empleados son iguales
        System.out.println(alien1.equals(propia1));
        System.out.println(alien1.equals(alien2));
    }
}