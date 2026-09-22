package runtime.Character.Hero.domain.points;

import runtime.Character.Hero.domain.heroCharacteristics.Stats;
import runtime.Character.Hero.domain.heroCharacteristics.Type;

public class LifePoints {
    private int currentLifePoints;
    private int maxLifePoints;

    public LifePoints(Type type, Stats stats) {
        int maxPoints = type.getBaseLifePoints() + stats.getModifier(stats.getConstitutionModifier());
        this.maxLifePoints = Math.max(1, maxPoints);

        this.currentLifePoints = this.maxLifePoints;
    }

    public boolean isKnockedOut() {
        return this.currentLifePoints == 0;
    }

    public boolean canAct() {
        return this.currentLifePoints >= 1;
    }

    //takeDamage et heal à venir
}
