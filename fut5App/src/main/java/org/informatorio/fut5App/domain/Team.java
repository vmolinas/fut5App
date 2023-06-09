package org.informatorio.fut5App.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private LocalDate creationDate;
    private List<Player> players = new ArrayList<>();
    private Coach coach;
    private Player captain;

    public Team() {
    }

    public Team(String name, LocalDate creationDate, List<Player> players, Coach coach, Player captain) {
        this.name = name;
        this.creationDate = creationDate;
        this.players = players;
        this.coach = coach;
        this.captain = captain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Player getCaptain() {
        return captain;
    }

    public void setCaptain(Player captain) {
        this.captain = captain;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", players=" + players +
                ", coach=" + coach +
                ", captain=" + captain +
                '}';
    }
}