package game.domain.input;

import game.domain.core.GameCore;

public class GamepadInput implements PlayerInput {

    public final GameCore gameCore;

    public GamepadInput(GameCore gameCore) {
        this.gameCore = gameCore;
    }

    @Override
    public void captureKeyPressed(KeyAction keyAction) {
        // Log warning, this is not supported
    }

    @Override
    public void captureBottomPressed(ButtonAction keyAction) {
        gameCore.processInput(convertTo(keyAction));
    }

    @Override
    public void captureStickPressed(ButtonAction keyAction) {
        gameCore.processInput(convertTo(keyAction));
    }

    private UserAction convertTo(ButtonAction keyAction) {
        // Map to user action
        return UserAction.GENERIC;
    }
}
