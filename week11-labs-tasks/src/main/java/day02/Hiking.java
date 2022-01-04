package day02;

import java.util.List;

public class Hiking {

    public int getTotalElevation(int... heightValues) {
        if (heightValues == null) {
            throw new IllegalArgumentException("Height values must not be null.");
        } else if (heightValues.length < 1) {
            throw new IllegalArgumentException("Height values must contain at least one integer.");
        }
        int sum = 0;
        int lastHeight = heightValues[0];
        for (int i = 1; i < heightValues.length; i++) {
            if (heightValues[i] > lastHeight) {
                sum += heightValues[i] - lastHeight;
            }
            lastHeight = heightValues[i];
        }
        return sum;
    }
}
