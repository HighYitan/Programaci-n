package ACT7_3;
public class Main {
    public static void main(String[] args) {
        Elevator privElevator = new Elevator(false, 1);        
        // Algunes d'aquestes operacions no són possibles segons la seqüència establerta
        try{
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
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}