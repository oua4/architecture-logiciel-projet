package runtime.Character.Hero.domain.Inventory.Equipment;

import runtime.Character.Hero.domain.exceptions.ArmorProtectionInvalidException;

public class Armors {
    public static final String NO_ARMOR = "Sans armure";
    public static final String LEATHER_ARMOR = "Armure de cuir";
    public static final String CHAINMAIL_ARMOR = "Armure de mailles";

    private final String armorProtection;
    private final String armorClass;

    public Armors(String armorProtection){
        if (armorProtection.equalsIgnoreCase(NO_ARMOR)) {
            this.armorProtection = NO_ARMOR;
            this.armorClass = "10 + modificateur de Dextérité";
        } else if (armorProtection.equalsIgnoreCase(LEATHER_ARMOR)) {
            this.armorProtection = LEATHER_ARMOR;
            this.armorClass = "11 + modificateur de Dextérité";
        } else if (armorProtection.equalsIgnoreCase(CHAINMAIL_ARMOR)) {
            this.armorProtection = CHAINMAIL_ARMOR;
            this.armorClass = "16 (sans bonus de Dextérité)";
        } else throw new ArmorProtectionInvalidException(armorProtection);
    }

    public String getArmorProtection() {
        return armorProtection;
    }

    public String getArmorClass() {
        return armorClass;
    }
}