package org.informatorio.fut5App;

import org.informatorio.fut5App.bootstrap.BootstrapData;
import org.informatorio.fut5App.domain.Player;
import org.informatorio.fut5App.services.input.file.InputFileServiceInterface;
import org.informatorio.fut5App.services.input.file.impl.InputFileServiceImpl;
import org.informatorio.fut5App.services.output.file.OutputFileServiceInterface;
import org.informatorio.fut5App.services.output.file.impl.OutputFileServiceImpl;

import java.io.IOException;
import java.util.List;

public class App
{
    private static final InputFileServiceInterface inputFileService = new InputFileServiceImpl();
    private static final OutputFileServiceInterface outputFileService = new OutputFileServiceImpl();
    public static void main( String[] args ) throws IOException {
        BootstrapData.initData();
        String filePath = "src/main/java/org/informatorio/fut5App/resources/input/playerList.txt";
        List<Player> playerList = inputFileService.loadPlayerByFile(filePath);

        System.out.println(playerList.size());
        System.out.println("Players");
        for (Player player: playerList){
            System.out.println(player.toString());
        }
        //String outputFilePath = "src/main/java/org/informatorio/fut5App/resources/playerOutput.csv";
        //outputFileService.exportPlayer(BootstrapData., outputFilePath);
    }
}