package org.informatorio.fut5App.services.input.console.impl;

import org.informatorio.fut5App.services.input.console.InputServiceInterface;
import org.informatorio.fut5App.services.validations.ValidationService;
import org.informatorio.fut5App.services.validations.impl.ValidationServiceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputServiceImpl implements InputServiceInterface {
    public static Scanner scanner;
    public static final ValidationService validate = new ValidationServiceImpl();
    public static String consoleInput(String console){
        String input = "";
        boolean keepOn = false;
        do {
            System.out.print(console);
            input = scanner.nextLine();
            keepOn = validate.stringValidation(input);

        } while (keepOn);
        return input;
    }
    public static int consoleInput(int console){
        int input = 0;
        boolean keepOn = false;
        do {
            System.out.print(console);
            input = scanner.nextInt();
            keepOn = validate.intValidation(input);

        } while (keepOn);
        return input;
    }
    public static LocalDate dateInput(String console){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate returnDate = LocalDate.parse("2000-01-01");
        String input = "";
        boolean keepOn = false;
        do {
            System.out.println(console);
            input = scanner.nextLine();
            keepOn = validate.dateValidation(input);

            if (keepOn){
                returnDate = LocalDate.parse(input,formatter);
                keepOn = false;
            } else {
                keepOn = true;
                if (input.contentEquals("n")){
                    keepOn = false;
                }
            }
        } while (keepOn);
        return returnDate;
    }
    @Override
    public void createScanner() {
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
    }

    @Override
    public Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    @Override
    public void closeScanner() {
        if(scanner != null){
            scanner.close();
        }
    }
}