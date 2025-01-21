package main.model.log;

import main.model.constants.Constants;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String LOG_FILE_PATH = Constants.LOG_FILE_PATH;


    public static void log(String message) {
        try {
            File logFile = new File(LOG_FILE_PATH);

            if (!logFile.exists()) {
                logFile.createNewFile();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true));
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
            writer.write("[" + timestamp + "] " + message);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







