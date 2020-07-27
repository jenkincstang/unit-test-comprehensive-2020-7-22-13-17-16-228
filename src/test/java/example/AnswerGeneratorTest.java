package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class AnswerGeneratorTest {
    @Test
    public void should_return_4_when_genarate_answer(){
        //given
        AnswerGenerator answerGenarate = new AnswerGenerator();
        //when
        LinkedList<Integer> resultList = answerGenarate.genarate();

        //then
        Assertions.assertEquals(4,resultList.size());
    }
}
