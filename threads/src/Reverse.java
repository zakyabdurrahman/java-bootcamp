public class Reverse extends Thread{
    public void run() {
        for (int i = 10; i > 1; i--) {
            System.out.println(i);
        }
    }
}
