package example;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Jenkin
 * @date 2020/7/23 - 22:12
 */
public class GuessNumber {

    public String guess(LinkedList<Integer> answer,LinkedList<Integer> inputNumber){

        int countOfCorrectNumberWithCorrectPosition = getCountOfCorrectNumberWithCorrectPosition(answer,inputNumber);
        int countOfCorrectNumber = getCountOfCorrectNumber(answer,inputNumber);

        if(countOfCorrectNumberWithCorrectPosition == 4){
            return "4A0B";
        }
        if(countOfCorrectNumberWithCorrectPosition == 2 &&
                countOfCorrectNumber == 2){
            return "2A0B";
        }
        if(countOfCorrectNumber == 0){
            return "0A0B";
        }
        if(countOfCorrectNumber == 2 &&
                countOfCorrectNumberWithCorrectPosition == 0){
            return "0A2B";
        }
        if(countOfCorrectNumber == 4 &&
                countOfCorrectNumberWithCorrectPosition == 2){
            return "2A2B";
        }
        if(countOfCorrectNumber == 4 &&
                countOfCorrectNumberWithCorrectPosition == 0){
            return "0A4B";
        }
        return null;
    }

    public int getCountOfCorrectNumberWithCorrectPosition(LinkedList<Integer> answer,
                                                             LinkedList<Integer> inputNumber){
        int countOfCorrectNumberWithCorrectPosition = 0;

        for(int indexOfList = 0;indexOfList < answer.size(); indexOfList ++){
            if(answer.get(indexOfList).equals(inputNumber.get(indexOfList))){
                countOfCorrectNumberWithCorrectPosition ++;
            }
        }

        return countOfCorrectNumberWithCorrectPosition;
    }

    public int getCountOfCorrectNumber(LinkedList<Integer> answer,
                                          LinkedList<Integer> inputNumber){
        int sizeOfTwoList = 8;
        HashSet<Integer> unionOfNumber = new HashSet();
        unionOfNumber.addAll(answer);
        unionOfNumber.addAll(inputNumber);
        int countOfCorrectNumber = sizeOfTwoList - unionOfNumber.size();
         return countOfCorrectNumber;
    }
}
