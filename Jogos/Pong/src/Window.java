import javax.swing.JFrame;
import java.awt.Graphics2D;

class Window extends JFrame implements Runnable {

    private final Graphics2D graphics;
    private final GameKeyListener keyListener = new GameKeyListener();

    Window(){
        this.setSize(Contants.WINDOW_WIDTH, Contants.WINDOW_HEIGHT);
        this.setTitle(Contants.WINDOW_TITLE);
        this.setVisible(Contants.WINDOW_IS_VISIBLE);
        this.setResizable(Contants.WINDOW_IS_RESIZABLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.graphics = (Graphics2D) this.getGraphics();
        this.addKeyListener(this.keyListener);
    }

    private void update(){
        final double dt = Time.getDeltaTime();
    }

    private void fillScreen(){
        this.graphics.setColor(Contants.WINDOW_COLOR);
        this.graphics.fillRect(0, 0, Contants.WINDOW_WIDTH, Contants.WINDOW_HEIGHT);
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
