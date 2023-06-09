package org.informatorio.fut5App.services.team.impl;

import org.informatorio.fut5App.domain.Player;
import org.informatorio.fut5App.domain.Team;
import org.informatorio.fut5App.services.input.console.impl.InputServiceImpl;
import org.informatorio.fut5App.services.player.PlayerServiceInterface;
import org.informatorio.fut5App.services.player.impl.PlayerServiceImpl;
import org.informatorio.fut5App.services.team.TeamServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeamServiceImpl implements TeamServiceInterface {
    private List<Team> teams;
    public static final PlayerServiceInterface playerService = new PlayerServiceImpl();
    @Override
    public Team createTeam() {
        Team newTeam = new Team();
        newTeam.setName(InputServiceImpl.consoleInput("Nombre del equipo: "));
        newTeam.setCreationDate(InputServiceImpl.dateInput("Ingrese fecha de creacion dd/mm/aaaa"));
        if (newTeam != null){
            System.out.println("Equipo creado!");
            boolean keepOn = true;
            do {
                System.out.println("Agregar Jugadores? s/n");
                String loadPlayers = InputServiceImpl.scanner.nextLine();
                loadPlayers.toLowerCase();
                if (loadPlayers.equals("s")) {
                    Player player = playerService.createPlayer(newTeam);
                } else {
                    keepOn = false;
                }
            }while (keepOn);
        } else {
            System.out.println("Error de carga");
            System.out.println("ENTER para continuar.");
        }
        return newTeam;
    }

    @Override
    public void teamList(List<Team> teams) {
        if (teams != null) {
            for (Team team: teams) {
                System.out.println(team.toString());
                for (Player player: team.getPlayers()) {
                    System.out.println(player.toString());
                }
            }
        } else {
            System.out.println("No se encontraron datos.");
            System.out.println("ENTER para continuar.");
        }
    }

    @Override
    public List<Team> searchTeam(List<Team> teams) {
        String input = InputServiceImpl.consoleInput("Buscar equipo: ");
        List<Team> view = new ArrayList<Team>();
        if (teams != null) {
            view = teams.stream().filter(team -> team.getName().contains(input)).collect(Collectors.toList());
        } else {
            System.out.println("No se encontraron datos.");
        }
        return view;
    }

    @Override
    public void deleteTeam(Team team) {
        teams.remove(team);
    }
}