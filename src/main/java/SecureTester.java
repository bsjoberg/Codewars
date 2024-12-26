import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecureTester {

    public static boolean alphanumeric(String input) {
        Pattern alphanumericPattern = Pattern.compile("[a-zA-Z0-9]");
        Matcher countMatcher = alphanumericPattern.matcher(input);

        if (input.length() == 0)
            return false;
        else {
            int count = 0;
            while (countMatcher.find())
                count++;

            return input.length() == count;
        }
    }
}
