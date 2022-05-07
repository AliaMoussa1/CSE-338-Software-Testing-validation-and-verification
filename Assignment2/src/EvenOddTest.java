import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    EvenOdd test = new EvenOdd();

    @Test
    public void zeroIsEven(){
        assertEquals("Even", test.checkEvenOdd(0));
    }

    @Test
    public void twoIsEven(){
        assertEquals("Even", test.checkEvenOdd(2));
    }

    @Test
    public void twentyIsEven(){
        assertEquals("Even", test.checkEvenOdd(20));
    }

    @Test
    public void thirtyIsEven(){
        assertEquals("Even", test.checkEvenOdd(30));
    }

    @Test
    public void oneIsOdd(){
        assertEquals("Odd", test.checkEvenOdd(1));
    }

    @Test
    public void thirtyThreeIsOdd(){
        assertEquals("Odd", test.checkEvenOdd(33));
    }

    @Test
    public void ninetyNineIsOdd(){
        assertEquals("Odd", test.checkEvenOdd(99));
    }

    @Test
    public void twentyThreeIsOdd(){
        assertEquals("Odd", test.checkEvenOdd(23));

    }

}