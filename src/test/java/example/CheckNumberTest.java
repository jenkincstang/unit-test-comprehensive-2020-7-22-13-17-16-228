package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class CheckNumberTest {
    @Test
    public void should_return_false_when_count_quantity_of_number_given_5_number() {
        //given
        CheckNumber checkNumber = new CheckNumber();
        //when
        LinkedList<Integer> inputNumbers = new LinkedList<>();
        inputNumbers.add(1);
        inputNumbers.add(1);
        inputNumbers.add(1);
        inputNumbers.add(1);
        inputNumbers.add(1);

        boolean result = checkNumber.isLegalNumber(inputNumbers);
        //then
        Assertions.assertEquals(false,result);
    }

    @Test
    public void should_return_false_when_judge_number_range_given_number_not_all_between_0_and_9() {
        //given
        CheckNumber checkNumber = new CheckNumber();
        //when
        LinkedList<Integer> inputNumbers = new LinkedList<>();
        inputNumbers.add(1);
        inputNumbers.add(2);
        inputNumbers.add(2);
        inputNumbers.add(10);

        boolean result = checkNumber.isLegalNumber(inputNumbers);
        //then
        Assertions.assertEquals(false,result);
    }


    @Test
    public void should_return_false_when_judge_number_not_repeat_given_number_with_repeat() {
        //given
        CheckNumber checkNumber = new CheckNumber();
        //when
        LinkedList<Integer> inputNumbers = new LinkedList<>();
        inputNumbers.add(1);
        inputNumbers.add(2);
        inputNumbers.add(2);
        inputNumbers.add(9);

        boolean result = checkNumber.isLegalNumber(inputNumbers);
        //then
        Assertions.assertEquals(false,result);
    }
}
