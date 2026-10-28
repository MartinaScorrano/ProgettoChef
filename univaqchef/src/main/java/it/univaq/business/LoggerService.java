package it.univaq.business;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import java.io.IOException;

import org.apache.log4j.FileAppender;

/**
 * La classe andra chiamata nel resto del programma in questo modo:
 * LoggerService.getInstance().info("messaggio") (oppure error ecc ecc)
 */

public class LoggerService {
    /* Istanza statica e privata (SIngleton) */
    private static final LoggerService instance = new LoggerService();
    /* Motore di logging */
    private final Logger log4jLogger;

    private LoggerService() {
        log4jLogger = Logger.getLogger("UnivaqChef");
        try {
            /*
             * Aspetto del log: data leggibile da esseri umani, formatta i livelli(INFO,
             * WARN, ERROR)
             * stampa il messaggio e inserisce il carriage return per la riga successiva
             */
            PatternLayout layout = new PatternLayout("[%d{yyyy-MM-dd HH:mm:ss}]%-5p - %m%n");
            /**
             * Crea il collegamento fisico al file "univaqchef.log" (true serve per non
             * canellare i vecchi log)
             */
            FileAppender fileAppender = new FileAppender(layout, "univaqchef.log", true);

            /* Aggancia il file al motore di logging e imposta il livello minimo a INFO */
            log4jLogger.addAppender(fileAppender);
            log4jLogger.setLevel(Level.INFO);

        } catch (IOException e) {
            System.err.println("Errore: Impossibile creare il file di log - " + e.getMessage());
            System.err.println(
                    "I possibili motivi sono:\n -Il Kernel ha rifiutato la richiesta di accesso alla memoria secondaria\n Mancanza di permessi di scrittura nella cartella\n Disco pieno\n File bloccato da un altro processo\n");
        }
    }

    /* Metodo che restituisce l'unica instanza comune a tutto il programma */
    public static LoggerService getInstance() {
        return instance;
    }

    /**
     * Metodi pubblici per permettere di loggare
     * 
     * @param message
     */
    public void info(String message) {
        log4jLogger.info(message);
    }

    public void error(String message) {
        log4jLogger.error(message);
    }

    public void warn(String message) {
        log4jLogger.warn(message);
    }
}
