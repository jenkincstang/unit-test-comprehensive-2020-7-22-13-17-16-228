package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    public void should_return_true_when_judge_number_range(){
        //given
        AnswerGenerator answerGenarate = new AnswerGenerator();
        //when
        LinkedList<Integer> resultList = answerGenarate.genarate();

        //then
        Assertions.assertEquals(true,isNumberInRange(resultList));
    }

    public boolean isNotContainsRepeatElement(LinkedList<Integer> list){
        HashSet<Integer> set = new HashSet();
        for (Integer item:list){
            set.add(item);
        }
        if(set.size() == 4) return true;
        return false;
    }

    public boolean isNumberInRange(LinkedList<Integer> list){
        return list.stream().filter(i -> i>9 || i<0).count() == 0;
    }
}
