package runtime.Character.Hero.domain.points;

import runtime.Character.Hero.domain.heroCharacteristics.Stats;
import runtime.Character.Hero.domain.heroCharacteristics.Type;

public class LifePoints {
    private int currentLifePoints;
    private int maxLifePoints;

    public LifePoints(Type type, Stats stats) {
        this.maxLifePoints = type.getBaseLifePoints() + stats.getConstitution(); //Je dois enlever le getter plus tard
        this.currentLifePoints = ;


    }
}
