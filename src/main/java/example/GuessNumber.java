package example;

import java.util.LinkedList;

/**
 * @author Jenkin
 * @date 2020/7/23 - 22:12
 */
public class GuessNumber {
    public String guess(LinkedList<Integer> answer,LinkedList<Integer> inputNumber){
        if(answer.equals(inputNumber)){
            return "4A0B";
        }

        return null;
    }
}
