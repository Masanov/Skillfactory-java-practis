import java.util.Scanner;

import static java.lang.Math.random;
public class Main {


    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Boolean active = true;
        System.out.println("Игра началась!");
        System.out.println("Давайте создадим вашего персонажа. Введите имя персонажа:");
        String newName = scanner.nextLine();
        Hero hero = new Hero(newName);
        System.out.println("Ваш персонаж создан:");
        System.out.println("Имя героя: " + hero.getName());
        System.out.println("Здоровье героя: " + hero.getHealth());
        System.out.println("Запас золота: " + hero.getGold());
        System.out.println("Сила удара: " + hero.getPower());
        System.out.println("Ловкость: " + hero.getSkill());
        System.out.println("Опыт: " + hero.getExperience());
        while(active) {
            System.out.println("Куда вы хотите пойти?");
            System.out.println("1. К торговцу");
            System.out.println("2. В тёмный лес");
            System.out.println("3. На выход");
            int nextStep = scanner.nextInt();
            switch(nextStep) {
                case 1 :
                    System.out.println("Торговец еще не вышел на работу");
                    break;
                case 2 :
                    Boolean intoForest = true;
                    while(intoForest) {
                        System.out.println("Идём в темный лес");
                        double randm = random();
                        Unit enemy;
                        if(randm > 0.5) {
                            enemy = new Goblin();

                        } else {enemy = new Skelete();}
                        System.out.println("В темном лесу вас встречает " + enemy.getName());

                        Fight fight = new Fight(enemy, hero);
                        Thread thread = new Thread(fight);
                        thread.start();
                        thread.join();
                        if(fight.result == 0) {
                            active = false;
                        } else if (fight.result == 2) {
                            //levelup
                            hero.levelUp();
                            System.out.println("Куда вы хотите пойти?");
                            System.out.println("1. Вернуться в город");
                            System.out.println("2. Продолжить торговлю/бой");
                            int step = scanner.nextInt();
                            switch(step) {
                                case 1 :
                                    intoForest = false;
                                    break;
                                case 2 :
                                    continue;

                            }
                        }
                        break;

                    }

                    break;
                case 3 : active = false;
            }
        }





    }
}
