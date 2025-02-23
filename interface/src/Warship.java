public interface Warship {
    void fire();


}

class Submarine implements Warship {


    public void fire() {
        System.out.println("Firing Torpedo");
    }
}

class Battleship implements  Warship {

    @Override
    public void fire() {
        System.out.println("Firing main guns");
    }
}
