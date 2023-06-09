package org.informatorio.fut5App.services.input.console;

import java.util.Scanner;

public interface InputServiceInterface {
    void createScanner();
    Scanner getScanner();
    void closeScanner();
}