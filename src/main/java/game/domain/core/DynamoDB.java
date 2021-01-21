package game.domain.core;

import game.domain.player.PlayerRecord;
import game.domain.player.PlayerInfo;

import java.util.Set;

public class DynamoDB {
    public Set<PlayerInfo> getUserInfo(long userId) {
        // Get a db connection and query
        return Set.of(new PlayerInfo("current-level", "level_1"));
    }

    public void saveOrUpdate(PlayerRecord playerRecord) {
        // Save or update player to db
    }

    public void delete(long userId) {
        // Delete player from db
    }
}
