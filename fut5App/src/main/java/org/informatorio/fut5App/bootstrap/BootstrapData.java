package org.informatorio.fut5App.bootstrap;

import org.informatorio.fut5App.domain.Position;
import org.informatorio.fut5App.domain.Team;
import org.informatorio.fut5App.services.menu.impl.CoachMenu;
import org.informatorio.fut5App.services.menu.impl.MainMenu;
import org.informatorio.fut5App.services.menu.impl.PlayerMenu;
import org.informatorio.fut5App.services.menu.impl.TeamMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BootstrapData {
    public static Map<String, Position> positions = new HashMap<>();
    public static List<Team> teams;
    public static final MainMenu mMenu = new MainMenu();
    public static final CoachMenu cMenu = new CoachMenu();
    public static final PlayerMenu pMenu = new PlayerMenu();
    public static final TeamMenu tMenu = new TeamMenu();
    public static void initData() {
        positions = new HashMap<>();
        teams = new ArrayList<Team>();
        loadPositions(positions);
    }
    public static void loadPositions(Map<String, Position> positions){
        positions = new HashMap<>();
        positions.put("Arquero", new Position("Arquero"));
        positions.put("Defensor", new Position("Defensor"));
        positions.put("Mediocampista", new Position("Mediocampista"));
        positions.put("Delantero", new Position("Delantero"));
    }
}