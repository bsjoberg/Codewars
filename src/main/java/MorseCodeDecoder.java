public class MorseCodeDecoder {
    public static String decode(String input) {
        StringBuffer outputMessage = new StringBuffer();

        String[] words = input.split("  ");
        for (int w = 0; w < words.length; w++) {
            String[] subStrings = words[w].split(" ");
            for (int i = 0; i < subStrings.length; i++) {
                if (subStrings[i].equals(".-"))
                    outputMessage.append("A");
                else if (subStrings[i].equals("-..."))
                    outputMessage.append("B");
                else if (subStrings[i].equals("-.."))
                    outputMessage.append("D");
                else if (subStrings[i].equals("."))
                    outputMessage.append("E");
                else if (subStrings[i].equals("...."))
                    outputMessage.append("H");
                else if (subStrings[i].equals(".---"))
                    outputMessage.append("J");
                else if (subStrings[i].equals("-"))
                    outputMessage.append("T");
                else if (subStrings[i].equals("..-"))
                    outputMessage.append("U");
                else if (subStrings[i].equals("-.--"))
                    outputMessage.append("Y");
            }
            if (w+1 != words.length)
                outputMessage.append(" ");
        }

        return outputMessage.toString();
    }
}
