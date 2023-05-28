package org.informatorio.fut5App.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private Date creationDate;
    private List<Player> players = new ArrayList<>();
    private Coach coach;

    public Team(String name, Date creationDate, List<Player> players, Coach coach) {
        this.name = name;
        this.creationDate = creationDate;
        this.players = players;
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
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
}