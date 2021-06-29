public class Hero extends Unit{
    private String name;
    private int health;
    private int gold;
    private int skill;
    private int experience;
    private int power;

    @Override
    public String getName() {
        return name;
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
}
