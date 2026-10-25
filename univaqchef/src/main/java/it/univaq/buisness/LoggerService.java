package it.univaq.buisness;

import org.apache.log4j.BasicConfiguration;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.IOException;

public class LoggerService {
    /* Istanza statica e privata (SIngleton) */
    private static final LoggerService instance = new LoggerService();
    /*Motore di logging */
    private final Logger log4jLogger;

    private LoggerService() {
        log4jLogger = Logger.getLogger("UnivaqChef");
    }
}
