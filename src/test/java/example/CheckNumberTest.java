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
        CheckNumber checkNumber = new CheckNumber();
        //when
        int result = checkNumber.countNumber();
        //then
        Assertions.assertEquals(4,result);
    }


}
