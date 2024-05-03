package kg.geeks.game.players;

public class Mebic extends Hero{
    int heallPoint = 10;

    public Mebic(int health, int damage, String heeel) {
        super();
    }

    public void increaseExperience(){
        heallPoint += heallPoint * 0.1;
    }

    public Mebic(int health, int damage, SuperAbility ability, String name, int heallPoint) {
        super(health, damage, ability, name);
        this.heallPoint = heallPoint;
    }

    public int getHeallPoint() {
        return heallPoint;
    }

    public void setHeallPoint(int heallPoint) {
        this.heallPoint = heallPoint;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Медик применил суперспособность: " );
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}


