package runtime.Character.Hero.domain.exceptions;

public class HeroNameAlreadyInUseException extends RuntimeException {
    public HeroNameAlreadyInUseException(String name) {
        super("Hero name : " + name + " is already taken");
    }
}
