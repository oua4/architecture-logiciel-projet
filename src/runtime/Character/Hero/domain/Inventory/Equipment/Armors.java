package runtime.Character.Hero.domain.Inventory.Equipment;


import runtime.Character.Hero.domain.heroCharacteristics.Stats;

public class Armors {
    private String armorProtection;
    private int armorClass;

    public static final String NO_ARMOR = "Sans armure";
    public static final String LEATHER_ARMOR = "Armure de cuir";
    public static final String CHAINMAIL_ARMOR = "Armure de mailles";

    public Armors(String armorProtection, Stats stats){
        if (armorProtection.equalsIgnoreCase(Armors.NO_ARMOR)) {
            this.armorProtection = Armors.NO_ARMOR;
            this.armorClass = 10 + stats.getDexterityModifier();
        } else if (armorProtection.equalsIgnoreCase(Armors.LEATHER_ARMOR)) {
            this.armorProtection = Armors.LEATHER_ARMOR;
            this.armorClass = 11 + stats.getDexterityModifier();
        } else if (armorProtection.equalsIgnoreCase(Armors.CHAINMAIL_ARMOR)) {
            this.armorProtection = Armors.CHAINMAIL_ARMOR;
            this.armorClass = 16;
        }
    }

    public String getArmorProtection() {
        return armorProtection;
    }

    public int getArmorClass() {
        return armorClass;
    }
}
