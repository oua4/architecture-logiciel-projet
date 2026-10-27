import runtime.Character.Hero.domain.Hero;
import runtime.Character.Hero.domain.HeroFactory;
import runtime.Character.Hero.domain.heroCharacteristics.Stats;

public class Main {
    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory();

        Stats stats = new Stats(15, 12, 14, 10, 8, 13);

        Hero hero = factory.create("Lesly", "warrior", "human", stats);

        System.out.println("UUID : " + hero.getHeroUuid());
        System.out.println("Niveau : " + hero.getLevel());
        System.out.println("PV : " + hero.getCurrentHp());
        System.out.println("PM : " + hero.getCurrentMp());
    }
}