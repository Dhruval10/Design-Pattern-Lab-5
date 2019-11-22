package pkg542Lab5;

/**
 *
 * @author Dhruval
 */
public class AdvancedModeFactory implements ModeIF {

    @Override
    public CharacterIF createCharacter() {
       String add = "New Advanced Character added";
       System.out.println(add);
        return new CharacterAdvanced();
    
    }
    @Override
    public WeaponIF createWeapon() {
        String add = "New Advanced Weapon added";
        System.out.println(add);
        return new WeaponAdvanced();
    }    
}