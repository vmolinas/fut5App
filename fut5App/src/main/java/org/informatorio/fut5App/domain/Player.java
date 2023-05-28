package org.informatorio.fut5App.domain;

import java.util.UUID;

public class Player {
    private UUID id;
    private String name;
    private String surname;
    private int height;
    private String position;
    private int numberOfGoals;
    private int numberOfMatches;
    private boolean isCaptain;
    private int shirtNumber;
    private Team team;

    public Player(UUID id, String name, String surname, int height, String position, int numberOfGoals, int numberOfMatches, boolean isCaptain, int shirtNumber, Team team) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.position = position;
        this.numberOfGoals = numberOfGoals;
        this.numberOfMatches = numberOfMatches;
        this.isCaptain = isCaptain;
        this.shirtNumber = shirtNumber;
        this.team = team;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    //others methods
    public void goalCounter() {
        numberOfGoals++;
    }

    public void matchCounter() {
        numberOfMatches++;
    }
}