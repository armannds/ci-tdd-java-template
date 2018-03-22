package se.cygni.palmithor.tdd;

public class StringUtils {


    public boolean isPalindrome(final String str) {
        if (str == null) {
            return false;
        }
        String revStr = new StringBuilder(str).reverse().toString();
        return str.equals(revStr);

    }


    /**
     * Checks if a String is empty (""), null or whitespace only.
     * @param str the string to check
     *
     * @return true if str is null, empty or whitespace only, otherwise false
     */
    public boolean isBlank(final String str) {
        return str == null || str.trim().isEmpty();
    }
}
