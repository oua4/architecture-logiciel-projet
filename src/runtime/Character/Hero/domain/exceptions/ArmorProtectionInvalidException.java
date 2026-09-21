package runtime.Character.Hero.domain.exceptions;

public class ArmorProtectionInvalidException  extends RuntimeException {
    public ArmorProtectionInvalidException(String armorProtection) {
        super("L'amure " + armorProtection + " est invalide.");
    }
}