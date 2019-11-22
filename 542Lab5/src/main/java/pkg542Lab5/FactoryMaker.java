package pkg542Lab5;

/**
 *
 * @author Dhruval
 */
public class FactoryMaker {
    
    public enum ModeType{
        BEGINNER, INTERMEDIATE, ADVANCED
    }
    
    /**
     * makeFactory method to create a factory
     * @param type -- the mode 
     * @return a modeFactory
     */
    public static ModeIF makeFactory(ModeType type){
        switch(type){
            case BEGINNER:
                return new BeginModeFactory();
            case INTERMEDIATE:
                return new IntermediateModeFactory();
            case ADVANCED:
                return new AdvancedModeFactory();
            default:
                throw new IllegalArgumentException("ModeType is not supported");
        }
    }



    
}
