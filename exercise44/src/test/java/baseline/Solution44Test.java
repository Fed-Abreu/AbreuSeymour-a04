package baseline;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {

    JSONParser parser = new JSONParser();
    @Test
    void test_CanDisplay() throws IOException, ParseException {
        Object obj = parser.parse(new FileReader("data/exercise44_input.json"));

        String actualResults = "products";

        assertNotEquals(obj,"{ products : [ {name: Widget, price: 25.00, quantity: 5 }, {name: Thing, price: 15.00, quantity: 5 }, {name: Doodad, price: 5.00, quantity: 10 }]}");
    }

}