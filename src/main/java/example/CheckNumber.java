package example;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CheckNumber {

    public boolean isLegalNumber(List<Integer> inputNumbers){
        int legalQuantityOfInputNumber = 4;
        if(inputNumbers.size() != legalQuantityOfInputNumber)return false;
        if(!isNumberInRange(inputNumbers))return false;
        if(!isNotContainsRepeatElement(inputNumbers))return false;
        return true;
    }

    public boolean isNumberInRange(List<Integer> list){
        return list.stream().filter(i -> i>9 || i<0).count() == 0;
    }
//TODO
    public boolean isNotContainsRepeatElement(List<Integer> elements){
        return elements.stream().distinct().count() == elements.size();
    }

}
