package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameProcess {
    private final static int MAX_GAME_TIMES = 6;
    private final static String Error_Info = "Wrong Input,Input again";
    private final static String Win_Info = "You win, All correct, Game over!";
    private final static String Times_Out_Info = "Game Times Out,Game Over!\n";
    private CheckNumber checkNumber;
    private GuessNumber guessNumber;
    private List<Integer> answer;
    private static String outputResult;
    private static Integer times;
    private GameStatus gameStatus;

    public GameProcess(){
        checkNumber = new CheckNumber();
        answer = Arrays.asList(new Integer[]{1,2,3,4});
        guessNumber = new GuessNumber();
        outputResult = "\nInput\t\t\tOutput\n";
        times = 0;
        gameStatus = GameStatus.RUNNING;
    }
    public String start(List<Integer> inputs) {
        times++;
        String result = guessNumber.guess(answer,inputs);
        String output = "";
        if(!checkNumber.isLegalNumber(inputs))
            output = answerStitch(inputs,Error_Info);
        else if(isGameWin(result)) {
            output = answerStitch(inputs, Win_Info);
            setGameStatus(GameStatus.GAME_WIN);
        }
        else
            output = answerStitch(inputs,result);
        if (isTimesOut(times)) {
            output += Times_Out_Info;

        }
        return output;
    }

    private boolean isTimesOut(Integer times) {
        return MAX_GAME_TIMES==times;
    }

    private boolean isGameWin(String result){
        if ("4A0B".equals(result))
            return true;
        return false;
    }

    private String answerStitch(List<Integer> inputs,String result){
        outputResult += inputs.stream().map(e->e+" ").collect(Collectors.joining()).trim();
        outputResult += "\t\t\t"+result+"\n";
        return outputResult;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}
