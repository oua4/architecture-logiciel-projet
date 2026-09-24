package runtime.Lobby.domain.exceptions;

public class NumberPlayersExceedMaximum extends RuntimeException {
    public NumberPlayersExceedMaximum() {
        super("Le nombre de héros excède le maximum du lobby");
    }
}
