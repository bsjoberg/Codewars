public class ValidatePINCode {
    public static boolean validatePin(String s) {
        String regex4Digits = "\\d{4}";
        String regex6Digits = "\\d{6}";

        if(s.matches(regex4Digits) || s.matches(regex6Digits)) {
            return true;
        } else {
            return false;
        }
    }
}
