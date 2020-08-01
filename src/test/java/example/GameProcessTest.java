package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GameProcessTest {
    @Test
    void should_return_wrong_info_when_game_running_given_a_wrong_input(){
        //given
        GameProcess gameProcess = new GameProcess();
        List<Integer> inputs = Arrays.asList(new Integer[]{1,2,3,4});
        //when
        String result = gameProcess.start(inputs);
        //then
        Assertions.assertEquals("Wrong Input,Input again",result);
    }

    @Test
    void should_return_win_info_when_game_running_given_a_correct_input(){
        //given
        GameProcess gameProcess = new GameProcess();
        List<Integer> inputs = Arrays.asList(new Integer[]{1,2,3,4});
        //when
        String result = gameProcess.start(inputs);
        //then
        Assertions.assertEquals("You win, All correct",result);
    }
}
