public class StatNumberInvalidException extends RuntimeException {
    public StatNumberInvalidException() {
        super("Les caractéristiques doivent être entre 0 et 20");
    }
}
