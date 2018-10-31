import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringComparatorTest {

    @org.junit.jupiter.api.Test
    void stringCompare() {
        StringComparator sc = new StringComparator();
        ArrayList<String> actual = sc.stringCompare("word1 word2 word3 word4 word5 word6","word1 word3 word5");
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("word2", "word4","word6"));
        assertEquals(actual,expected);
    }
}