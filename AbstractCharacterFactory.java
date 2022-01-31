public abstract class AbstractCharacterFactory implements Game{
    String characterName;
    abstract public void move(char d);
    abstract public void jump(int h);
    abstract public void chooseWeapon(String w);
}
