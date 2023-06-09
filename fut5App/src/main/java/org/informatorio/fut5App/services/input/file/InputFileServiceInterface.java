package org.informatorio.fut5App.services.input.file;

import org.informatorio.fut5App.domain.Player;

import java.util.List;

public interface InputFileServiceInterface {
    //Import the list of players of a team from a file.
    List<Player> loadPlayerByFile(String filePath);
//    List<Team> loadTeamByFile(Strign )
}