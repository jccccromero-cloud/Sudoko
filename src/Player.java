public class Player extends Entity {

    public Player(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    @Override
    public void attack(Entity target) {
        System.out.println(name + " strikes for " + attack);
        target.takeDamage(attack);
    }
}
