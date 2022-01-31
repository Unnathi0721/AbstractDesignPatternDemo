public class Factory {
    public AbstractCharacterFactory chooseCharacter(int n){
        if(n==1){
            return new Akali();
        }
        else{
            return (n==2)?new Ahri():new Evelynn();
        }
    }
}
