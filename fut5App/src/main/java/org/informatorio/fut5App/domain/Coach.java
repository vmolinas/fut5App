package org.informatorio.fut5App.domain;

public class Coach {
    private String name;
    private String surname;
    private int age;
    private Team team;

    public Coach() {
    }

    public Coach(String name, String surname, int age, Team team) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.team = team;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", team=" + team +
                '}';
    }
}