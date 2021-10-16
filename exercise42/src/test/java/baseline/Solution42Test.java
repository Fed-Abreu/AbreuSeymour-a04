package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;


import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {
    Solution42 sol = new Solution42();
    @Test
    void test_inputDisplayWorks(){
        String expectedResults =
                "\nLing      Mai       55900\n" +
                "Johnson   Jim       56500\n" +
                "Jones     Aaron     46000\n" +
                "Jones     Chris     34500\n" +
                "Swift     Geoffrey  14200\n" +
                "Xiong     Fong      65000\n" +
                "Zarnecki  Sabrina   51500";
        String d = sol.displayInput("data/exercise42_input.txt");

        assertFalse(d.contains(expectedResults));
    }

}