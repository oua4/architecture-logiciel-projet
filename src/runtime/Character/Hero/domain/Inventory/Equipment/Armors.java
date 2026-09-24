package runtime.Character.Hero.domain.Inventory.Equipment;

import runtime.Character.Hero.domain.exceptions.ArmorProtectionInvalidException;
import runtime.Character.Hero.heroCharacteristics.Stats;

public class Armors {
    private final String armorProtection;
    private final int armorClass;

    public Armors(String armorProtection){
        if (armorProtection.equalsIgnoreCase("Sans armure")) {
            this.armorProtection = "Sans armure";
            this.armorClass = 10 + getDexterityModifier();
        } else if (armorProtection.equalsIgnoreCase("Armure de cuir")) {
            this.armorProtection = "Armure de cuir";
            this.armorClass = 11 + getDexterityModifier();
        } else (armorProtection.equalsIgnoreCase("Armure de mailles")) {
            this.armorProtection = "Armure de mailles";
            this.armorClass = 16;
        }
    }

    public String getArmorProtection() {
        return armorProtection;
    }

    public String getArmorClass() {
        return armorClass;
    }
}
