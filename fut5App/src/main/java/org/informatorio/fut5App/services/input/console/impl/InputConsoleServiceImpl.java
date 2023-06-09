package org.informatorio.fut5App.services.input.console.impl;

import org.informatorio.fut5App.services.input.console.InputServiceInterface;

import java.util.Scanner;

public class InputConsoleServiceImpl implements InputServiceInterface {
    @Override
    public void createScanner() {
        System.out.println("Entrada por consola");
    }

    @Override
    public Scanner getScanner() {
        return null;
    }

    @Override
    public void closeScanner() {
        System.out.println("Entrada por consola terminado");
    }
}