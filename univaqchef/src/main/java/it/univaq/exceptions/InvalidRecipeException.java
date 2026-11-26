package it.univaq.exceptions;

/**
 * Da controllare se vogliamo farla estendere da Exception o RuntimeException
 * InvalidRecipeException
 */
public class InvalidRecipeException extends RuntimeException {
    public InvalidRecipeException(String message) {
        super(message);
    }
}
