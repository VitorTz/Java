public class Time {

    private static final double timeStarted = System.nanoTime();
    private static double lastFrameTime = 0.0;

    private static double getTime(){
        return (System.nanoTime() - timeStarted) * 1E-9;
    }

    public static double getDeltaTime() {
        final double time = getTime();
        final double deltaTime = time - Time.lastFrameTime;
        Time.lastFrameTime = time;
        return deltaTime;
    }

    public static void sleep(int fps){
        try {
            Thread.sleep(fps);
        } catch (Exception ignored) {}
    }

    public static void sleep(){
        sleep(Contants.WINDOW_FPS);
    }
}
