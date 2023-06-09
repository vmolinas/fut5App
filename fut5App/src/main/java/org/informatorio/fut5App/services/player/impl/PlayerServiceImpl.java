package org.informatorio.fut5App.services.player.impl;

import org.informatorio.fut5App.domain.Player;
import org.informatorio.fut5App.domain.Team;
import org.informatorio.fut5App.services.input.console.impl.InputServiceImpl;
import org.informatorio.fut5App.services.player.PlayerServiceInterface;

import java.util.Collections;
import java.util.UUID;

public class PlayerServiceImpl implements PlayerServiceInterface {

    @Override
    public Player createPlayer(Team team) {
        System.out.println("Datos del jugador. Equipo: " + team.getName());
        Player player = new Player();
        player.setId(UUID.randomUUID());
        player.setName(InputServiceImpl.consoleInput("Nombre: "));
        player.setSurname(InputServiceImpl.consoleInput("Apellido: "));
        player.setHeight(Integer.parseInt(InputServiceImpl.consoleInput("Edad: ")));
        player.setNumberOfGoals(Integer.parseInt(InputServiceImpl.consoleInput("Cantidad de Goles: ")));
        player.setNumberOfMatches(Integer.parseInt(InputServiceImpl.consoleInput("Cantidad de partidos: ")));
        player.setCaptain(Boolean.parseBoolean(InputServiceImpl.consoleInput("Es capitan? true/false: ")));
        player.setShirtNumber(Integer.parseInt(InputServiceImpl.consoleInput("Numero de camiseta: ")));

        player.setTeam(team);
        team.setPlayers(Collections.singletonList(player));
        return player;
    }

    @Override
    public void createPlayer() {

    }
}