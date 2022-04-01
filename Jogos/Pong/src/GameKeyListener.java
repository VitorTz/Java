import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class GameKeyListener implements KeyListener {

    private static final boolean[] gameKeys = new boolean[128];

    private boolean isValidKey(int key){
        return (key >= 0 && key < 128);
    }

    private boolean isValidKey(KeyEvent e){
        return isValidKey(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (isValidKey(e)){
            gameKeys[e.getKeyCode()] = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (isValidKey(e)){
            gameKeys[e.getKeyCode()] = false;
        }
    }

    public boolean isKeyPressed(int e){
        if (isValidKey(e))
            return gameKeys[e];
        return false;
    }

    public boolean isKeyPressed(KeyEvent e){
        return isKeyPressed(e.getKeyCode());
    }
}
