import org.junit.*;

import static org.junit.Assert.*;

public class KataTest {
    private Kata kata;
    private static int count;

    @BeforeClass
    public static void before() {
        System.out.println("runs once before. count = " + count++);
    }

    @AfterClass
    public static void after() {
        System.out.println("runs once after. count = " + count++);
    }

    @After
    public void teardown() {
        System.out.println("count = " + count++);
    }

    @Before
    public void setup() {
        kata = new Kata();
        System.out.println("Running tests...");
    }

    @Test
    public void testSimpleWords() {
        assertEquals("as", Kata.longestAlpabeticalSubstring("asd"));
        assertEquals("ab", Kata.longestAlpabeticalSubstring("nab"));
        assertEquals("abcde", Kata.longestAlpabeticalSubstring("abcdeapbcdef"));
        assertEquals("aaaabbbbctt", Kata.longestAlpabeticalSubstring("asdfaaaabbbbcttavvfffffdf"));
        assertEquals("fgikl", Kata.longestAlpabeticalSubstring("asdfbyfgiklag"));
    }

    @Test
    public void testWordsWithSingleLetter() {
        // assertEquals("expected", "actual");
        assertEquals("a", Kata.longestAlpabeticalSubstring("a"));
        assertEquals("f", Kata.longestAlpabeticalSubstring("f"));
        assertEquals("z", Kata.longestAlpabeticalSubstring("z"));
    }

    @Test
    public void testWordsWithLettersInBackwardOrder() {
        // assertEquals("expected", "actual");
        assertEquals("z", Kata.longestAlpabeticalSubstring("zpda"));
        assertEquals("f", Kata.longestAlpabeticalSubstring("fda"));
        assertEquals("z", Kata.longestAlpabeticalSubstring("zyx"));
    }

}