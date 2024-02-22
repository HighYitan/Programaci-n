package ACT9_2B;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author srhig
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> persones = new ArrayList<>();
        ArrayList<Telefon> telefons = new ArrayList<>();
        // Persones
        carregaPersones(persones);
        
        // Telefons
        carregaTelefons(telefons, persones);
        
        // Encenent dispositius
        encenDispositius(telefons);
        
        // Validacions
        validaDispositius(telefons, persones);
        validaPersones(telefons, persones);

        // Apagant dispositius
        apagaDispositius(telefons);
    }
    private static void carregaPersones(ArrayList<Persona> persones){
        Persona persona;//Personas (Si se utiliza el mismo nombre de variable al hacer un segundo new se sobreescribe la información)
        //persona = new Persona("Khris", "1111", "teclado1", "empremta1", "rostro1");
        persona = new Persona(new ArrayList<>(Arrays.asList("1111", "teclado1", "empremta1", "rostro1")), "Khris");
        persones.add(persona);
        //persona = new Persona("Mario", "2222", "teclado2", "empremta2", "rostro2");
        persona = new Persona(new ArrayList<>(Arrays.asList("2222", "teclado2", "empremta2", "rostro2")), "Mario");
        persones.add(persona);
        //persona = new Persona("Luis", "3333", "teclado3", "empremta3", "rostro3");
        persona = new Persona(new ArrayList<>(Arrays.asList("3333", "teclado3", "empremta3", "rostro3")), "Luis");
        persones.add(persona);
        //persona = new Persona("Luislo", "4444", "teclado4", "empremta4", "rostro4");
        persona = new Persona(new ArrayList<>(Arrays.asList("4444", "teclado4", "empremta4", "rostro4")), "Luislo");
        persones.add(persona);
    }
    private static void carregaTelefons(ArrayList<Telefon> telefons, ArrayList<Persona> persones){
        Telefon telefon;
        //telefon = new Android("Samsung1", persones.get(0), "1111", "teclado1", "empremta1");
        telefon = new Android(new ArrayList<>(Arrays.asList("1111", "teclado1", "empremta1", "rostro1")), "Samsung1", persones.get(0)); //Mejor null en rostro1
        telefons.add(telefon);
        //telefon = new Android("Samsung2", persones.get(1), "2222", "teclado2", "empremta2");
        telefon = new Android(new ArrayList<>(Arrays.asList("2222", "teclado2", "empremta2", "rostro2")), "Samsung2", persones.get(1)); //Mejor null en rostro2
        telefons.add(telefon);
        //telefon = new IPhone8("Apple8", persones.get(2), "3333", "empremta3");
        telefon = new IPhone8(new ArrayList<>(Arrays.asList("3333", "teclado3", "empremta3", "rostro3")), "Apple8", persones.get(2)); //Mejor null en teclat3 y rostro3
        telefons.add(telefon);
        //telefon = new IPhone10("Apple10", persones.get(3), "4444", "empremta4", "rostro4");
        telefon = new IPhone10(new ArrayList<>(Arrays.asList("4444", "teclado4", "empremta4", "rostro4")), "Apple10", persones.get(3)); //Mejor null en teclat4
        telefons.add(telefon);
    }
    private static void validaDispositius(ArrayList<Telefon> telefons, ArrayList<Persona> persones){
        for(Persona persona : persones){ // Validacions Persona a Telefon
            for(Telefon telefono : telefons){
                System.out.print(persona.getNom() + ": " + telefono.validaPatrons(persona) + " ");
            }
        }
    }
    private static void validaPersones(ArrayList<Telefon> telefons, ArrayList<Persona> persones) {
        // Validacions Telefon a Persona
        System.out.print("\n");
        for (Telefon t : telefons) {
            for (Persona p : persones) {
                System.out.print("\t" + p.getNom() + ": " + t.validaPatrons(p) + " ");
            }
            System.out.print("\n");
        }
    }
    private static void encenDispositius(ArrayList<Telefon> telefons){
        //Encendiendo todos los telefonos
        for(Telefon telefono : telefons){
            telefono.on();
        }        
    }
    private static void apagaDispositius(ArrayList<Telefon> telefons){
        for(Telefon telefono : telefons){
            telefono.off();
        }        
    }
}