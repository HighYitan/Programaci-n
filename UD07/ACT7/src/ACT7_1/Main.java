package ACT7_1;
/**
 *
 * @author srhig
 */
public class Main {
    public static void main(String[] args) {
        try{
            //Moduls DAW
            Modul modul1 = new Modul(7, "Programación");
            Modul modul2 = new Modul(8, "Gestión de bases de datos");
            Modul modul3 = new Modul(4, "Lenguaje de marcas");
            Modul modul4 = new Modul(7, "Sistemas de información");
            Modul modul5 = new Modul(3, "Entornos de desarollo");
            //Moduls ASIX
            Modul modul6 = new Modul(7, "Programación");
            Modul modul7 = new Modul(7, "Programación");
            Modul modul8 = new Modul(7, "Programación");
            Modul modul9 = new Modul(7, "Programación");
            Modul modul10 = new Modul(7, "Programación");
            //Moduls SMX
            Modul modul11 = new Modul(7, "Programación");
            Modul modul12 = new Modul(7, "Programación");
            Modul modul13 = new Modul(7, "Programación");
            Modul modul14 = new Modul(7, "Programación");
            Modul modul15 = new Modul(7, "Programación");
            //Cicle DAW
            Cicle cicle1 = new Cicle(25, "Desarrollo de Aplicaciones Web");
            cicle1.getModuls().add(modul1);
            cicle1.getModuls().add(modul2);
            cicle1.getModuls().add(modul3);
            cicle1.getModuls().add(modul4);
            cicle1.getModuls().add(modul5);
            //Cicle ASIX
            Cicle cicle2 = new Cicle(25, "Administración de Sistemas Informáticos y Redes");
            cicle2.getModuls().add(modul6);
            cicle2.getModuls().add(modul7);
            cicle2.getModuls().add(modul8);
            cicle2.getModuls().add(modul9);
            cicle2.getModuls().add(modul10);
            //Cicle SMX
            Cicle cicle3 = new Cicle(25, "Sistemas Microinformáticos y Redes");
            cicle3.getModuls().add(modul11);
            cicle3.getModuls().add(modul12);
            cicle3.getModuls().add(modul13);
            cicle3.getModuls().add(modul14);
            cicle3.getModuls().add(modul15);
            //Instituts
            Institut institut1 = new Institut("ED", "Emili Darder");
            institut1.getCicles().add(cicle1);
            institut1.getCicles().add(cicle2);
            institut1.getCicles().add(cicle3);
            System.out.print(institut1.mostraInstitut());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }   
}