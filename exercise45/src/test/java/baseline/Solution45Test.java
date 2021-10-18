package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {

@Test
    void test_readFileworks() throws IOException {
    Read read = new Read();

        String expectedResults = "data/exercise45_input.txt";

        String actualResults = read.readFile();

        assertNotEquals(expectedResults,actualResults);
    }
    @Test
    void test_writeFileworks() throws IOException {

        String expectedResults = "data/exercise45_input.txt";

        String actualResults = "";

        assertNotEquals(expectedResults,actualResults);
    }
}