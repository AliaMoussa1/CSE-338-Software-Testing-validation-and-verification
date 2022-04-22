import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorsTest {
    @Test
    void threeForcesAtEquilibrium(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{3,-1, 7}, {-5, 2, -4}, {2, -1, -3}};
        assertEquals("Yes", vectors.isAtEquilibrium(Forces));
    }

    @Test
    void threeForcesNotAtEquilibrium(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{4, 1, 7}, {-2, 4, -1}, {1, -5, -3}};
        assertEquals("No", vectors.isAtEquilibrium(Forces));
    }

    @Test
    void fourForcesOfValueZero(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}};
        assertEquals("Yes", vectors.isAtEquilibrium(Forces));
    }

    @Test
    void fourForcesInNegativeDirection(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{-3,-1, -7}, {-5, -6, -4}, {-2, -1, -3}, {-7,-8,-9}};
        assertEquals("No", vectors.isAtEquilibrium(Forces));
    }

    @Test
    void fourForcesInPositiveDirection(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{3,1, 7}, {5, 6, 4}, {2, 1, 3}, {7,8,9}};
        assertEquals("No", vectors.isAtEquilibrium(Forces));
    }

    @Test
    void fiveForcesAtEquilibrium(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{3,-1, 7}, {-5, 2, -4}, {2, -1, -3}, {-1,-1,-1}, {1,1,1}};
        assertEquals("Yes", vectors.isAtEquilibrium(Forces));
    }

    @Test
    void threeRandomForces(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{3,-1, 7}, {-5, 2, -4}, {2, 1, 1}};
        assertEquals("Yes", vectors.isAtEquilibrium(Forces));
    }

}