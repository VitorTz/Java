import javax.swing.JFrame;
import java.awt.*;


class Window extends JFrame implements Runnable {

    private final Graphics2D graphics2D;
    private final GameKeyListener keyListener = new GameKeyListener();
    private final Rect playerRect = new Rect(Constants.PLAYER_ONE_X, Constants.RECT_Y);
    private final PlayerController playerController = new PlayerController(this.playerRect, this.keyListener);

    Window(){
        this.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        this.setTitle(Constants.WINDOW_TITLE);
        this.setLocationRelativeTo(null); // Centraliza a tela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.addKeyListener(this.keyListener);
        this.graphics2D = (Graphics2D) this.getGraphics();
        Constants.TOOLBAR_HEIGHT = this.getInsets().top;
    }

    private void fillScreen(Graphics2D graphics2D){
        // Pinta o background da tela
        graphics2D.setColor(Constants.WINDOW_BG_COLOR);
        graphics2D.fillRect(0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
    }

    private void draw(Graphics dbg, double deltaTime){
        Graphics2D graphics2D = (Graphics2D) dbg;
        fillScreen(graphics2D);
        playerController.main(graphics2D, deltaTime);
    }

    private void update(){
        final double deltaTime = Time.getDeltaTime();
        Image img = createImage(this.getWidth(), this.getHeight());
        Graphics dbg = img.getGraphics();
        this.draw(dbg, deltaTime);
        this.graphics2D.drawImage(img, 0, 0, this);
    }

    @Override
    public void run() {
        while (true){
            this.update();
            Time.sleep();
        }
    }
}
