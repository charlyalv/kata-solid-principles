package game.domain.input;

import game.domain.core.GameCore;

public class KeyboardInput implements PlayerInput {

    public final GameCore gameCore;

    public KeyboardInput(GameCore gameCore) {
        this.gameCore = gameCore;
    }

    @Override
    public void captureKeyPressed(KeyAction keyAction) {
        gameCore.processInput(convertTo(keyAction));
    }

    @Override
    public void captureBottomPressed(ButtonAction keyAction) {
        // Log warning, this is not supported
    }

    @Override
    public void captureStickPressed(ButtonAction keyAction) {
        // Log warning, this is not supported
    }

    private UserAction convertTo(KeyAction keyAction) {
        // Map to user action
        return UserAction.GENERIC;
    }
}
