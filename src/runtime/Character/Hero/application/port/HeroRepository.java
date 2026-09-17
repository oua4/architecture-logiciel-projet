package runtime.Character.Hero.application.port;

import runtime.Character.Hero.domain.Hero;

import java.util.UUID;

public interface HeroRepository {
    public void save (Hero hero);

    public Hero fetch(UUID uuid);

    public boolean isNameTaken(String name);
}
