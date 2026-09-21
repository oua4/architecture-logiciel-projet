package runtime.Character.Hero.domain.Inventory.Equipment;

import runtime.Character.Hero.domain.exceptions.ArmorProtectionInvalidException;

public class Armors {
    private final String armorProtection;
    private final String armorClass;

    public Armors(String armorProtection){
        if (armorProtection.equalsIgnoreCase("Sans armure")) {
            this.armorProtection = "Sans armure";
            this.armorClass = "10 + modificateur de Dextérité";
        } else if (armorProtection.equalsIgnoreCase("Armure de cuir")) {
            this.armorProtection = "Armure de cuir";
            this.armorClass = "11 + modificateur de Dextérité";
        } else if (armorProtection.equalsIgnoreCase("Armure de mailles")) {
            this.armorProtection = "Armure de mailles";
            this.armorClass = "16 (sans bonus de Dextérite)";
        } else throw new ArmorProtectionInvalidException(armorProtection);
    }

    public String getArmorProtection() {
        return armorProtection;
    }

    public String getArmorClass() {
        return armorClass;
    }
}
