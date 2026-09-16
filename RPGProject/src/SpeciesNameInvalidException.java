public class SpeciesNameInvalidException extends RuntimeException {
    public SpeciesNameInvalidException(String species) {
        super("L'espèce : " + species + " n'est pas disponible");
    }
}
