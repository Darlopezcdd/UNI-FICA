package my.game;

public abstract class CharacterGame {

    protected int hp;
    protected String Name;
    protected boolean isAlive;
    protected double damage;

    public CharacterGame(int hp, String Name, boolean isAlive) {
        this.hp = hp;
        this.Name = Name;
        this.isAlive = isAlive;
    }

    public abstract void attak(CharacterGame character);

}
