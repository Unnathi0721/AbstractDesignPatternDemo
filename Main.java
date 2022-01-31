import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AbstractCharacterFactory character;
        Factory factory=new Factory();
        int nm=sc.nextInt();
        character= factory.chooseCharacter(nm);
        Game game=character;
        game.chooseWeapon("Hammer");
        game.move('f');
        game.jump(5);

    }
}
