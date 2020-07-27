package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class CheckNumberTest {
    @Test
    public void should_return_4_when_count_quantity_of_number() throws IOException {
        //given
        CheckNumber checkNumber = Mockito.mock(CheckNumber.class);
        //when
        Mockito.when(checkNumber.getInputNumbers())
                .thenReturn("1 2 3 4 5");
        String inputNumbers = checkNumber.getInputNumbers();
        //then
        Assertions.assertEquals(4,getNumbersFromString(inputNumbers).size());
    }

    public LinkedList<Integer> getNumbersFromString(String inputNumberString) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (String number : inputNumberString.split(" ")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}
