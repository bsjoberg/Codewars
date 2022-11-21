public class ValidatePINCode {
    public static boolean validatePin(String pin) {
        String regex = "\\d{4}|\\d{6}";

        return pin.matches(regex);
    }
}
