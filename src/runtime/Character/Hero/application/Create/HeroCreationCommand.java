package runtime.Character.Hero.application.Create;

public record HeroCreationCommand(
        String heroName,
        String heroType,
        String heroSpecies,
        int strength,
        int dexterity,
        int constitution,
        int intelligence,
        int wisdom,
        int charisma
) {
}