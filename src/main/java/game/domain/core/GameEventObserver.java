package game.domain.core;

import game.domain.hero.HeroInteract;

public class GameEventObserver {

    private final World world;
    private final HeroInteract heroInteract;

    // This works by injection
    public GameEventObserver(World world, HeroInteract heroInteract) {
        this.world = world;
        this.heroInteract = heroInteract;
    }

    public void observeHeroPunch(Object obj) {
        // Do some task with punch event
        world.processEvent(obj);
        heroInteract.processEvent(obj);
    }

    public void observeHeroMagicCasting(Object obj) {
        // Do some task with magic casting
        world.processEvent(obj);
        heroInteract.processEvent(obj);
    }

    public void observeHeroJump(Object obj) {
        // Do some task with jump event
        world.processEvent(obj);
    }
}
