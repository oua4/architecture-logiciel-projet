package runtime.Character.Hero.domain.heroCharacteristics;

import runtime.Character.Hero.domain.exceptions.StatNumberInvalidException;

public class Stats{
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;

    public Stats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        validateStats(strength, dexterity, constitution, intelligence, wisdom, charisma);

        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    private void validateStats(int... stats) {
        for (int stat : stats) {
            if (stat < 0 || stat > 20) {
                throw new StatNumberInvalidException();
            }
        }
    }

    private int keepInBounds(int value) {
        return Math.clamp(value, 0, 20);
    }

    public void modifyStat(String stat, int amount) {
        switch (stat.toLowerCase()) {
            case "strength" :
                this.strength = keepInBounds(this.strength + amount);
                break;
            case "dexterity" :
                this.dexterity = keepInBounds(this.dexterity + amount);
                break;
            case "constitution" :
                this.constitution = keepInBounds(this.constitution + amount);
                break;
            case "intelligence" :
                this.intelligence = keepInBounds(this.intelligence + amount);
                break;
            case "wisdom" :
                this.wisdom = keepInBounds(this.wisdom + amount);
                break;
            case "charisma" :
                this.charisma = keepInBounds(this.charisma + amount);
                break;
        }
    }

    public int getModifier(int stat) {
        return Math.floorDiv(stat - 10, 2);
    }

    public int getConstitutionModifier() {
        return getModifier(this.constitution);
    }
    
    public int getDexterityModifier(){
        return getModifier(this.dexterity);
    }
}