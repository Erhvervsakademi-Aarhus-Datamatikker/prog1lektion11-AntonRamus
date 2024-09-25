package opgave03;

public class Dnd {
    public static void main(String[] args) {
        Hero hero = new Hero(20,10,75,"Anton","his","sniper rifle");
        Monster troll = new Monster(100,2,15,"troll with bad smell","hits with big mace","dumb");
        fight(hero,troll);
    }

    public static void fight(Hero hero, Monster monster) {
        while (hero.lifePoints > 0 && monster.lifePoints > 0) {
            int roll = rollD100();
            hero.heroAttacks(roll, hero, monster);
            if (monster.lifePoints > 0) {
                roll = rollD100();
                monster.monsterAttacks(roll, hero, monster);
            }
        }
    }

    public static int rollD100() {
        return (int) (Math.random() * 100 + 1);
    }
}

