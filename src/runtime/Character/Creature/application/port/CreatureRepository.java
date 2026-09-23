package runtime.Character.Creature.application.port;

import runtime.Character.Creature.domain.Creature;
import java.util.UUID;

public interface CreatureRepository {
    void save(Creature creature);
    Creature fetch(UUID uuid);
}