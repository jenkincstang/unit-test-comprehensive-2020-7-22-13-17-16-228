package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.verification.Times;

import java.util.Arrays;
import java.util.List;

public class GameProcessTest {
    @Test
    void should_return_wrong_info_when_game_running_given_a_wrong_input(){
        //given
        GameProcess gameProcess = new GameProcess();
        List<Integer> inputs = Arrays.asList(new Integer[]{1,2,3,1});
        //when
        String result = gameProcess.start(inputs);
        String expect = "\nInput\t\t\tOutput\n" +
                "1 2 3 1\t\t\tWrong Input,Input again\n";
        //then
        Assertions.assertEquals(expect,result);
    }

    @Test
    void should_return_win_info_when_game_running_given_a_correct_input(){
        //given
        GameProcess gameProcess = new GameProcess();
        List<Integer> inputs = Arrays.asList(new Integer[]{1,2,3,4});
        //when
        String result = gameProcess.start(inputs);
        String expect = "\nInput\t\t\tOutput\n" +
                "1 2 3 4\t\t\tYou win, All correct, Game over!\n";
        //then
        Assertions.assertEquals(expect,result);
    }

    @Test
    void should_return_result_info_when_game_running_given_a_input(){
        //given
        GameProcess gameProcess = new GameProcess();
        List<Integer> inputs = Arrays.asList(new Integer[]{1,2,3,5});
        //when
        String result = gameProcess.start(inputs);
        //then
        String expect = "\nInput\t\t\tOutput\n" +
                "1 2 3 5\t\t\t3A0B\n";
        Assertions.assertEquals(expect,result);
    }

    @Test
    void should_return_6_result_info_when_game_running_given_6_input(){
        //given
        GameProcess gameProcess = new GameProcess();
        AnswerGenerator answerGenerator = new AnswerGenerator();
        List<Integer> inputs = Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9});
        //when
        String result = "";
        String expect = "\nInput\t\t\tOutput\n" +
                "0 1 2 3\t\t\t0A3B\n" +
                "1 2 3 4\t\t\tYou win, All correct, Game over!\n" +
                "2 3 4 5\t\t\t0A3B\n" +
                "3 4 5 6\t\t\t0A2B\n" +
                "4 5 6 7\t\t\t0A1B\n" +
                "5 6 7 8\t\t\t0A0B\n" +
                "Game Times Out,Game Over!\n";
        for(int i=0;i<6;i++){
            result = gameProcess.start(inputs.subList(i,i+4));
        }
        //then
        Assertions.assertEquals(expect,result);
    }

    @Test
    void should_return_game_running_status_info_when_game_running_given_1_input(){
        //given
        GameProcess gameProcess = new GameProcess();
        List<Integer> inputs = Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9});
        //when
        for(int i=0;i<1;i++){
            gameProcess.start(inputs.subList(i,i+4));
        }
        //then
        Assertions.assertEquals(GameStatus.RUNNING,gameProcess.getGameStatus());
    }

    @Test
    void should_return_game_win_status_info_when_game_running_given_2_input(){
        //given
        GameProcess gameProcess = new GameProcess();
        List<Integer> inputs = Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9});
        //when
        for(int i=0;i<2;i++){
            gameProcess.start(inputs.subList(i,i+4));
        }
        //then
        Assertions.assertEquals(GameStatus.GAME_WIN,gameProcess.getGameStatus());
    }

    @Test
    void should_return_game_times_out_status_info_when_game_running_given_6_input(){
        //given
        GameProcess gameProcess = new GameProcess();
        List<Integer> inputs = Arrays.asList(new Integer[]{9,8,7,6,5,4,3,2,1,0});
        //when
        for(int i=0;i<6;i++){
            gameProcess.start(inputs.subList(i,i+4));
        }
        //then
        Assertions.assertEquals(GameStatus.TIMES_OUT,gameProcess.getGameStatus());
    }
}
