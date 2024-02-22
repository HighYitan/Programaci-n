package ACT6_3;
public class Elevator {
    //Atributs
    public boolean doorOpen = false; // porta oberta o tancada
    public int currentFloor = 1; // pis actual, per defecte 1
    public static int TOP_FLOOR = 5, BOTTOM_FLOOR = 1; // planta màxima i mínima.
    //Métodes
    public void openDoor(){ // modifica 'doorOpen'=true
        System.out.println("...Obrint la porta");
        doorOpen = true;
    }
    public void closeDoor(){ // modifica 'doorOpen'=false
        System.out.println("...Tancant la porta");
        doorOpen = false;
    }
    public void goUp(){ // augmenta 'currentFloor' si ascensor no está al darrer pis i la porta está tancada
        if(currentFloor < TOP_FLOOR && doorOpen == false){
            System.out.println("...Anant a d'alt");
            currentFloor++;
        }
        else {
            System.err.println("No és possible pujar, ja en el pis de d'alt o la porta està oberta i hi ha que tancarla.");
        }
        System.out.println("\tPis actual: " + currentFloor);
    }
    public void goDown(){ // disminueix 'currentFloor' si ascensor no está al primer pis i la porta está tancada
        if(currentFloor > BOTTOM_FLOOR && doorOpen == false){
            System.out.println("...Anant abaix");
            currentFloor--;
        }
        else {
            System.err.println("No és possible baixar, ja en el pis de baix o la porta està oberta i hi ha que tancarla.");
        }
        System.out.println("\tPis actual: " + currentFloor);
    }
}