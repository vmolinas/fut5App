package org.informatorio.fut5App.services.output.file;

import org.informatorio.fut5App.domain.Player;

import java.util.List;

public interface OutputFileServiceInterface {
    void exportPlayer(List<Player> players, String destinationPath);
}