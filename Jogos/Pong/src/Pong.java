public class Pong {

    public static void main(String[] args) {
        Window window = new Window();
        startWindow(window);
    }

    private static void startWindow(Window w){
        Thread t = new Thread(w);
        t.start();

    }
}
