
package gdx.reid;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 *
 * @author johnr5818
 */
public class Button extends Sprite{
    int nX, nY, nW, nH;
    public Button(int _nX, int _nY, int _nW, int _nH, String sFile){
        super(new Texture(Gdx.files.internal(sFile)));
        nX = _nX;
        nY = _nY;
        nW = _nW;
        nH = _nH;
        setPosition(nX, nY);
        setFlip(false, true);
        setSize(nW, nH);
    }
    //Thanks Ameer and Joel!!!!!! 
    public boolean isMousedOver(){
        if(this.getBoundingRectangle().contains(Gdx.input.getX(), Gdx.input.getY())){ 
            return true;
        }
       return false;
    }
   
}