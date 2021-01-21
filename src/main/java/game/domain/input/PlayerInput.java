package game.domain.input;

public interface PlayerInput {
    void captureKeyPressed(KeyAction keyAction);
    void captureBottomPressed(ButtonAction keyAction);
    void captureStickPressed(ButtonAction keyAction);
}
