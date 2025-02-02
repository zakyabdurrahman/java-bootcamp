public class InterfaceEx {
    public static void main(String[] args) {
        //both battleship and submarine use same interface = warship
        //if a method has dependency for warship both can be used even if different classes
        Battleship hood = new Battleship();
        Submarine october = new Submarine();
        Sailor sailor = new Sailor();
        sailor.sortie(october);
    }



}
