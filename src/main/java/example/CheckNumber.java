package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class CheckNumber {

    public boolean isLegalNumber(LinkedList<Integer> inputNumbers){
        if(inputNumbers.size() == 4)return true;
        if(isNumberInRange(inputNumbers))return true;
        return false;
    }
    public boolean isNumberInRange(LinkedList<Integer> list){
        return list.stream().filter(i -> i>9 || i<0).count() == 0;
    }

}
