package example;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Jenkin
 * @date 2020/7/23 - 22:12
 */
public class GuessNumber {

    public String guess(LinkedList<Integer> answer, LinkedList<Integer> inputNumber) {

        int countOfCorrectNumberWithCorrectPosition = getCountOfCorrectNumberWithCorrectPosition(answer, inputNumber);
        int countOfCorrectNumber = getCountOfCorrectNumber(answer, inputNumber);
        int sizeOfInputNumber = inputNumber.size();

        String result = getGuessResult(countOfCorrectNumberWithCorrectPosition, countOfCorrectNumber);
        return result;
    }

    private String getGuessResult(int countOfCorrectNumberWithCorrectPosition, int countOfCorrectNumber) {
        String result = countOfCorrectNumberWithCorrectPosition + "A" + (countOfCorrectNumber - countOfCorrectNumberWithCorrectPosition) + "B";
        return result;
    }

    public int getCountOfCorrectNumberWithCorrectPosition(LinkedList<Integer> answer,
                                                          LinkedList<Integer> inputNumber) {
        int countOfCorrectNumberWithCorrectPosition = 0;

        for (int indexOfList = 0; indexOfList < answer.size(); indexOfList++) {
            if (answer.get(indexOfList).equals(inputNumber.get(indexOfList))) {
                countOfCorrectNumberWithCorrectPosition++;
            }
        }

        return countOfCorrectNumberWithCorrectPosition;
    }

    public int getCountOfCorrectNumber(LinkedList<Integer> answer,
                                       LinkedList<Integer> inputNumber) {
        HashSet<Integer> unionOfNumber = new HashSet();
        unionOfNumber.addAll(answer);
        unionOfNumber.addAll(inputNumber);

        int totalSizeOfTwoList = 8;
        int countOfCorrectNumber = totalSizeOfTwoList - unionOfNumber.size();
        return countOfCorrectNumber;
    }
}
