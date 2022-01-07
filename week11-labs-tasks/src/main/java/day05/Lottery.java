package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private final int totalNumbers;
    private final int numberOfDraws;
    private final Random random;

    public Lottery(int totalNumbers, int numberOfDraws) {
        this.totalNumbers = totalNumbers;
        this.numberOfDraws = numberOfDraws;
        random = new Random();
    }

    public int getTotalNumbers() {
        return totalNumbers;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }

    public List<Integer> draw() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < numberOfDraws) {
            int draw = random.nextInt(totalNumbers) + 1;
            if (!numbers.contains(draw)) {
                numbers.add(draw);
            }
        }
        return numbers;
    }
}
