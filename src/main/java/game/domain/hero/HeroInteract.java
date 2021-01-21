package game.domain.hero;

import java.util.Set;

public class HeroInteract {

    private final Set<Hero> heroes;

    public HeroInteract(Set<Hero> heroes) {
        this.heroes = heroes;
    }

    public void processEvent(Object obj) {
        // Process a event between heroes
    }
}
