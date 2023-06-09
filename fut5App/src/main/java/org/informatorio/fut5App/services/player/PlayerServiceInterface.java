package org.informatorio.fut5App.services.player;

import org.informatorio.fut5App.domain.Player;
import org.informatorio.fut5App.domain.Team;

public interface PlayerServiceInterface {
    Player createPlayer(Team team);
}