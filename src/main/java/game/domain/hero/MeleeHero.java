package game.domain.hero;

import game.domain.core.GameEventObserver;

public class MeleeHero implements Hero {
    private int punchPower;
    protected GameEventObserver gameEventObserver;

    @Override
    public void punch() {
        gameEventObserver.observeHeroPunch(this);
        // process hero actions for hero
    }

    @Override
    public void jump() {
        gameEventObserver.observeHeroJump(this);
        // process jump action for hero
    }

    //TODO: Next week this class will change in order to support a new turbo punch feature
}
