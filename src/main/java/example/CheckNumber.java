package example;

import java.util.HashSet;
import java.util.LinkedList;

public class CheckNumber {

    public boolean isLegalNumber(LinkedList<Integer> inputNumbers){
        if(inputNumbers.size() == 4)return true;
        if(isNumberInRange(inputNumbers))return true;
        if(isNotContainsRepeatElement(inputNumbers))return true;
        return false;
    }

    public boolean isNumberInRange(LinkedList<Integer> list){
        return list.stream().filter(i -> i>9 || i<0).count() == 0;
    }

    public boolean isNotContainsRepeatElement(LinkedList<Integer> list){
        HashSet<Integer> set = new HashSet();
        for (Integer item:list){
            set.add(item);
        }
        if(set.size() == list.size()) return true;
        return false;
    }

}
