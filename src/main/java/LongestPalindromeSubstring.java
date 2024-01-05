public class LongestPalindromeSubstring {

    private final String input;

    public LongestPalindromeSubstring(String input) {
        this.input = input;
    }

    public String findLongestPalindrome() {
        if (input == null) {
            throw new NullPointerException("Text must not be null!");
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Text is empty!");
        }

        StringBuilder longestPalindrome = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            StringBuilder current = expandAroundCenter(i, i);
            if (current.length() > longestPalindrome.length()) {
                longestPalindrome = current;
            }
            current = expandAroundCenter(i, i + 1);
            if (current.length() > longestPalindrome.length()) {
                longestPalindrome = current;
            }
        }
        return longestPalindrome.toString();
    }

    private StringBuilder expandAroundCenter(int left, int right) {
        StringBuilder result = new StringBuilder();
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            result.insert(0, input.charAt(left));
            if (left != right) {
                result.append(input.charAt(right));
            }
            left--;
            right++;
        }
        return result;
    }
}