public class Main {
    public static void main(String[] args) {
        Task normal = new Task();
        Reverse reverse = new Reverse();

        //both class must be child of thread, and has a run method
        normal.start();
        reverse.start();
    }
}
