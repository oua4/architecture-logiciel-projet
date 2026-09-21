package src.runtime.Lobby.domain.exceptions;

public class NumberHeroesExceedMaximum extends RuntimeException {
    public NumberHeroesExceedMaximum(String message) {
        super("Le nombre de héros excède le maximum du lobby");
    }
}
