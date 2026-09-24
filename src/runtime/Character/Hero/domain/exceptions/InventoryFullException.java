package runtime.Character.Hero.domain.exceptions;

public class InventoryFullException extends RuntimeException {
    public InventoryFullException() {
        super("L'inventaire est plein (maximum 10 objets).");
    }
}