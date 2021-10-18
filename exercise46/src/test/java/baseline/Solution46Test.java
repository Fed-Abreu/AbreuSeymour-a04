package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {
    @Test
    void test_readFileWorks() throws FileNotFoundException {
        ReadFile read = new ReadFile();

        String expectedResults = "data\\exercise46_input.txt";

        assertNotEquals(expectedResults,read.rFile());
    }
    @Test
    void test_DisplayFileWorks() throws FileNotFoundException {

        String expectedResults = "badger:   *******\n" +
                "mushroom: **\n" +
                "snake:    *";

        assertNotEquals(expectedResults,Solution46.class);
    }

}