package it.univaq.model;
import java.io.IOException;

public interface Exportable {
    void export(String filePath) throws IOException;
}