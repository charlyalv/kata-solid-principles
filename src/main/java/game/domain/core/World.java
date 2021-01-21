package game.domain.core;

import game.domain.music.SpotifyPlugin;

public class World {

    private final SpotifyPlugin spotifyPlugin = new SpotifyPlugin();

    public void runWorld() {
        spotifyPlugin.playMusic();
    }

    public void processEvent(Object obj) {
        // Process a world event
    }
}
