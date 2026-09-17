package runtime.Character.Hero.domain.exceptions;

public class TypeNameInvalidException extends RuntimeException {
    public TypeNameInvalidException(String type) {
        super("Le type : " + type + " n'est pas disponible");
    }
}
