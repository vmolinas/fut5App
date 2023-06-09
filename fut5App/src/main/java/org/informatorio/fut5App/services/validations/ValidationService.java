package org.informatorio.fut5App.services.validations;

public interface ValidationService {
    Boolean stringValidation(String fact);
    Boolean dateValidation(String fact);
    Boolean intValidation(int fact);
}