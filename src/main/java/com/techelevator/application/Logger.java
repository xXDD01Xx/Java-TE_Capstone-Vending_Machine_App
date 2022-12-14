package com.techelevator.application;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private final String PATH = "src/main/resources";
    private final String AUDIT_LOG_FILENAME = "audit.txt";
    private File fileObj;
    private static PrintWriter writer;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public Logger() {
        fileObj = new File(PATH, AUDIT_LOG_FILENAME);

        try
        {
            this.writer = new PrintWriter(new FileOutputStream(this.fileObj), true);
            writer.println();
        } catch (FileNotFoundException e) {
            System.out.println(ANSI_RED + "Error: File NOT Found Exception" + ANSI_RESET);
        }
    }

    public static void write(String messageToLog) {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter currentFormatted = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        String formattedDateAndTime = current.format(currentFormatted);
        String messageWithTimeStamp = formattedDateAndTime + " " + messageToLog;
        writer.println(messageWithTimeStamp);
        writer.flush();
    }

    public void close() {
        this.writer.flush();
        this.writer.close();
        this.writer = null;
    }

    public boolean isClosed() {
        return this.writer == null;
    }

}
