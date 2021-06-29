public class Hero extends Unit{
    private String name;
    private int health;
    private int gold;
    private int skill;
    private int experience;
    private int power;

    @Override
    public String getName() {
        return name + " (" +  health + ")";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getGold() {
        return gold;
    }

    @Override
    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public int getSkill() {
        return skill;
    }

    @Override
    public void setSkill(int skill) {
        this.skill = skill;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    public Hero(String name) {

        this.name = name;
        this.health = 1000;
        this.gold = 0;
        this.skill = 6;
        this.experience = 0;
        this.power = 100;
    }
    public void levelUp() {
        //levelup
        this.setExperience(this.getExperience() + 100);
        System.out.println("Опыт героя растет, теперь у героя " + this.getExperience() + " единиц опыта");
        if(this.getExperience() > 99 && this.getExperience() < 200) {
            this.setSkill(8);
            this.setPower(150);
            System.out.println("Ловкость героя " + this.getSkill() + " единиц");
        } else if (this.getExperience() > 199 && this.getExperience() < 300) {
            this.setSkill(10);
            this.setPower(170);
            System.out.println("Ловкость героя " + this.getSkill() + " единиц");
        } else if (this.getExperience() > 299 && this.getExperience() < 400) {
            this.setSkill(12);
            this.setPower(200);
            System.out.println("Ловкость героя " + this.getSkill() + " единиц");
        } else if (this.getExperience() > 399 && this.getExperience() < 500) {
            this.setSkill(14);
            this.setPower(220);
            System.out.println("Ловкость героя " + this.getSkill() + " единиц");
        } else if (this.getExperience() > 499 && this.getExperience() < 600) {
            this.setSkill(16);
            this.setPower(230);
            System.out.println("Ловкость героя " + this.getSkill() + " единиц");
        } else if (this.getExperience() > 599 && this.getExperience() < 700) {
            this.setSkill(18);
            this.setPower(240);
            System.out.println("Ловкость героя " + this.getSkill() + " единиц");
        } else if (this.getExperience() > 699 && this.getExperience() < 800) {
            this.setSkill(18);
            this.setPower(240);
            System.out.println("Ловкость героя " + this.getSkill() + " единиц");
        }

        this.setGold(this.getGold() + 50);
        System.out.println("Герой получает 50 единиц золота. Запасы золота: " + this.getGold());
    }
}
