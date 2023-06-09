package org.informatorio.fut5App.services.menu;

import org.informatorio.fut5App.bootstrap.BootstrapData;
import org.informatorio.fut5App.services.coach.CoachServiceInterface;
import org.informatorio.fut5App.services.coach.impl.CoachServiceImpl;
import org.informatorio.fut5App.services.input.console.impl.InputServiceImpl;
import org.informatorio.fut5App.services.player.PlayerServiceInterface;
import org.informatorio.fut5App.services.player.impl.PlayerServiceImpl;
import org.informatorio.fut5App.services.team.TeamServiceInterface;
import org.informatorio.fut5App.services.team.impl.TeamServiceImpl;

public class Menu {
    public static final TeamServiceInterface teamService = new TeamServiceImpl();
    public static final CoachServiceInterface coachService = new CoachServiceImpl();
    public static final PlayerServiceInterface playerService = new PlayerServiceImpl();
    public static void mainMenu() {
        boolean keepOn = true;
        InputServiceImpl.createScanner();
        while (keepOn){
            BootstrapData.mMenu.mainMenu();
            String option = InputServiceImpl.scanner.nextLine();
            switch (option) {
                case "1" -> teamMenu();
                case "2" -> playerMenu();
                case "3" -> coachMenu();
                case "x" -> keepOn = false;
            }
        }
    }

    private static void teamMenu() {
        boolean keepOn = true;
        while (keepOn) {
            BootstrapData.tMenu.teamMenu();
            String option = InputServiceImpl.scanner.nextLine();
            switch (option) {
                case "1" -> teamService.createTeam();

//                case "2":
//                    BootstrapData.teams.remove(teamService.deleteTeam());
//                    break;
                case "3" -> teamService.teamList(teamService.searchTeam(BootstrapData.teams));
                case "4" -> teamService.teamList(BootstrapData.teams);
                case "x" -> keepOn = false;
            }
        }
    }

    private static void playerMenu() {
        boolean keepOn = true;
        while (keepOn) {
            BootstrapData.pMenu.playerMenu();
            String option = InputServiceImpl.scanner.nextLine();
            switch (option) {
                case "1" -> playerService.createPlayer();
//                case "2" -> //buscar
                case "x" -> keepOn = false;
            }
        }
    }

    private static void coachMenu() {

    }
}