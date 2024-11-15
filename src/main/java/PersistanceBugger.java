
public class PersistanceBugger {
    public static Integer persistence(int input) {
        int result = 0;
        while (input >= 10) {
            input = multiplyDigitsInANumber(input);
            result += 1;
        }

        return result;
    }

    static Integer multiplyDigitsInANumber(int input) {
        int result;

        result = input % 10;
        int remainder = input / 10;
        
        while (remainder > 0) {
            if (remainder < 10)
                result = result * remainder;
            else
                result = result * (remainder % 10);
            remainder = remainder / 10;
        }

        return result;
    }
}
