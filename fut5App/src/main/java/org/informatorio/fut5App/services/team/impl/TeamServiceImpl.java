package org.informatorio.fut5App.services.team.impl;

import org.informatorio.fut5App.domain.Coach;
import org.informatorio.fut5App.domain.Team;
import org.informatorio.fut5App.services.input.console.impl.InputServiceImpl;
import org.informatorio.fut5App.services.team.TeamServiceInterface;

import java.util.List;

public class TeamServiceImpl implements TeamServiceInterface {
    public static final
    @Override
    public Team createTeam() {
        Team newTeam = new Team();
        newTeam.setName(InputServiceImpl.consoleInput("Nombre del equipo: "));
        newTeam.setCreationDate(InputServiceImpl.dateInput("Ingrese fecha de creacion dd/mm/aaaa"));
        if (newTeam != null){
            System.out.println("Equipo creado!");
            boolean keepOn = true;
            do {
                System.out.println("Agregar Tecnico? s/n");
                String loadCoach = InputServiceImpl.scanner.nextLine();
                loadCoach.toLowerCase();
                switch (loadCoach){
                    case "s":
//                        Coach coach = s
                }
            }
        }
    }

    @Override
    public void teamList(List<Team> teams) {

    }

    @Override
    public List<Team> searchTeam(List<Team> teams) {
        return null;
    }
}