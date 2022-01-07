package day05;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery = new Lottery(80, 5);

    @Test
    void testCreate() {
        assertEquals(80, lottery.getTotalNumbers());
        assertEquals(5, lottery.getNumberOfDraws());
    }

    @RepeatedTest(100)
    void testDraw() {
        List<Integer> numbers = lottery.draw();
        assertEquals(5, numbers.size());
        assertTrue(areNumbersValid(numbers));
    }

    boolean areNumbersValid(List<Integer> numbers) {
        List<Integer> previousNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (previousNumbers.contains(number)) { return false; }
            if (number < 1) { return false; }
            if (number > 80) { return false; }
            previousNumbers.add(number);
        }
        return true;
    }
}
