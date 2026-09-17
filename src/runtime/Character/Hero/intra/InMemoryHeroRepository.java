package runtime.Character.Hero.intra;

import runtime.Character.Hero.application.port.HeroRepository;
import runtime.Character.Hero.domain.Hero;

import java.util.HashMap;
import java.util.UUID;

public class InMemoryHeroRepository implements HeroRepository {

    HashMap<UUID, Hero> collection;

    @Override
    public void save(Hero hero) {
        collection.put(hero.getUuid(), hero);
    }

    @Override
    public Hero fetch(UUID uuid) {
        //To do : if not throw new HeroNotFoundException
        return collection.get(uuid);
    }

    @Override
    public boolean isNameTaken(String name) {
        return false;
    }
}
