import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordWithStringComparatorTest {

    @Test
    void countPunctuation() {
        WordWithStringComparator wordStrComp = new WordWithStringComparator();
        int actual = wordStrComp.wordStringComparator("Hello! My name is Serg! Hello! Goodbye!","Hello");
        int expected = 2;
        assertEquals(actual,expected);
    }

    @Test
    void wordStringComparator() {
        WordWithStringComparator wordStrComp = new WordWithStringComparator();
        int actual = wordStrComp.countPunctuation("Hello! My name is Serg! Hello! Goodbye!");
        int expected = 4;
        assertEquals(actual,expected);
    }
}