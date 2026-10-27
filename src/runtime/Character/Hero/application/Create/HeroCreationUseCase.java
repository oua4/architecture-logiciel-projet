package runtime.Character.Hero.application.Create;
import runtime.Character.Hero.domain.heroCharacteristics.Stats;
import runtime.Character.Hero.application.port.HeroRepository;
import runtime.Character.Hero.domain.Hero;
import runtime.Character.Hero.domain.HeroFactory;
import runtime.Character.Hero.domain.exceptions.HeroNameAlreadyInUseException;

public class HeroCreationUseCase {

    private final HeroRepository heroRepository;
    private final HeroFactory heroFactory;


    public HeroCreationUseCase(HeroRepository heroRepository, HeroFactory heroFactory) {
        this.heroRepository = heroRepository;
        this.heroFactory = heroFactory;
    }


    public Hero execute(HeroCreationCommand command) {
        if (heroRepository.isNameTaken(command.heroName())) {
            throw new HeroNameAlreadyInUseException(command.heroName());
        }

        Hero hero = heroFactory.create(
                command.heroName(),
                command.heroType(),
                command.heroSpecies(),
                new Stats(
                        command.strength(),
                        command.dexterity(),
                        command.constitution(),
                        command.intelligence(),
                        command.wisdom(),
                        command.charisma()
                )
        );
        heroRepository.save(hero);

        return hero;
    }
}
