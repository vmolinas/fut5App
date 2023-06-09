package org.informatorio.fut5App.services.menu.impl;

import org.informatorio.fut5App.services.menu.MenuInterface;

public class MainMenu implements MenuInterface {
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // Si se está ejecutando en Windows, utiliza el comando "cls" para limpiar la consola
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Si se está ejecutando en otro sistema operativo, utiliza el comando "clear" para limpiar la consola
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            // Manejo de excepciones
            System.out.println("No se pudo limpiar la consola: " + e.getMessage());
        }
    }
    @Override
    public void mainMenu() {
        clearConsole();
        System.out.println("******************");
        System.out.println("**** FUTBOL 5 ****");
        System.out.println("******************");
        System.out.println("MENU PRINCIPAL");
        System.out.println("1) Equipos");
        System.out.println("2) Jugadores");
        System.out.println("3) Entrenadores");
        System.out.println("x) Salir");
        System.out.print("Elija una opcion para proceder: ");
    }
}