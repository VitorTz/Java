import java.awt.Color;

public class Constants {

    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;
    public static final String WINDOW_TITLE = "Pong";
    public static double TOOLBAR_HEIGHT;
    public static final int SLEEP_TIME = 30;

    // Window Color
    private static final float[] HSB_VALUES = Color.RGBtoHSB(20, 26, 33, null);
    public static final Color WINDOW_BG_COLOR = Color.getHSBColor(HSB_VALUES[0], HSB_VALUES[1], HSB_VALUES[2]);

    // Player & Ai
    public static final double RECT_WIDTH = 20.0;
    public static final double RECT_HEIGHT = 100.0;
    public static final Color RECT_COLOR = Color.WHITE;

    public static final double PLAYER_ONE_X = 0.0;
    public static final double AY_X = WINDOW_WIDTH - RECT_WIDTH;

    public static final double RECT_Y = WINDOW_HEIGHT / 2.0 - (RECT_HEIGHT / 2.0);

    public static double RECT_MOVEMENT_SPEED = 300.0;

    // Ball


}
