package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class CheckNumber {

    public boolean isLegalNumber(LinkedList<Integer> inputNumbers){
        if(inputNumbers.size() == 4)return true;
        return false;
    }
}
