public class Actor implements IAttack, IDamageable {
    protected String name;
    protected HP hp;
    protected int attack, defense;

    public Actor(String name, HP hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public HP getHp() {
        return hp;
    }
    public void setHp(HP hp) {
        this.hp = hp;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    public void updateHp(int totalDamage) {
        hp.setHealth(hp.getHealth() - totalDamage);
    }
    @Override
    public int takeDamage(int damage, int defense) {
        int totalDamage = 0;
        if(damage > defense){
            totalDamage = damage - defense;
        }
        updateHp(totalDamage);
        return totalDamage;
    }

    @Override
    public void attack(IDamageable damageable) {
        damageable.takeDamage(attack, ((Enemy) damageable).getDefense());
        System.out.println(name + " attacking " + ((Enemy) damageable).getName());
        System.out.println(((Enemy) damageable).getName() + " is taking damage for " + attack + " points");

    }

}
