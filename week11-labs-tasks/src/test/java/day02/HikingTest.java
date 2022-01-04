package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    Hiking hiking = new Hiking();

    @Test
    void testGetTotalElevation() {
        assertEquals(13, hiking.getTotalElevation(10, 20, 15, 18));
        assertEquals(30, hiking.getTotalElevation(10, 20, 30, 40));
        assertEquals(0, hiking.getTotalElevation(20, 10, 0, -10));
    }

    @Test
    void testGetTotalElevationWithNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> hiking.getTotalElevation(null));
        assertEquals("Height values must not be null.", e.getMessage());
    }

    @Test
    void testGetTotalElevationWithEmptyList() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> hiking.getTotalElevation());
        assertEquals("Height values must contain at least one integer.", e.getMessage());
    }
}
