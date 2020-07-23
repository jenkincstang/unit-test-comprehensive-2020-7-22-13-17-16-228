package example;

import java.util.HashSet;
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
        if(isHaveTwoCorrectNumberWithCorrectPosition(answer,inputNumber)){
            return "2A0B";
        }
        return null;
    }

    public boolean isHaveTwoCorrectNumberWithCorrectPosition(LinkedList<Integer> answer,LinkedList<Integer> inputNumber){
        int numberOfCorrectNumberWithCorrectPosition = 0;

        for(int indexOfList = 0;indexOfList < answer.size(); indexOfList ++){
            if(answer.get(indexOfList).equals(inputNumber.get(indexOfList))){
                numberOfCorrectNumberWithCorrectPosition ++;
            }
        }

        if(numberOfCorrectNumberWithCorrectPosition == 2){
            return true;
        }

        return false;
    }

    public boolean isHaveZeroCorrectNumberWithUnCorrectPosition(LinkedList<Integer> answer,LinkedList<Integer> inputNumber){
        HashSet<Integer> unionOfNumber = new HashSet();
        unionOfNumber.addAll(answer);
        unionOfNumber.addAll(inputNumber);
        if(unionOfNumber.size() == 6){
            return true;
        }
        return false;
    }
}
