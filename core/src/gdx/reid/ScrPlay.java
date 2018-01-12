package gdx.reid;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class ScrPlay implements Screen {

    Game game;

    public ScrPlay(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
        return;
    }

    private void changeScreen() {
        if (Gdx.input.isKeyPressed(Input.Keys.M)) {
            game.setScreen(new ScrMenu(game));
        }
        if (Gdx.input.isKeyPressed(Input.Keys.C)) {
            game.setScreen(new ScrContr(game));
        }
    }

    @Override
    public void render(float f) {
        Gdx.gl.glClearColor(1, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
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
