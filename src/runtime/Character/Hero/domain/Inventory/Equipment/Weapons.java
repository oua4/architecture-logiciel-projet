package runtime.Character.Hero.domain.Inventory.Equipment;

import runtime.Character.Hero.domain.exceptions.WeaponNameInvalidException;

public class Weapons {
    public static final String LONG_SWORD = "Épée longue";
    public static final String AXE = "Hache";
    public static final String MACE = "Masse";
    public static final String DAGGER = "Dague";
    public static final String BOW = "Arc";
    public static final String STICK = "Bâton";

    private final String weaponName;
    private final String weaponDamage;
    private final String weaponStat;

    public Weapons(String weaponName) {
        if (weaponName.equalsIgnoreCase(LONG_SWORD)) {
            this.weaponName = LONG_SWORD;
            this.weaponDamage = "1d8";
            this.weaponStat = "Force";
        } else if (weaponName.equalsIgnoreCase(AXE)) {
            this.weaponName = AXE;
            this.weaponDamage = "1d10";
            this.weaponStat = "Force";
        } else if (weaponName.equalsIgnoreCase(MACE)) {
            this.weaponName = MACE;
            this.weaponDamage = "1d6";
            this.weaponStat = "Force";
        } else if (weaponName.equalsIgnoreCase(DAGGER)) {
            this.weaponName = DAGGER;
            this.weaponDamage = "1d4";
            this.weaponStat = "Dextérité";
        } else if (weaponName.equalsIgnoreCase(BOW)) {
            this.weaponName = BOW;
            this.weaponDamage = "1d8";
            this.weaponStat = "Dextérité";
        } else if (weaponName.equalsIgnoreCase(STICK)) {
            this.weaponName = STICK;
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