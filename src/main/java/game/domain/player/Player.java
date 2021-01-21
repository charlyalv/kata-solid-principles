package game.domain.player;

import game.domain.core.DynamoDB;

import java.util.Map;
import java.util.Set;

public class Player {

    private static final DynamoDB DYNAMO_DB = new DynamoDB();

    public void createPlayer(String name, Map<String, String> attributes) {
        // Do some parsing work
        DYNAMO_DB.saveOrUpdate(new PlayerRecord());
    }

    public Process getProcess(long userId) {
        return calculateProcess(DYNAMO_DB.getUserInfo(userId));
    }

    private Process calculateProcess(Set<PlayerInfo> playerInfo) {
        // Do some expensive computations in order to calculate process
        return new Process("level_1", 10, 30, 3);
    }
}