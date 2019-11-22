package pkg542Lab5;

/**
 *
 * @author Dhruval
 */
public class CharacterBeginner implements CharacterIF {
    
    String name;
    
    @Override
    public void addCharacter(String c) {
        this.name = c;
    }

    @Override
    public String getCharacter() {
        return "The character is " + this.name;
    }
}
