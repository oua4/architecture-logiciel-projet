package runtime.Character.Hero.domain;

import runtime.Character.Hero.domain.points.LifePoints;
import runtime.Character.Hero.domain.points.MagicPoints;
import runtime.Character.Hero.domain.heroCharacteristics.Name;
import runtime.Character.Hero.domain.heroCharacteristics.Species;
import runtime.Character.Hero.domain.heroCharacteristics.Type;
import runtime.Character.Hero.domain.heroCharacteristics.Stats;

import java.util.UUID;

public class Hero {
    private int level;
    private LifePoints lifePoints;
    private MagicPoints magicPoints;
    private UUID heroUuid;
    private Name name;
    private Species species;
    private Type type;
    private Stats stats;

    public Hero(UUID heroUuid, Name name, Species species, Type type, Stats stats) {
        this.level = 1;
        this.lifePoints = new LifePoints(type, stats);
        this.magicPoints = new MagicPoints(type);
        this.heroUuid = heroUuid;
        this.name = name;
        this.species = species;
        this.type = type;
        this.stats = stats;
    }

    public UUID getHeroUuid() {
        return heroUuid;
    }

    public int getCurrentHp() {
        return lifePoints.getCurrentLifePoints();
    }

    public int getLevel() {
        return level;
    }
    public int getCurrentMp() {
        return magicPoints.getCurrentMagicPoints();
    }
}