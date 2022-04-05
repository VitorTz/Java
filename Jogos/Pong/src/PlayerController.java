import java.awt.*;
import java.awt.event.KeyEvent;

public class PlayerController {

    private final Rect rect;
    private final GameKeyListener keyListener;
    private final RectController rectController;

    PlayerController(Rect rect, GameKeyListener keyListener){
        this.rect = rect;
        this.keyListener = keyListener;
        this.rectController = new RectController(this.rect);
    }

    private void update(double deltaTime){
        if (this.keyListener.isKeyPressed(KeyEvent.VK_DOWN)){
            this.rectController.update(deltaTime, DirectionEnum.DOWN);
        } else if (this.keyListener.isKeyPressed(KeyEvent.VK_UP)){
            this.rectController.update(deltaTime, DirectionEnum.UP);
        }
    }

    public void main(Graphics2D graphics2D, double deltaTime){
        this.update(deltaTime);
        this.rectController.draw(graphics2D);
    }
}
