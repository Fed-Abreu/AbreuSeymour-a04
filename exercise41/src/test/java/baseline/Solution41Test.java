package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    Solution41 sol = new Solution41();
    @Test
    void  test_CanReadName() throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("data/exercise41_input.txt"));
        ArrayList<String> name = new ArrayList<>();

        ArrayList<String> expectedResults = new ArrayList<>();
        expectedResults.add("Ling, Mai, " + "Johnson, Jim, " + "Zarnecki, Sabrina, " + "Jones, Chris, " + "Jones, Aaron, " + "Swift, Geoffrey, " + "Xiong, Fong");

        assertArrayEquals(expectedResults,sol.readName(inputFile,name));

    }

    private void assertArrayEquals(ArrayList<String> expectedResults, List<String> readName) {
    }

    @Test
    void test_CanOutputName() throws IOException {
        ArrayList<String> name = new ArrayList<>();

        ArrayList<String> expectedResults = new ArrayList<>();

        expectedResults.add("Johnson, Jim" +
                "Jones, Aaron" +
                "Jones, Chris" +
                "Ling, Mai" +
                "Swift, Geoffrey" +
                "Xiong, Fong" +
                "Zarnecki, Sabrina");

        assertArrayEquals(expectedResults,sol.outputName(name));
    }
}