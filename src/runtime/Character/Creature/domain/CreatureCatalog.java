package runtime.Character.Creature.domain;

import java.util.UUID;

public interface CreatureCatalog {

    Creature createGoblin(UUID uuid);
    Creature createOrc(UUID uuid);
    Creature createTroll(UUID uuid);
}
