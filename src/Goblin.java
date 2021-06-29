public class Goblin extends Unit{
    private String name;
    private int health;
    private int power;
    private int skill;

    @Override
    public int getSkill() {
        return skill;
    }

    @Override
    public String getName() {
        return name + " (" +  health + ")";
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    public Goblin() {
        this.name = "Goblin";
        this.health = 500;
        this.power = 15;
        this.skill = 14;
    }
}
