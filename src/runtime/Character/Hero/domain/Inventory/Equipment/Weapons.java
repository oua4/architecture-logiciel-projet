package runtime.Character.Hero.domain.Inventory.Equipment;

public class Weapons {
    private String weaponName;
    private String weaponDamage;
    private String weaponStat;

    public Weapons(String weaponName, String weaponDamage, String weaponStat) {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.weaponStat = weaponStat;

        String[] weapons = {"Long Sword", "Axe", "Mace", "Dagger", "Bow", "Stick"};
    }
}
