/**
 * Two tortoises named A and B must run a race. A starts with an average speed
 * of 720 feet per hour. Young B knows she runs faster than A, and furthermore
 * has not finished her cabbage.
 *
 * When she starts, at last, she can see that A has a 70 feet lead but B's speed
 * is 850 feet per hour. How long will it take B to catch A?
 * 
 * More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's
 * speed, integer > 0) and a lead g (integer > 0) how long will it take B to
 * catch A?
 * 
 * The result will be an array [hour, min, sec] which is the time needed in
 * hours, minutes and seconds (round down to the nearest second) or a string in
 * some languages.
 * 
 * If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C,
 * Go, Nim, Pascal, COBOL, Erlang, [-1, -1, -1] for Perl,[] for Kotlin or "-1 -1
 * -1" for others.
 * 
 * Examples:
 * (form of the result depends on the language)
 * 
 * race(720, 850, 70) => [0, 32, 18] or "0 32 18"
 * race(80, 91, 37) => [3, 21, 49] or "3 21 49"
 */
public class TortoiseRacing {

    public static int[] race(int racerSpeedA, int racerSpeedB, int distanceLeadOfRacerA) {
        int[] result = null;

        if (racerSpeedA < racerSpeedB) {
            result = convertToTimeArrary(timeToCloseDistance(racerSpeedB - racerSpeedA, distanceLeadOfRacerA));
        }

        return result;
    }

    static int timeToCloseDistance(int speedDifference, int leadDistance) {
        Double leadDistanceDouble = Double.valueOf(leadDistance);
        double speedDifferenceInSeconds = (double) speedDifference / (double) 3600;
        Double resultInSeconds = Double.valueOf(leadDistanceDouble / speedDifferenceInSeconds);

        return resultInSeconds.intValue();
    }

    static int[] convertToTimeArrary(int timeInSeconds) {
        int hours = timeInSeconds / 3600;
        int minutes = (timeInSeconds - (hours * 3600)) / 60;
        int seconds = (timeInSeconds - (hours * 3600) - (minutes * 60));

        int result[] = { hours, minutes, seconds };

        return result;
    }
}
