package runtime.Character.Hero.domain.Inventory.Equipment;

import runtime.Character.Hero.domain.exceptions.WeaponNameInvalidException;

public class Weapons {
    private final String weaponName;
    private final String weaponDamage;
    private final String weaponStat;

    public Weapons(String weaponName) {
        if (weaponName.equalsIgnoreCase("Épée longue")) {
            this.weaponName = "Épée longue";
            this.weaponDamage = "1d8";
            this.weaponStat = "Force";
        } else if (weaponName.equalsIgnoreCase("Hache")) {
            this.weaponName = "Hache";
            this.weaponDamage = "1d10";
            this.weaponStat = "Force";
        } else if (weaponName.equalsIgnoreCase("Masse")) {
            this.weaponName = "Masse";
            this.weaponDamage = "1d6";
            this.weaponStat = "Force";
        } else if (weaponName.equalsIgnoreCase("Dague")) {
            this.weaponName = "Dague";
            this.weaponDamage = "1d4";
            this.weaponStat = "Dextérité";
        } else if (weaponName.equalsIgnoreCase("Arc")) {
            this.weaponName = "Arc";
            this.weaponDamage = "1d8";
            this.weaponStat = "Dextérité";
        } else if (weaponName.equalsIgnoreCase("Bâton")) {
            this.weaponName = "Bâton";
            this.weaponDamage = "1d6";
            this.weaponStat = "Force";
        } else throw new WeaponNameInvalidException(weaponName);
    }

    public String getWeaponName() {
        return weaponName;
    }

    public String getWeaponDamage() {
        return weaponDamage;
    }

    public String getWeaponStat() {
        return weaponStat;
    }
}
