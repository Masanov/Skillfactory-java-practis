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
                        hero.setExperience(hero.getExperience() + 100);
                        System.out.println("Опыт героя растет, теперь у героя " + hero.getExperience() + " единиц опыта");
                        if(hero.getExperience() > 99 && hero.getExperience() < 200) {
                            hero.setSkill(8);
                            hero.setPower(150);
                            System.out.println("Ловкость героя " + hero.getSkill() + " единиц");
                        } else if (hero.getExperience() > 199 && hero.getExperience() < 300) {
                            hero.setSkill(10);
                            hero.setPower(250);
                            System.out.println("Ловкость героя " + hero.getSkill() + " единиц");
                        } else if (hero.getExperience() > 299 && hero.getExperience() < 400) {
                            hero.setSkill(12);
                            hero.setPower(300);
                            System.out.println("Ловкость героя " + hero.getSkill() + " единиц");
                        }
                        hero.setGold(hero.getGold() + 50);
                        System.out.println("Герой получает 50 единиц золота. Запасы золота: " + hero.getGold());

                    }
                    break;
                case 3 : active = false;
            }
        }





    }
}
