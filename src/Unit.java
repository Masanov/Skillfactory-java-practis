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
        if (this.getSkill()*2 > randm) {
            //Критический удар
            System.out.println(this.getName() + " наносит Критический удар по " + target.getName() + " и отнимает " + (this.getPower()*2) + " единиц здоровья.");
            target.setHealth(target.getHealth() - (this.getPower()*2));
        } else if (this.getSkill()*3 > randm) {

            System.out.println(this.getName() + " наносит удар по " + target.getName() + " и отнимает " + this.getPower() + " единиц здоровья.");
            target.setHealth(target.getHealth() - this.getPower());
        }  else {
            System.out.println(this.getName() + " наносит удар, но промахивается");
        }
    }
}
