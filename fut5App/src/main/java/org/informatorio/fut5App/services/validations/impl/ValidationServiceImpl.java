package org.informatorio.fut5App.services.validations.impl;

import org.informatorio.fut5App.services.validations.ValidationService;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ValidationServiceImpl implements ValidationService {
    @Override
    public Boolean stringValidation(String fact) {
        Boolean keepOn = false;
        if (fact.length() <= 0){
            System.out.println("String invalido: " + fact);
            keepOn = true;
        }
        return keepOn;
    }

    @Override
    public Boolean dateValidation(String fact) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        Boolean keepOn = true;
        try{
            if (fact.length() <= 0){
                System.out.println("Fecha invalida: " + fact);
                return false;
            }
            LocalDate.parse(fact, formatter);
        }catch (DateTimeException e){
            System.out.println("Fecha invalida: " + fact);
            return false;
        }
        return keepOn;
    }

    @Override
    public Boolean intValidation(int fact) {
        Boolean keepOn = false;
        if (fact <= 0){
            System.out.println("Numero invalido: " + fact);
            keepOn = true;
        }
        return keepOn;
    }
}