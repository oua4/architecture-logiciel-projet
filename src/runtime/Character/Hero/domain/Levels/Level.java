package runtime.Character.Hero.domain.Levels;

import runtime.Character.Hero.domain.points.LifePoints;
import runtime.Character.Hero.domain.points.ExperiencePoints;
import runtime.Character.Hero.domain.heroCharacteristics.Stats;
import runtime.Character.Hero.domain.heroCharacteristics.Type;

public class Level {
    private int currentLevel;
    private int maxLevel;

    public Level() {
        this.maxLevel = 5;
        this.currentLevel = 1;
    }

    public boolean isLevelingUp(ExperiencePoints experiencePoints) {
        return ExperiencePoints.currentExperiencePoints == ExperiencePoints.maxExperiencePoints;
    }

    public void levelUp() {
        if(this.currentLevel < this.maxLevel) {
            this.currentLevel += 1;
        }
    }

    public void lifePointUpgrade(Type type, Stats stats, LifePoints lifePoints) {
        if (lifePoints.maxLifePoints + (type.getBaseLifePoints() / 2 + stats.getConstitutionModifier() <= 0)) {
            lifePoints.maxLifePoints = lifePoints.maxLifePoints + 1; // Augmentation de points de vie minimum
        } else {
            lifePoints.maxLifePoints = lifePoints.maxLifePoints + (type.getBaseLifePoints() / 2 + stats.getConstitutionModifier());
        }
    }
}
