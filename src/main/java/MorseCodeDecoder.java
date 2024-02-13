public class MorseCodeDecoder {
    public static String decode(String input) {
        StringBuffer outputMessage = new StringBuffer();
        String trimmedInput  = input.trim();

        String[] words = trimmedInput.split("  ");
        for (int w = 0; w < words.length; w++) {
            String[] subStrings = words[w].split(" ");
            for (int i = 0; i < subStrings.length; i++) {
                if (subStrings[i].equals(".-"))
                    outputMessage.append("A");
                else if (subStrings[i].equals("-..."))
                    outputMessage.append("B");
                else if (subStrings[i].equals("-.-."))
                    outputMessage.append("C");
                else if (subStrings[i].equals("-.."))
                    outputMessage.append("D");
                else if (subStrings[i].equals("."))
                    outputMessage.append("E");
                else if (subStrings[i].equals("..-."))
                    outputMessage.append("F");
                else if (subStrings[i].equals("--."))
                    outputMessage.append("G");
                else if (subStrings[i].equals("...."))
                    outputMessage.append("H");
                else if (subStrings[i].equals(".."))
                    outputMessage.append("I");
                else if (subStrings[i].equals(".---"))
                    outputMessage.append("J");
                else if (subStrings[i].equals("-.-"))
                    outputMessage.append("K");
                else if (subStrings[i].equals(".-.."))
                    outputMessage.append("L");
                else if (subStrings[i].equals("--"))
                    outputMessage.append("M");
                else if (subStrings[i].equals("-."))
                    outputMessage.append("N");
                else if (subStrings[i].equals("---"))
                    outputMessage.append("O");
                else if (subStrings[i].equals(".--."))
                    outputMessage.append("P");
                else if (subStrings[i].equals("--.-"))
                    outputMessage.append("Q");
                else if (subStrings[i].equals(".-."))
                    outputMessage.append("R");
                else if (subStrings[i].equals("..."))
                    outputMessage.append("S");
                else if (subStrings[i].equals("-"))
                    outputMessage.append("T");
                else if (subStrings[i].equals("..-"))
                    outputMessage.append("U");
                else if (subStrings[i].equals("...-"))
                    outputMessage.append("V");
                else if (subStrings[i].equals(".--"))
                    outputMessage.append("W");
                else if (subStrings[i].equals("-..-"))
                    outputMessage.append("X");
                else if (subStrings[i].equals("-.--"))
                    outputMessage.append("Y");
                else if (subStrings[i].equals("--.."))
                    outputMessage.append("Z");
                else if (subStrings[i].equals(".-.-.-"))
                    outputMessage.append(".");
                else if (subStrings[i].equals("-.-.--"))
                    outputMessage.append("!");
                else if (subStrings[i].equals("...---..."))
                    outputMessage.append("SOS");
            }
            if (w+1 != words.length)
                outputMessage.append(" ");
        }

        return outputMessage.toString();
    }
}
