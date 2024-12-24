public class ROT13Solution {

    public static String rot13(String input) {
        StringBuffer result = new StringBuffer();

        // Break string into array
        for (char c : input.toCharArray()) {
            // Check if char is an alpha character
            if (isEnglishLetter(c)) {
                result.append(convertAlpha(c));
            } else
                result.append(c);
        }

        return result.toString();
    }

    static boolean isEnglishLetter(char input) {
        boolean result = false;

        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
            result = true;

        return result;
    }

    static char convertAlpha(char input) {
        char result = input;

        int asciiValue = (int) input;
        int ROT13Value = asciiValue + 13;

        if (input >= 65 && input <= 90) {
            if (ROT13Value > 90)
                ROT13Value = ROT13Value - 26;
            result = (char) ROT13Value;
        } else if (input >= 97 && input <= 122) {
            if (ROT13Value > 122)
                ROT13Value = ROT13Value - 26;
            result = (char) ROT13Value;
        }

        return result;
    }
}
