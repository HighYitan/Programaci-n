package ACT7_3;
/**
 * 
 * @author srhig
 */
public class Elevator {
    //Atributs
    private boolean doorOpen; // porta oberta o tancada
    private int currentFloor; // pis actual, per defecte 1
    private static int TOP_FLOOR, BOTTOM_FLOOR; // planta màxima i mínima.
    //Constructor
    public Elevator(boolean doorOpen, int currentFloor) {
        this.doorOpen = doorOpen;
        this.currentFloor = currentFloor;
    }
    static {
        TOP_FLOOR=5;
        BOTTOM_FLOOR=1;
    }
    //Métodes especifics
    /**
     * 
     */
    public void openDoor(){ // modifica 'doorOpen'=true
        System.out.println("...Obrint la porta");
        setDoorOpen(true);
    }
    /**
     * 
     */
    public void closeDoor(){ // modifica 'doorOpen'=false
        System.out.println("...Tancant la porta");
        setDoorOpen(false);
    }
    /**
     * 
     */
    public void goUp(){ // augmenta 'currentFloor' si ascensor no está al darrer pis i la porta está tancada
        System.out.println("...Anant a d'alt");
        if (!getDoorOpen()) {
            if (getCurrentFloor() < TOP_FLOOR) {
                setCurrentFloor(getCurrentFloor() + 1);
            } 
            else {
                throw new IllegalArgumentException("No és possible pujar, ja en el pis de d'alt");
            }
        } 
        else {
            throw new IllegalArgumentException("Porta oberta, cal tancar-la");
        }
        System.out.println("\tPis actual: " + currentFloor);        
    }
    /**
     * 
     */
    public void goDown(){ // disminueix 'currentFloor' si ascensor no está al primer pis i la porta está tancada
        System.out.println("...Anant abaix");
        if (!getDoorOpen()) {
            if (getCurrentFloor() > BOTTOM_FLOOR) {
                setCurrentFloor(getCurrentFloor() - 1);
            } else {
                throw new IllegalArgumentException("No és possible baixar, ja en el pis de baix");
            }
        } else {
            throw new IllegalArgumentException("Porta oberta, cal tancar-la");
        }
        System.out.println("\tPis actual: " + currentFloor);
    }
    //Getters y setters
    public boolean getDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public static int getTOP_FLOOR() {
        return TOP_FLOOR;
    }

    public static void setTOP_FLOOR(int TOP_FLOOR) {
        Elevator.TOP_FLOOR = TOP_FLOOR;
    }

    public static int getBOTTOM_FLOOR() {
        return BOTTOM_FLOOR;
    }

    public static void setBOTTOM_FLOOR(int BOTTOM_FLOOR) {
        Elevator.BOTTOM_FLOOR = BOTTOM_FLOOR;
    }
    
}