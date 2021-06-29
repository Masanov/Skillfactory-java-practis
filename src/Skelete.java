public class Skelete extends Unit{
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

    public Skelete() {
        this.name = "Skelete";
        this.health = 500;
        this.power = 50;
        this.skill = 14;
    }
}
