
package gdx.reid;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.Texture;

public class Button extends Sprite {

    int nX, nY;
    float fW, fH;

    public Button(int _nX, int _nY, String sFile) {
        super(new Texture(Gdx.files.internal(sFile)));
        nX = _nX;
        nY = _nY;
        fW = getWidth();
        fH = getHeight();
        setPosition(nX, nY);
        setFlip(false, false);
    }

    public boolean isMousedOver() { // Checks if the mouse is over the button, not whether the mouse was clicked
        if (Gdx.input.getX() > nX && Gdx.input.getX() < nX + fW) {
            if (Gdx.input.getY() * (-1) + 744 > nY && Gdx.input.getY() * (-1) + 744 < nY + fH) {
                return true;
            }
        }
        return false;
    }
}