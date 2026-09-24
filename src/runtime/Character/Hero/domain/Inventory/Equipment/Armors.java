package runtime.Character.Hero.domain.Inventory.Equipment;


import runtime.Character.Hero.domain.heroCharacteristics.Stats;

public class Armors {
    private String armorProtection;
    private int armorClass;

    public Armors(String armorProtection, Stats stats){
        if (armorProtection.equalsIgnoreCase("Sans armure")) {
            this.armorProtection = "Sans armure";
            this.armorClass = 10 + stats.getDexterityModifier();
        } else if (armorProtection.equalsIgnoreCase("Armure de cuir")) {
            this.armorProtection = "Armure de cuir";
            this.armorClass = 11 + stats.getDexterityModifier();
        } else if (armorProtection.equalsIgnoreCase("Armure de mailles")) {
            this.armorProtection = "Armure de mailles";
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
