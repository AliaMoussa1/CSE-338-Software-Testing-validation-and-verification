import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WatchTest {

    Watch watch = new Watch();

    @Test
    void Test1() throws IOException {
        watch.setButtonsPressed("Aa");
        watch.watchOperations();
        Path realOutput_file = Path.of("ResultingStates.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test1.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    void Test2() throws IOException {
        watch.setButtonsPressed("abbcd");
        watch.watchOperations();
        Path realOutput_file = Path.of("ResultingStates.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test2.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    void Test3() throws IOException {
        watch.setButtonsPressed("");
        watch.watchOperations();
        Path realOutput_file = Path.of("ResultingStates.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test3.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    void Test4() throws IOException {
        watch.setButtonsPressed("caaaa");
        watch.watchOperations();
        Path realOutput_file = Path.of("ResultingStates.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test4.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    void Test5() throws IOException {
        watch.setButtonsPressed("aaa");
        watch.watchOperations();
        Path realOutput_file = Path.of("ResultingStates.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test5.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    void Test6() throws IOException {
        watch.setButtonsPressed("cdb");
        watch.watchOperations();
        Path realOutput_file = Path.of("ResultingStates.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test6.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
}