package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
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

    @Test
    public void should_return_true_when_genarate_answer(){
        //given
        AnswerGenerator answerGenarate = new AnswerGenerator();
        //when
        LinkedList<Integer> resultList = answerGenarate.genarate();

        //then
        Assertions.assertEquals(true,isNotContainsRepeatElement(resultList));
    }

    public boolean isNotContainsRepeatElement(LinkedList<Integer> list){
        HashSet<Integer> set = new HashSet();
        for (Integer item:list){
            set.add(item);
        }
        if(set.size() == 4) return true;
        return false;
    }
}
