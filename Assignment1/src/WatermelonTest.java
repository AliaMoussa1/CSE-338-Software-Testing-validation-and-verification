import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatermelonTest {
    @Test
    void twoKilos () {
        Watermelon watermelon = new Watermelon();
        assertEquals("No", watermelon.areTwoPartsEven(2));
    }

    @Test
    void threeKilos () {
        Watermelon watermelon = new Watermelon();
        assertEquals("No", watermelon.areTwoPartsEven(3));
    }

    @Test
    void oneKilo () {
        Watermelon watermelon = new Watermelon();
        assertEquals("No", watermelon.areTwoPartsEven(1));
    }

    @Test
    void eightKilos () {
        Watermelon watermelon = new Watermelon();
        assertEquals("Yes", watermelon.areTwoPartsEven(8));
    }

    @Test
    void oneHundredKilos () {
        Watermelon watermelon = new Watermelon();
        assertEquals("Yes", watermelon.areTwoPartsEven(100));
    }

    @Test
    void oneHundredAndOneKilos () {
        Watermelon watermelon = new Watermelon();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    watermelon.areTwoPartsEven(101);
                    } );
    }



}