package ACT9_1;
/**
 *
 * @author srhig
 */
public class Main {
    public static void main(String[] args) {
        //Personas (Si se utiliza el mismo nombre de variable al hacer un segundo new se sobreescribe la información)
        Persona persona1 = new Persona("Khris", "1111", "teclado1", "empremta1", "rostro1");
        Persona persona2 = new Persona("Mario", "2222", "teclado2", "empremta2", "rostro2");
        Persona persona3 = new Persona("Luis", "3333", "teclado3", "empremta3", "rostro3");
        Persona persona4 = new Persona("Luislo", "4444", "teclado4", "empremta4", "rostro4");
        //Telefons
        //Android telefon1 = new Android("Samsung1", persones.get(0), false, "1111", "teclado1", "empremta1");
        //IPhone8 telefon2 = new IPhone8("Apple8", persones.get(1), false, "2222", "empremta2");
        //Telefon telefon3 = new IPhone10("Apple10", persones.get(2), false, "3333", "empremta3", "rostro3");
        Android telefon1 = new Android("Samsung1", persona1, false, "1111", "teclado1", "empremta1");
        Android telefon2 = new Android("Samsung2", persona2, false, "2222", "teclado2", "empremta2");
        IPhone8 telefon3 = new IPhone8("Apple8", persona3, false, "3333", "empremta3");
        IPhone10 telefon4 = new IPhone10("Apple10", persona4, false, "4444", "empremta4", "rostro4");
        //Encendiendo todos los telefonos
        telefon1.on();
        telefon2.on();
        telefon3.on();
        telefon4.on();
        //Validando
        System.out.println("Telefono1 - Android: ");
        System.out.print("\t" + persona1.getNom() + " " + telefon1.validaPatrons(persona1) + " ");
        System.out.print("\t" + persona2.getNom() + " " + telefon1.validaPatrons(persona2) + " ");
        System.out.print("\t" + persona3.getNom() + " " + telefon1.validaPatrons(persona3) + " ");
        System.out.print("\t" + persona4.getNom() + " " + telefon1.validaPatrons(persona4) + " ");
        System.out.println("");
        System.out.println("Telefono2 - Android: ");
        System.out.print("\t" + persona1.getNom() + " " + telefon2.validaPatrons(persona1) + " ");
        System.out.print("\t" + persona2.getNom() + " " + telefon2.validaPatrons(persona2) + " ");
        System.out.print("\t" + persona3.getNom() + " " + telefon2.validaPatrons(persona3) + " ");
        System.out.print("\t" + persona4.getNom() + " " + telefon2.validaPatrons(persona4) + " ");
        System.out.println("");
        System.out.println("Telefono3 - IPhone8: ");
        System.out.print("\t" + persona1.getNom() + " " + telefon3.validaPatrons(persona1) + " ");
        System.out.print("\t" + persona2.getNom() + " " + telefon3.validaPatrons(persona2) + " ");
        System.out.print("\t" + persona3.getNom() + " " + telefon3.validaPatrons(persona3) + " ");
        System.out.print("\t" + persona4.getNom() + " " + telefon3.validaPatrons(persona4) + " ");
        System.out.println("");
        System.out.println("Telefono4 - IPhone10: ");
        System.out.print("\t" + persona1.getNom() + " " + telefon4.validaPatrons(persona1) + " ");
        System.out.print("\t" + persona2.getNom() + " " + telefon4.validaPatrons(persona2) + " ");
        System.out.print("\t" + persona3.getNom() + " " + telefon4.validaPatrons(persona3) + " ");
        System.out.print("\t" + persona4.getNom() + " " + telefon4.validaPatrons(persona4) + " ");
        System.out.println("");
        //Apagando todos los telefonos
        telefon1.off();
        telefon2.off();
        telefon3.off();
        telefon4.off();
    }
}