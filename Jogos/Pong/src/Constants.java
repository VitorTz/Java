import java.awt.*;

class Constants {

    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HIEGHT = 600;
    public static final String WINDOW_TITLE = "Pong!";
    public static final boolean IS_WINDOW_VISIBLE = true;
    public static final boolean IS_WINDOW_RESIZABLE = false;
    private static final float[] HSB_COLOR = Color.RGBtoHSB(24, 24, 24, new float[3]);
    public static final Color WINDOW_BG_COLOR = Color.getHSBColor(HSB_COLOR[0], HSB_COLOR[1], HSB_COLOR[2]);
    public static final int SLEEP_TIME = 30;

}
