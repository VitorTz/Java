
class Time {

    private static long startedTime = System.nanoTime();
    private static double lastFrameTime = 0.0;

    public static double getDeltaTime(){
        final double time = (System.nanoTime() - lastFrameTime) * 1E-9;
        final double deltaTime = time - lastFrameTime;
        lastFrameTime = time;
        return deltaTime;
    }

    public static void sleep(){
        try{
            Thread.sleep(Constants.SLEEP_TIME);
        } catch (Exception ignored){}

    }
}
