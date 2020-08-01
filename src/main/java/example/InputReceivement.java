package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReceivement {
    public List<Integer> receive(String consoleInput) {
        List<Integer> inputs = new ArrayList<>();
        for(String number:consoleInput.split(" ")){
            inputs.add(Integer.valueOf(number));
        }
        return inputs;
    }
    public String readConsole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Game begin, please input 4 numbers between 0 and 9 and separate the numbers with spaces, eg:1 2 3 4");
        String consoleInput = sc.nextLine();
        return consoleInput;
    }
}
