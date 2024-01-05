import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeSubstringTest {

    @Test
    public void testFindLongestPalindrome() {
        LongestPalindromeSubstring palindromeFinder = new LongestPalindromeSubstring("babad");
        assertEquals("bab", palindromeFinder.findLongestPalindrome());

        palindromeFinder = new LongestPalindromeSubstring("cbbd");
        assertEquals("bb", palindromeFinder.findLongestPalindrome());

        palindromeFinder = new LongestPalindromeSubstring("a");
        assertEquals("a", palindromeFinder.findLongestPalindrome());

        palindromeFinder = new LongestPalindromeSubstring("racecar");
        assertEquals("racecar", palindromeFinder.findLongestPalindrome());

        palindromeFinder = new LongestPalindromeSubstring("abcdefg");
        assertEquals("a", palindromeFinder.findLongestPalindrome());
    }

    @Test(expected = NullPointerException.class)
    public void testFindLongestPalindromeWithNullInput() {
        LongestPalindromeSubstring palindromeFinder = new LongestPalindromeSubstring(null);
        palindromeFinder.findLongestPalindrome();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindLongestPalindromeWithEmptyInput() {
        LongestPalindromeSubstring palindromeFinder = new LongestPalindromeSubstring("");
        palindromeFinder.findLongestPalindrome();
    }
}
