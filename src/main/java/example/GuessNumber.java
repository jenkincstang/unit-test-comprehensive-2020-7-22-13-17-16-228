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
        if(isHaveTwoCorrectNumberWithCorrectPosition(answer,inputNumber) &&
                isHaveZeroCorrectNumberWithUncorrectPosition(answer,inputNumber)){
            return "2A0B";
        }
        if(isHaveNoCorrectNumber(answer,inputNumber)){
            return "0A0B";
        }
        if(isHaveTwoCorrectNumber(answer,inputNumber) && isHaveNoneCorrectNumberWithCorrectPosition(answer,inputNumber)){
            return "0A2B";
        }
        return null;
    }

    public boolean isHaveNoCorrectNumber(LinkedList<Integer> answer,
                                         LinkedList<Integer> inputNumber){
        HashSet<Integer> unionOfNumber = new HashSet<>();
        unionOfNumber.addAll(answer);
        unionOfNumber.addAll(inputNumber);
        if(unionOfNumber.size() == 8){
            return true;
        }
        return false;

    }

    public boolean isHaveTwoCorrectNumberWithCorrectPosition(LinkedList<Integer> answer,
                                                             LinkedList<Integer> inputNumber){
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

    public boolean isHaveZeroCorrectNumberWithUncorrectPosition(LinkedList<Integer> answer,
                                                                LinkedList<Integer> inputNumber){
        HashSet<Integer> unionOfNumber = new HashSet();
        unionOfNumber.addAll(answer);
        unionOfNumber.addAll(inputNumber);
        if(unionOfNumber.size() == 6){
            return true;
        }
        return false;
    }

    public boolean isHaveTwoCorrectNumber(LinkedList<Integer> answer,
                                          LinkedList<Integer> inputNumber){
        HashSet<Integer> unionOfNumber = new HashSet();
        unionOfNumber.addAll(answer);
        unionOfNumber.addAll(inputNumber);
        if(unionOfNumber.size() == 6){
            return true;
        }
        return false;
    }

    public boolean isHaveNoneCorrectNumberWithCorrectPosition(LinkedList<Integer> answer,
                                                              LinkedList<Integer> inputNumber){
        int numberOfCorrectNumberWithCorrectPosition = 0;

        for(int indexOfList = 0;indexOfList < answer.size(); indexOfList ++){
            if(answer.get(indexOfList).equals(inputNumber.get(indexOfList))){
                numberOfCorrectNumberWithCorrectPosition ++;
            }
        }

        if(numberOfCorrectNumberWithCorrectPosition == 0){
            return true;
        }

        return false;
    }

}
