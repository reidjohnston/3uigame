package gdxr.eid;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author johnr5818
 */

public class ScrMenu implements Screen {
   
    Game game;
    Button btnPlay;
    SpriteBatch batch;
    OrthographicCamera oc;

    public ScrMenu(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
      
        oc = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        oc.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        oc.update();
        batch = new SpriteBatch();
        btnPlay = new Button(110, 110, 0, Gdx.graphics.getHeight() - 200, "play.jpg");
        return;
    }

    private void changeScreen() {
        if (Gdx.input.isKeyPressed(Input.Keys.P)) {
            game.setScreen(new ScrPlay(game));
        } else if (Gdx.input.isKeyPressed(Input.Keys.C)) {
            game.setScreen(new ScrContr(game));
        }
    }

    @Override
    public void render(float f) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        batch.begin();
        btnPlay.draw(batch);
        batch.setProjectionMatrix(oc.combined);
        batch.end();
        changeScreen();
    }

    @Override
    public void resize(int i, int i1) {
        return;
    }

    @Override
    public void pause() {
        return;
    }

    @Override
    public void resume() {
        return;
    }

    @Override
    public void hide() {
        return;
    }

    @Override
    public void dispose() {
        return;
    }
}
