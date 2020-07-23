package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * @author Jenkin
 * @date 2020/7/23 - 22:13
 */
public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_guess_given_answer_1234_and_input_1234(){
        //given
        GuessNumber guessNumber = new GuessNumber();
        LinkedList<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);

        LinkedList<Integer> inputNumber = new LinkedList<>();
        inputNumber.add(1);
        inputNumber.add(2);
        inputNumber.add(3);
        inputNumber.add(4);

        //when
        String result = guessNumber.guess(answer,inputNumber);

        //then
        Assertions.assertEquals("4A0B",result);
    }
}
