package example;

import java.util.HashSet;
import java.util.LinkedList;

public class CheckNumber {

    public boolean isLegalNumber(LinkedList<Integer> inputNumbers){
        if(inputNumbers.size() != 4)return false;
        if(!isNumberInRange(inputNumbers))return false;
        if(!isNotContainsRepeatElement(inputNumbers))return false;
        return true;
    }

    public boolean isNumberInRange(LinkedList<Integer> list){
        return list.stream().filter(i -> i>9 || i<0).count() == 0;
    }

    public boolean isNotContainsRepeatElement(LinkedList<Integer> elements){
        HashSet<Integer> notRepeatElements = new HashSet();
        for (Integer item:elements){
            notRepeatElements.add(item);
        }
        if(notRepeatElements.size() == elements.size()) return true;
        return false;
    }

}
