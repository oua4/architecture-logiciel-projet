package runtime.Character.Hero.domain.heroCharacteristics;

import runtime.Character.Hero.domain.exceptions.StatNumberInvalidException;

public class Stats{
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;

    int[] stats = {strength, dexterity, constitution, intelligence, wisdom, charisma};

    public Stats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        for(int stat : stats) {
            if (
                    stat <= 20 && stat >= 0
            ) {
                this.strength = strength;
                this.dexterity = dexterity;
                this.constitution = constitution;
                this.intelligence = intelligence;
                this.wisdom = wisdom;
                this.charisma = charisma;
                break;
            } else {
                throw new StatNumberInvalidException();
            }
        }

    }

    public void addStrength(int number) {
        strength += number;
    }

    public void subStrength(int number) {
        strength -= number;
    }

    public void addDexterity(int number) {
        dexterity += number;
    }

    public void subDexterity(int number) {
        dexterity -= number;
    }

    public int getConstitution() {
        return constitution;
    }

    public void addConstitution(int number) {
        constitution += number;
    }

    public void subConstitution(int number) {
        constitution -= number;
    }

    public int addIntelligence(int number) {
        return intelligence += number;
    }

    public void subIntelligence(int number) {
        intelligence -= number;
    }

    public void addWisdom(int number) {
        wisdom += number;
    }

    public void subWisdom(int number) {
        wisdom -= number;
    }

    public void addCharisma(int number) {
        charisma += number;
    }

    public void subCharisma(int number) {
        charisma -= number;
    }

    public int getModifier(int stat) {
        int modifier = (stat - 10) / 2;
        return (int) Math.floor(modifier);
    }
}