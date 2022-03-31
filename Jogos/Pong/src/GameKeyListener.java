import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener {

    private final boolean[] keyPressed = new boolean[128];


    private boolean isValidKey(int e){
        // Verifica se o código da tecla é valido
        return (e >= 0 && e < 128);
    }

    private boolean isValidKey(KeyEvent e){
        // Verifica se o código da tecla é valido
        return isValidKey(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        // Seta o valor da tecla para true
        if (isValidKey(e))
            this.keyPressed[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Seta o valor da tecla para false
        if (isValidKey(e))
            this.keyPressed[e.getKeyCode()] = false;
    }

    public boolean isKeyPressed(int keyCode){
        // Retorna true caso a tecla esteja pressionada
        if (isValidKey(keyCode))
            return this.keyPressed[keyCode];
        return false;
    }

    public boolean getKeyPressed(int keyCode){
        // Retorna true se a tecla está pressionada
        // e seta o valor dela para false.
        boolean isPressed = isKeyPressed(keyCode);
        if (isPressed)
            this.keyPressed[keyCode] = false;
        return isPressed;
    }
}
