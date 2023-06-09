package org.informatorio.fut5App.services.coach.impl;

import org.informatorio.fut5App.domain.Coach;
import org.informatorio.fut5App.domain.Team;
import org.informatorio.fut5App.services.coach.CoachServiceInterface;
import org.informatorio.fut5App.services.input.console.impl.InputServiceImpl;

public class CoachServiceImpl implements CoachServiceInterface {
    @Override
    public Coach createCoach(Team team) {
        System.out.println("Datos del entranador. Equipo: " + team.getName());
        Coach coach = new Coach();
        coach.setName(InputServiceImpl.consoleInput("Nombre: "));
        coach.setSurname(InputServiceImpl.consoleInput("Apellido: "));
        coach.setAge(Integer.parseInt(InputServiceImpl.consoleInput("Edad: ")));

        coach.setTeam(team);
        team.setCoach(coach);
        return coach;
    }
}