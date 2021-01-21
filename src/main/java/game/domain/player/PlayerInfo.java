package game.domain.player;

public class PlayerInfo {
    public String key;
    public String value;

    public PlayerInfo(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
