package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class InputReceivementTest {
    @Test
    void should_return_1234_when_receive_number_from_console_given_1234(){
        //given
        InputReceivement inputReceivement = new InputReceivement();
        List<Integer> result = Arrays.asList(new Integer[]{1,2,3,4});
        String consoleInput = "1 2 3 4";
        //when

        List<Integer> inputs = inputReceivement.receive(consoleInput);

        //then
        Assertions.assertEquals(result,inputs);
    }
}
