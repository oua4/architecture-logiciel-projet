package runtime.Character.Hero.domain.Inventory.Equipment;


public class Weapons {
    private String weaponName;
    private String weaponDamage;
    private String weaponStat;
    public static final String LONG_SWORD = "Épée longue";
    public static final String AXE = "Hache";
    public static final String MACE = "Masse";
    public static final String DAGGER = "Dague";
    public static final String BOW = "Arc";
    public static final String STICK = "Bâton";

    public Weapons(String weaponName) {
        if (weaponName.equalsIgnoreCase(Weapons.LONG_SWORD)) {
            this.weaponName = Weapons.LONG_SWORD;
            this.weaponDamage = "1d8";
            this.weaponStat = "Force";
        } else if (weaponName.equalsIgnoreCase(Weapons.AXE)) {
            this.weaponName = Weapons.AXE;
            this.weaponDamage = "1d10";
            this.weaponStat = "Force";
        } else if (weaponName.equalsIgnoreCase(Weapons.MACE)) {
            this.weaponName = Weapons.MACE;
            this.weaponDamage = "1d6";
            this.weaponStat = "Force";
        } else if (weaponName.equalsIgnoreCase(Weapons.DAGGER)) {
            this.weaponName = Weapons.DAGGER;
            this.weaponDamage = "1d4";
            this.weaponStat = "Dextérité";
        } else if (weaponName.equalsIgnoreCase(Weapons.BOW)) {
            this.weaponName = Weapons.BOW;
            this.weaponDamage = "1d8";
            this.weaponStat = "Dextérité";
        } else if (weaponName.equalsIgnoreCase(Weapons.STICK)) {
            this.weaponName = Weapons.STICK;
            this.weaponDamage = "1d6";
            this.weaponStat = "Force";
        }
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
