import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

class Window extends JFrame implements Runnable {

    private final Graphics2D graphics;
    private final GameKeyListener keyListener = new GameKeyListener();

    Window(){
        this.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HIEGHT);
        this.setTitle(Constants.WINDOW_TITLE);
        this.setVisible(Constants.IS_WINDOW_VISIBLE);
        this.setResizable(Constants.IS_WINDOW_RESIZABLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.graphics = (Graphics2D) this.getGraphics();
        this.addKeyListener(this.keyListener);
    }

    private void fillScreen(){
        this.graphics.setColor(Constants.WINDOW_BG_COLOR);
        this.graphics.fillRect(
                0,
                0,
                Constants.WINDOW_WIDTH,
                Constants.WINDOW_HIEGHT
        );
    }

    private void update(){
        final double deltaTime = Time.getDeltaTime();
    }

    @Override
    public void run() {
        while (true){
            this.fillScreen();
            this.update();
            Time.sleep();
        }
    }
}
