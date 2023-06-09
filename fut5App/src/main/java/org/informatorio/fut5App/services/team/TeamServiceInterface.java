package org.informatorio.fut5App.services.team;

import org.informatorio.fut5App.domain.Team;

import java.util.List;

public interface TeamServiceInterface {
    Team createTeam();
    void teamList(List<Team> teams);
    List<Team> searchTeam(List<Team> teams);
    void deleteTeam(Team team);
}