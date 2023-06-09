package org.informatorio.fut5App.services.input.file.impl;

import org.apache.commons.io.FileUtils;
import org.informatorio.fut5App.bootstrap.BootstrapData;
import org.informatorio.fut5App.domain.Player;
import org.informatorio.fut5App.domain.Position;
import org.informatorio.fut5App.domain.Team;
import org.informatorio.fut5App.services.input.file.InputFileServiceInterface;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InputFileServiceImpl implements InputFileServiceInterface {
    @Override
    public List<Player> loadPlayerByFile(String filePath) {
        //Initialize player list
        List<Player> players = new ArrayList<>();

        try {
            List<String> inputLine = FileUtils.readLines(new File(filePath), StandardCharsets.UTF_8);
            for (String line: inputLine) {
                String[] portion = line.split(";");
                UUID id = UUID.fromString(portion[0]);
                String name = portion[1];
                String surname = portion[2];
                int height = Integer.parseInt(portion[3]);
                String position = portion[4];
                Position positionObject = BootstrapData.positions.get(position);
                int numberOfGoals = Integer.parseInt(portion[5]);
                int numberOfMatches = Integer.parseInt(portion[6]);
                boolean isCaptain = Boolean.parseBoolean(portion[7]);
                int shirtNumber = Integer.parseInt(portion[8]);
                String team = portion[9];
                Team teamObject = BootstrapData.teams.get(Integer.parseInt(team));

                Player player = new Player(id, name, surname, height, positionObject, numberOfGoals, numberOfMatches, isCaptain,shirtNumber, teamObject);
                players.add(player);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return players;
    }
}