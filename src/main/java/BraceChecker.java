public class BraceChecker {
    public boolean isValid(String input) {
        String[] stringArray = input.split("");
        boolean valid = false;

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
            // See if initial is open
            if (stringArray[i].equals("("))
                if (i+1 < stringArray.length)
                    if (stringArray[i+1].equals(")"))
                        valid = true;

            if (stringArray[i].equals("{"))
                if (i+1 < stringArray.length)
                    if (stringArray[i+1].equals("}"))
                        valid = true;

            if (stringArray[i].equals("["))
                if (i+1 < stringArray.length)
                    if (stringArray[i+1].equals("]"))
                        valid = true;

        }

        return valid;
    }
}
