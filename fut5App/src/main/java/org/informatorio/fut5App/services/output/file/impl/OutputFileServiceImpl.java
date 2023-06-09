package org.informatorio.fut5App.services.output.file.impl;

import org.informatorio.fut5App.domain.Player;
import org.informatorio.fut5App.services.output.file.OutputFileServiceInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputFileServiceImpl implements OutputFileServiceInterface {
    @Override
    public void exportPlayer(List<Player> players, String destinationPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath))){

            for (Player player: players) {
                String line = player.getId() + ";" +
                        player.getName() + ";" +
                        player.getSurname() + ";" +
                        player.getHeight() + ";" +
                        ((player.getPosition() != null)?player.getPosition().getPosition():"") + ";" +
                        player.getNumberOfGoals() + ";" +
                        player.getNumberOfMatches() + ";" +
                        player.isCaptain() + ";" +
                        player.getShirtNumber() + ";" +
                        ((player.getTeam() != null)?player.getTeam().getName():"");

                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}