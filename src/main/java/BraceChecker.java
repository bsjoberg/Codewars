public class BraceChecker {
    public boolean isValid(String input) {
        String[] stringArray = input.split("");
        boolean valid = false;

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
            valid = findMatch(stringArray, i,"(", ")");
            if (valid == true) {
                i++;
                continue;
            }

            valid = findMatch(stringArray, i,"{", "}");
            if (valid == true) {
                i++;
                continue;
            }

            valid = findMatch(stringArray, i,"[", "]");
            if (valid == true)
                i++;
        }

        return valid;
    }

    private static boolean findMatch(String[] stringArray, int i, String openInput, String closeInput) {
        boolean valid = false;
        if (stringArray[i].equals(openInput))
            if (i +1 < stringArray.length)
                if (stringArray[i +1].equals(closeInput))
                    valid = true;
        return valid;
    }
}
