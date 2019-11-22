package pkg542Lab5;

/**
 *
 * @author Dhruval
 */
public class WeaponBeginner implements WeaponIF{
    
    private String name; 

    //add a weapon
    @Override
    public void addWeapon(String n){
        this.name = n;
    }

    //get this weapon
    @Override
    public String getWeapon(){
        return "The weapon of this character is " + this.name;
    }
    
}
