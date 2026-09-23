package runtime.Character.Creature.domain.infrastructure;

import runtime.Character.Creature.application.port.CreatureRepository;
import runtime.Character.Creature.domain.Creature;
import runtime.Character.Creature.domain.CreatureCatalog;
import runtime.Character.Hero.domain.Hero;

import java.util.*;

public class InMemoryCreatureRepository implements CreatureRepository, CreatureCatalog {

    private final Map<UUID, Creature> collection = new HashMap<>();

    @Override
    public void save(Creature creature) {
        collection.put(creature.getId(), creature);
    }

    @Override
    public Creature fetch(UUID uuid) {
        return collection.get(uuid);
    }

    @Override
    public Creature createGoblin(UUID uuid) {
        Creature goblin = new Creature(
                uuid,
                "Gobelin",
                7,
                12,
                2,
                50,
                3,
                "1d6+1",
                activeHeroes -> activeHeroes.stream()
                        .min(Comparator.comparingInt(Hero::getCurrentHp))
                        .orElse(null)
        );

        save(goblin);
        return goblin;
    }

    @Override
    public Creature createOrc(UUID uuid) {
        Creature orc = new Creature(
                uuid,
                "Orc",
                15,
                13,
                1,
                100,
                4,
                "1d8+2",
                activeHeroes -> activeHeroes.stream()
                        .max(Comparator.comparingInt(Hero::getCurrentHp))
                        .orElse(null)
        );

        save(orc);
        return orc;
    }

    @Override
    public Creature createTroll(UUID uuid) {
        Creature troll = new Creature(
                uuid,
                "Troll",
                35,
                15,
                0,
                300,
                6,
                "2d6+3",
                activeHeroes -> {
                    if (activeHeroes.isEmpty()) {
                        return null;
                    }

                    List<Hero> copy = new ArrayList<>(activeHeroes);
                    Collections.shuffle(copy);
                    return copy.get(0);
                }
        );

        save(troll);
        return troll;
    }
}