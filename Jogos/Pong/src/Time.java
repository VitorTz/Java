
class Time {

    private static final long timeStarted = System.nanoTime();
    private static double lastFrameTime = 0;

    private static double getTime(){
        return (System.nanoTime() - timeStarted) * 1E-9;
    }

    public static double getDeltaTime(){
        final double time = getTime();
        final double deltaTime = time - lastFrameTime;
        lastFrameTime = time;
        return deltaTime;
    }

    public static void sleep(){
        try {
            Thread.sleep(Constants.SLEEP_TIME);
        } catch (Exception ignored){}
    }
}
