import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedClass {
    private String text;
    private String expected;

    public ParameterizedClass(String text, String expected) {
        this.text = text;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<String[]> testConditions() {
        return Arrays.asList(new String[][] {
                {"asd", "as"},
                {"nab", "ab"},
                {"abcdeapbcdef", "abcde"}
        });
    }

    @Test
    public void makeTest() {
        assertEquals(expected, Kata.longestAlpabeticalSubstring(text));
    }
}
