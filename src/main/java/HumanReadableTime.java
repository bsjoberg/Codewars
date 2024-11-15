
public class HumanReadableTime {

    public static String makeReadable(int input) {
        String seconds = "00";
        String minutes = "00";
        String hours = "00";

        int numberOfHours = numberOfHours(input);
        input = input - numberOfHours * 3600;
        int numberOfMinutes = numberOfMinutes(input);
        input = input - numberOfMinutes * 60;

        hours = addZeroIfNeeded(numberOfHours);
        minutes = addZeroIfNeeded(numberOfMinutes);
        seconds = addZeroIfNeeded(input);

        return hours + ":" + minutes + ":" + seconds;
    }

    private static String addZeroIfNeeded(int input) {
        String result;
        if (input < 10)
            result = "0" + String.valueOf(input);
        else
            result = String.valueOf(input);
        return result;
    }

    public static int numberOfHours(int input) {
        return input / 3600;
    }

	public static Integer numberOfMinutes(int input) {
		return input / 60;
	}
}
