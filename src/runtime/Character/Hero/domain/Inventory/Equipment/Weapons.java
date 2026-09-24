package runtime.Character.Hero.domain.Inventory.Equipment;


public class Weapons {
    private String weaponName;
    private String weaponDamage;
    private String weaponStat;

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
