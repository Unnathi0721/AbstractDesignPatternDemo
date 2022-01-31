public class Ahri extends AbstractCharacterFactory implements Game{
    Ahri(){
        super.characterName="Ahri";
    }
    public void move(char d){
        String dir=(d=='f')?"front":((d=='b')?"back":((d=='r')?"right":"left"));
        System.out.println(characterName+" moved towards "+dir);
    }
    public void jump(int h){
        System.out.println(characterName+" jumps "+h+" meters high");
    }
    public void chooseWeapon(String w){
        System.out.println(characterName+" chooses "+w+" as Weapon");
    }
}
