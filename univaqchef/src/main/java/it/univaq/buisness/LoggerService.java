package it.univaq.buisness;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.FileAppender;

public class LoggerService {
    /* Istanza statica e privata (SIngleton) */
    private static final LoggerService instance = new LoggerService();
    /* Motore di logging */
    private final Logger log4jLogger;

    private LoggerService() {
        log4jLogger = Logger.getLogger("UnivaqChef");
        /*
         * Aspetto del log: data leggibile da esseri umani, formatta i livelli(INFO,
         * WARN, ERROR)
         * stampa il messaggio e inserisce il carriage return per la riga successiva
         */
        PatternLayout layout = new PatternLayout("[%d{yyyy-MM-dd HH:mm:ss}]%-5p - %m%n");
    }

    /* Metodo che restituisce l'unica instanza comune a tutto il programma */
    public static LoggerService getInstance() {
        return instance;
    }
}
