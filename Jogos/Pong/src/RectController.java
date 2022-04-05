import java.awt.*;
import java.awt.geom.Rectangle2D;

public class RectController {

    private final Rect rect;

    RectController(Rect rect){
        this.rect = rect;
    }

    public void update(double deltaTime, DirectionEnum direction){
        final double speed = Constants.RECT_MOVEMENT_SPEED * deltaTime;
        if (direction == DirectionEnum.UP){
            if (this.rect.getTop() - speed >= Constants.TOOLBAR_HEIGHT){
                this.rect.setY(this.rect.getY() -speed);
            }
        } else if (direction == DirectionEnum.DOWN){
            if (this.rect.getBottom() + speed <= Constants.WINDOW_HEIGHT){
                this.rect.setY(this.rect.getY() + speed);
            }
        }
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.setColor(this.rect.getColor());
        graphics2D.fill(new Rectangle2D.Double(
                this.rect.getX(),
                this.rect.getY(),
                this.rect.getWidth(),
                this.rect.getHeight()
            )
        );
    }

}
