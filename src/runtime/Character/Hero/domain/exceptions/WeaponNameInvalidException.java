package runtime.Character.Hero.domain.exceptions;

public class WeaponNameInvalidException extends RuntimeException {
    public WeaponNameInvalidException(String weaponName) {
        super("L'arme " + weaponName + " n'est pas disponible.");
    }
}