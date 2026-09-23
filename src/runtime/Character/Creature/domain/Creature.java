package runtime.Character.Creature.domain;

import java.util.UUID;

public class Creature {

    private final UUID id;
    private final String name;
    private final int maxHp;
    private int currentHp;
    private final int armorClass;
    private final int initiativeBonus;
    private final int xpReward;
    private final int attackBonus;
    private final String damageDice;
    private final CreatureBehavior behavior;

    public Creature(UUID id, String name, int maxHp, int armorClass,
                    int initiativeBonus, int xpReward, int attackBonus,
                    String damageDice, CreatureBehavior behavior) {

        this.id = id;
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.armorClass = armorClass;
        this.initiativeBonus = initiativeBonus;
        this.xpReward = xpReward;
        this.attackBonus = attackBonus;
        this.damageDice = damageDice;
        this.behavior = behavior;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getInitiativeBonus() {
        return initiativeBonus;
    }

    public int getXpReward() {
        return xpReward;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public String getDamageDice() {
        return damageDice;
    }
}