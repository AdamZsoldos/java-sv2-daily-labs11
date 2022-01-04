package day02;

public class Hiking {

    public int getTotalElevation(int... heightValues) {
        if (heightValues == null) {
            throw new IllegalArgumentException("Height values must not be null.");
        } else if (heightValues.length < 1) {
            throw new IllegalArgumentException("Height values must contain at least one integer.");
        }
        int sum = 0;
        for (int i = 1; i < heightValues.length; i++) {
            sum += Math.max(heightValues[i] - heightValues[i - 1], 0);
        }
        return sum;
    }
}
