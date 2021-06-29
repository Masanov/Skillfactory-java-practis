import static java.lang.Math.random;

public class Fight implements Runnable {
    int result = 1; // 1 - ничья, 0 - проигрыш, 2 - победа
    Unit enemy;
    Hero hero;
    public Fight(Unit enemy, Hero hero) {
        this.enemy = enemy;
        this.hero = hero;
    }

    @Override
    public void run() {
        while (enemy.getHealth() > 0 || hero.getHealth() > 0) {

            try {
                enemy.attack(hero);
                if(enemy.getHealth() < 0) {
                    System.out.println(hero.getName() + " победил чудовище!");
                    System.out.println();
                    result = 2;
                    break;
                } else if(hero.getHealth() < 0) {
                    System.out.println("Вы проиграли");
                    result = 0;
                    break;
                }



                Thread.sleep(200); // 1
                hero.attack(enemy);
                if(enemy.getHealth() < 0) {
                    System.out.println(hero.getName() + " победил чудовище!");
                    result = 2;
                    break;
                } else if(hero.getHealth() < 0) {
                    System.out.println("Вы проиграли");
                    result = 0;
                    break;
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
                break; // 2
            }


        }

    }
}
