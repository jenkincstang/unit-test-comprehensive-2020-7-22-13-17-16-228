package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jenkin
 * @date 2020/7/23 - 22:12
 */
public class GuessNumber {

    public String guess(List<Integer> answer, List<Integer> inputNumber) {
        int countOfCorrectNumberWithCorrectPosition = getCountOfCorrectNumberWithCorrectPosition(answer, inputNumber);
        int countOfCorrectNumber = getCountOfCorrectNumber(answer, inputNumber);
        String result = getGuessResult(countOfCorrectNumberWithCorrectPosition, countOfCorrectNumber);
        return result;
    }

    private String getGuessResult(int countOfCorrectNumberWithCorrectPosition, int countOfCorrectNumber) {
        String result = countOfCorrectNumberWithCorrectPosition + "A" +
                (countOfCorrectNumber - countOfCorrectNumberWithCorrectPosition) + "B";
        return result;
    }

    public int getCountOfCorrectNumberWithCorrectPosition(List<Integer> answer,
                                                          List<Integer> inputNumber) {
        int countOfCorrectNumberWithCorrectPosition = 0;
        for (int indexOfList = 0; indexOfList < answer.size(); indexOfList++) {
            if (answer.get(indexOfList).equals(inputNumber.get(indexOfList))) {
                countOfCorrectNumberWithCorrectPosition++;
            }
        }
        return countOfCorrectNumberWithCorrectPosition;
    }

    public int getCountOfCorrectNumber(List<Integer> answer,
                                       List<Integer> inputNumber) {
        List<Integer> totalNumbers = new ArrayList<>();
        totalNumbers.addAll(answer);
        totalNumbers.addAll(inputNumber);
        int totalSizeOfTwoList = 8;
        int countOfCorrectNumber = totalSizeOfTwoList - (int)(totalNumbers.stream().distinct().count());
        return countOfCorrectNumber;
    }
}
