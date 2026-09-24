package runtime.Character.Hero.domain.exceptions;

public class EquipmentDoesNotMatchTypeException extends RuntimeException {
    public EquipmentDoesNotMatchTypeException(String equipmentName, String heroType) {
        super("L'équipement " + equipmentName + " n'est pas compatible avec la classe " + heroType);
    }
}