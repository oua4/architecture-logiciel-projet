package runtime.Character.Hero.domain;

import runtime.Character.Hero.domain.heroCharacteristics.Name;
import runtime.Character.Hero.domain.heroCharacteristics.Species;
import runtime.Character.Hero.domain.heroCharacteristics.Stats;
import runtime.Character.Hero.domain.heroCharacteristics.Type;
import java.util.UUID;

public class Hero {
    UUID uuid;
    private final Name name;
    private final Species species;
    private final Type type;
    private final Stats stats;

    public Hero(UUID uuid, Name name, Species species, Type type, Stats stats) {
        this.uuid = uuid;
        this.name = name;
        this.species = species;
        this.type = type;
        this.stats = stats;
    }
    public UUID getUuid() {
        return uuid;
    }

    public Name getName() {
        return name;
    }

    public Species getSpecies() {
        return species;
    }

    public Type getType() {
        return type;
    }

    public Stats getStats() {
        return stats;
    }

    public int getCurrentHp() {
        return 0;
    }
}
