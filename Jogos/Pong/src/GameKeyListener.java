import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener {

    private final boolean[] keys = new boolean[128];

    private boolean isValidKey(int e){
        return (e >= 0 && e < keys.length);
    }

    private boolean isValidKey(KeyEvent e){
        return isValidKey(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (isValidKey(e)){
            this.keys[e.getKeyCode()] = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (isValidKey(e)){
            this.keys[e.getKeyCode()] = false;
        }
    }

    public boolean isKeyPressed(int e){
        return (isValidKey(e) && this.keys[e]);
    }
}
