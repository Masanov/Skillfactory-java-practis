import static java.lang.Math.random;

abstract class Unit {
    String name;
    int health;
    int gold;
    int skill;
    int experience;
    int power;
    public Unit (){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void attack(Unit target) {
        double randm = random()*100;
        //System.out.println(randm);
        //System.out.println(this.getSkill() + "    " + this.getSkill()*3);
        if (this.getSkill()*3 > randm) {
            target.setHealth(target.getHealth() - this.getPower());
            System.out.println(this.getName() + " наносит удар по " + target.getName() + " и отнимает " + this.getPower() + " единиц здоровья.");
        } else {
            System.out.println(this.getName() + " наносит удар, но промахивается");
        }
    }
}
