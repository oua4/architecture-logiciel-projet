package runtime.Character.Hero.domain.exceptions;

public class CharacterNameInvalidException extends RuntimeException {
    public CharacterNameInvalidException(String name) {
        super("Le nom" + name + " ne respecte pas les contraintes");
    }
}
