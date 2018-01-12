package gdx.reid;

import com.badlogic.gdx.Game;

public class GdxGame extends Game {

    ScrMenu scrMenu;
    ScrPlay scrPlay;
    int nScreen;

    @Override
    public void create() {
        this.setScreen(new ScrMenu(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
