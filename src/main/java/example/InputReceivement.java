package example;

import java.util.ArrayList;
import java.util.List;

public class InputReceivement {
    public List<Integer> receive(String consoleInput) {
        List<Integer> inputs = new ArrayList<>();
        for(String number:consoleInput.split(" ")){
            inputs.add(Integer.valueOf(number));
        }
        return inputs;
    }
}
