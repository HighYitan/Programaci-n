package ACT6_3;
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Algunes d'aquestes operacions no són possibles segons la seqüència establerta
        Elevator privElevator = new Elevator();
        privElevator.openDoor(); //Open
        privElevator.closeDoor(); //Closed
        privElevator.goDown(); //No se puede, ya estaba en la 1
        privElevator.goUp(); //2
        privElevator.goUp(); //3
        privElevator.openDoor(); //Open
        privElevator.closeDoor(); //Closed
        privElevator.goDown(); //2
        privElevator.openDoor(); //Open
        privElevator.goDown(); //Está abierta, no se puede
        privElevator.closeDoor(); //Closed
        privElevator.goDown(); //1
        privElevator.goDown(); //No se puede, ya estaba en la 1
    }
}