package gdx.reid;

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
    Texture txtBack;
    Game game;
    Button btnPlay;
    Button btnContr;
    SpriteBatch batch;
    OrthographicCamera oc;

    public ScrMenu(Game game) {
        this.game = game;
        txtBack=new Texture("background.jpg");
        
    }

    @Override
    public void show() {

        oc = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        oc.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        oc.update();
        batch = new SpriteBatch();
        btnPlay = new Button(275, 140, 80, 80, "play.psd");
        btnContr = new Button(400, 140, 100, 80, "Contr.jpg");

    }

    private void changeScreen() {
        if (Gdx.input.isKeyPressed(Input.Keys.P)) {
            game.setScreen(new ScrPlay(game));
        } else if (Gdx.input.isKeyPressed(Input.Keys.C)) {
            game.setScreen(new ScrContr(game));
        }
        if (Gdx.input.justTouched()) {
            if (btnPlay.isMousedOver()) {
                System.out.println("play");
                game.setScreen(new ScrPlay(game));
            }
            if (btnContr.isMousedOver()) {
                System.out.println("contr");
                game.setScreen(new ScrContr(game));
            }
        }
    }

    @Override
    public void render(float f) {
        changeScreen();


        Gdx.gl.glClearColor(1, 1, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        batch.begin();
        batch.setProjectionMatrix(oc.combined);
        btnContr.draw(batch);
        btnPlay.draw(batch);
        batch.draw(txtBack, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        
        batch.end();

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
