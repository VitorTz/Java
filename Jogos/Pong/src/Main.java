public class Main {

    public static void main(String[] args) {
        var window = new Window();
        startWindow(window);
    }

    private static void startWindow(Window window){
        var t = new Thread(window);
        t.start();
    }
}