package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    Solution43 sol = new Solution43();
    @Test
    void createWebsiteWorks(){

        sol.siteName = "TESTING";
        sol.author = "test";
        sol.path = "./data/website/";

        String expectedResults = "./data/website/TESTING";
        assertEquals(expectedResults,sol.createWebsite());
    }
    @Test
    void createJavaFolder(){

        sol.siteName = "TESTING";
        sol.author = "test";
        sol.path = "./data/website/";

        String expectedResults = "./data/website/TESTING/js/";
        assertEquals(expectedResults,sol.createJAVAFolder());

    }
    @Test
    void createCSSWorks(){

        sol.siteName = "TESTING";
        sol.author = "test";
        sol.path = "./data/website/";

        String expectedResults = "./data/website/TESTING/css/";
        assertEquals(expectedResults,sol.createCSSFolder());
    }
    @Test
    void createHTMLWorks(){

        sol.siteName = "TESTING";
        sol.author = "test";
        sol.path = "./data/website/";

        String expectedResults = "./data/website/TESTING/index.html";
        assertEquals(expectedResults,sol.createHMTL());
    }

}