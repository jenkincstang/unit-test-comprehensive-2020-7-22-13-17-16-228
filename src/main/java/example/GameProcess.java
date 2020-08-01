package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameProcess {
    private CheckNumber checkNumber;
    private GuessNumber guessNumber;
    private List<Integer> answer;
    private String outputResult;
    public GameProcess(){
        checkNumber = new CheckNumber();
        answer = Arrays.asList(new Integer[]{1,2,3,4});
        guessNumber = new GuessNumber();
        outputResult = "\nInput\t\t\tOutput\n";
    }
    public String start(List<Integer> inputs) {
        if(!checkNumber.isLegalNumber(inputs))
            return "Wrong Input,Input again";
        String result = guessNumber.guess(answer,inputs);
        if(isGameWin(result))
            return "You win, All correct";
        return null;
    }
    public boolean isGameWin(String result){
        if ("4A0B".equals(result))
            return true;
        return false;
    }

    public String answerStitch(List<Integer> inputs,String result){
        outputResult += inputs.stream().map(e->e+" ").collect(Collectors.joining());
        outputResult += "\t\t\t"+result+"\n";
        return outputResult;
    }
}
