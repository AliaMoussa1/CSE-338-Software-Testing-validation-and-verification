import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {

    MaxMin maxmin = new MaxMin();

    @Test
    public void arr1(){
        int []a = {};
        assertEquals(-1,maxmin.isMax(a));
        assertEquals(-1,maxmin.isMin(a));
    }

    @Test
    public void arr2(){
        int []a = {700,1000,99,-1,-10,500,47};
        assertEquals(1000,maxmin.isMax(a));
        assertEquals(-10,maxmin.isMin(a));
    }

}