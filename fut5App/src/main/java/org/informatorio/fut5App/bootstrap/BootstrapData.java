package org.informatorio.fut5App.bootstrap;

import org.informatorio.fut5App.domain.Position;
import org.informatorio.fut5App.domain.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BootstrapData {
    public static Map<String, Position> positions = new HashMap<>();
    public static List<Team> teams;
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