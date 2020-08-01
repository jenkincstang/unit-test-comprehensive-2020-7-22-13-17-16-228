package example;

import java.util.List;

public class GameProcess {
    private CheckNumber checkNumber;
    public GameProcess(){
        checkNumber = new CheckNumber();
    }
    public String start(List<Integer> inputs) {
        if(!checkNumber.isLegalNumber(inputs))
            return "Wrong Input,Input again";
        return null;
    }
}
