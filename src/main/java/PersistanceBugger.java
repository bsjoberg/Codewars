
public class PersistanceBugger {
    public static Integer persistence(int input) {
        int result = 0;
        while (input >= 10) {
            input = multiply(input);
            result += 1;
        }

        return result;
    }

    static Integer multiply(int input) {
        int result;

        result = input % 10;
        int tens = input / 10 % 10;
        
        if (tens > 0)
            result = result * tens;

        int hundreds = input / 100;

        if (hundreds > 0)
            result = result * hundreds;

        return result;
    }
}
