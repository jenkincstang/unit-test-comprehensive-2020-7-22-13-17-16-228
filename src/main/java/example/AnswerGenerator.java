package example;

import java.util.*;

public class AnswerGenerator {
    //TODO
    public LinkedList<Integer> genarate() {
        return getRandomNumbers();
    }
    //TODO
    private LinkedList<Integer> getRandomNumbers() {
        LinkedList<Integer> answer = new LinkedList<>();
        List<Integer> optionalNumbers = new ArrayList<Integer>(Arrays.asList(new Integer[]{0, 1, 2, 4, 5, 6, 7, 8, 9}));

        Random randomIndexGenerator = new Random();
        int randomBound = 9;
        for (int quantityOfRandomNumber = 0; quantityOfRandomNumber< 4; quantityOfRandomNumber++){
            int randomIndex = randomIndexGenerator.nextInt(randomBound);
            Integer randomNumber = optionalNumbers.get(randomIndex);
            answer.add(randomNumber);
            optionalNumbers.remove(randomIndex);
            randomBound --;
        }
        return answer;
    }
}
