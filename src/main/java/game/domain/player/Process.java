package game.domain.player;

public class Process {
    private String stage;
    private int level;
    private int currentPunchPower;
    private int powerLevelMultiplier;

    // A lot of process indicators

    public Process(String stage, int level, int currentPunchPower, int powerLevelMultiplier) {
        this.stage = stage;
        this.level = level;
        this.currentPunchPower = currentPunchPower;
        this.powerLevelMultiplier = powerLevelMultiplier;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCurrentPunchPower() {
        return currentPunchPower;
    }

    public void setCurrentPunchPower(int currentPunchPower) {
        this.currentPunchPower = currentPunchPower;
    }

    public int getPowerLevelMultiplier() {
        return powerLevelMultiplier;
    }

    public void setPowerLevelMultiplier(int powerLevelMultiplier) {
        this.powerLevelMultiplier = powerLevelMultiplier;
    }
}
