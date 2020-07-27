package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class CheckNumberTest {
    @Test
    public void should_return_true_when_count_quantity_of_number_given_4_number() {
        //given
        CheckNumber checkNumber = new CheckNumber();
        //when
        LinkedList<Integer> inputNumbers = new LinkedList<>();
        inputNumbers.add(1);
        inputNumbers.add(1);
        inputNumbers.add(1);
        inputNumbers.add(1);

        boolean result = checkNumber.isLegalNumber(inputNumbers);
        //then
        Assertions.assertEquals(true,result);
    }

    @Test
    public void should_return_true_when_judge_number_range_given_4_number_between_0_and_9() {
        //given
        CheckNumber checkNumber = new CheckNumber();
        //when
        LinkedList<Integer> inputNumbers = new LinkedList<>();
        inputNumbers.add(1);
        inputNumbers.add(2);
        inputNumbers.add(2);
        inputNumbers.add(8);
        inputNumbers.add(9);

        boolean result = checkNumber.isLegalNumber(inputNumbers);
        //then
        Assertions.assertEquals(true,result);
    }

}
