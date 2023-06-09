package org.informatorio.fut5App;

import org.informatorio.fut5App.bootstrap.BootstrapData;
import org.informatorio.fut5App.services.input.file.InputFileServiceInterface;
import org.informatorio.fut5App.services.input.file.impl.InputFileServiceImpl;
import org.informatorio.fut5App.services.menu.Menu;
import org.informatorio.fut5App.services.output.file.OutputFileServiceInterface;
import org.informatorio.fut5App.services.output.file.impl.OutputFileServiceImpl;

import java.io.IOException;

public class App
{
    private static final InputFileServiceInterface inputFileService = new InputFileServiceImpl();
    private static final OutputFileServiceInterface outputFileService = new OutputFileServiceImpl();
    public static void main( String[] args ) throws IOException {
        BootstrapData.initData();

        Menu.mainMenu();
    }
}