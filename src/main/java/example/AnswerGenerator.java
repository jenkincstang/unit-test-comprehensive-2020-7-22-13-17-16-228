package example;

import java.util.*;

public class AnswerGenerator {
    public LinkedList<Integer> genarate() {
        return getRandomNumbers();
    }

    private LinkedList<Integer> getRandomNumbers() {
        LinkedList<Integer> answer = new LinkedList<>();
        Random randomNumberGenerator = new Random();
        Integer[] optionalNumbers = {0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        List<Integer> optionalNumberList = new ArrayList<>(Arrays.asList(optionalNumbers));
        int randomBound = 20;

        for (int quantityOfRandomNumber = 0; quantityOfRandomNumber< 4; quantityOfRandomNumber++){
            int randomIndex = randomNumberGenerator.nextInt(randomBound);
            Integer randomNumber = optionalNumberList.get(randomIndex);
            answer.add(randomNumber);
            optionalNumberList.remove(randomIndex);
            randomBound--;
        }
        return answer;
    }
}
