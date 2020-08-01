package example;

import java.util.List;

public class GameProcess {
    private CheckNumber checkNumber;
    public GameProcess(){
        checkNumber = new CheckNumber();
    }
    public String start(List<Integer> inputs) {
        checkNumber.isLegalNumber(inputs);
        return null;
    }
}
