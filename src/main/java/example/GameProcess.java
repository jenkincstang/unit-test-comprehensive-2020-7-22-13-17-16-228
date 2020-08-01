package example;

import java.util.Arrays;
import java.util.List;

public class GameProcess {
    private CheckNumber checkNumber;
    List<Integer> inputs;
    public GameProcess(){
        checkNumber = new CheckNumber();
        inputs = Arrays.asList(new Integer[]{1,2,3,4});
    }
    public String start(List<Integer> inputs) {
        if(!checkNumber.isLegalNumber(inputs))
            return "Wrong Input,Input again";
        return null;
    }
}
