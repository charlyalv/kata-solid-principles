package game.domain.hero;

public class MagicianHero extends MeleeHero {

    public void castMagic() {
        gameEventObserver.observeHeroMagicCasting(this);
        // Do some casting action
    }

    @Override
    public void punch() {
        // This hero is a magician. Does not punch.
    }
}
