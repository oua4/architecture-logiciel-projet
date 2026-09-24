package runtime.Character.Hero.domain.heroCharacteristics;

import runtime.Character.Hero.domain.exceptions.TypeNameInvalidException;
import runtime.Character.Hero.domain.Inventory.Equipment.Weapons;
import runtime.Character.Hero.domain.Inventory.Equipment.Armors;

public class Type{
    private String heroType;

    public Type(String heroType){
        if (heroType.equalsIgnoreCase("warrior") ||
                heroType.equalsIgnoreCase("archer") ||
                heroType.equalsIgnoreCase("mage") ||
                heroType.equalsIgnoreCase("cleric")) {
            this.heroType = heroType.toLowerCase();
        } else {
            throw new TypeNameInvalidException(heroType);
        }
    }

    public void applyHeroTypeDominantStat() {
        String dominantStat;
        switch (this.heroType) {
            case "warrior":
                dominantStat = "strength";
                break;
            case "archer":
                dominantStat = "dexterity";
                break;
            case "mage":
                dominantStat = "intelligence";
                break;
            case "cleric":
                dominantStat = "wisdom";
                break;
        }
    }

    public int getBaseLifePoints() {
        switch(this.heroType) {
            case "warrior" :
                return 12;
            case "archer", "cleric":
                return 10;
            case "mage" :
                return 6;
            default:
                throw new TypeNameInvalidException(heroType);
        }
    }

    public int getBaseMagicPoints() {
        switch(this.heroType) {
            case "warrior", "archer" :
                return 0;
            case "mage" :
                return 10;
            case "cleric" :
                return 8;
            default:
                throw new TypeNameInvalidException(heroType);
        }
    }

    public boolean canEquip(Weapons weapon) {
        String name = weapon.getWeaponName();
        if (this.heroType.equalsIgnoreCase("warrior")) {
            return !name.equalsIgnoreCase(Weapons.BOW); // tout sauf Arc
        } else if (this.heroType.equalsIgnoreCase("archer")) {
            return name.equalsIgnoreCase(Weapons.BOW) ||
                    name.equalsIgnoreCase(Weapons.DAGGER) ||
                    name.equalsIgnoreCase(Weapons.LONG_SWORD);
        } else if (this.heroType.equalsIgnoreCase("mage")) {
            return name.equalsIgnoreCase(Weapons.STICK) ||
                    name.equalsIgnoreCase(Weapons.DAGGER);
        } else if (this.heroType.equalsIgnoreCase("cleric")) {
            return name.equalsIgnoreCase(Weapons.MACE) ||
                    name.equalsIgnoreCase(Weapons.STICK);
        }
        return false;
    }

    public boolean canEquip(Armors armor) {
        String protection = armor.getArmorProtection();
        if (this.heroType.equalsIgnoreCase("warrior") || this.heroType.equalsIgnoreCase("cleric")) {
            return protection.equalsIgnoreCase(Armors.LEATHER_ARMOR) ||
                    protection.equalsIgnoreCase(Armors.CHAINMAIL_ARMOR);
        } else if (this.heroType.equalsIgnoreCase("archer")) {
            return protection.equalsIgnoreCase(Armors.LEATHER_ARMOR);
        } else if (this.heroType.equalsIgnoreCase("mage")) {
            return false;
        }
        return false;
    }

}