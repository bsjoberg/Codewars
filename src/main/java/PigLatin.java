
public class PigLatin {

    public static String pigIt(String input) {
        StringBuilder result = new StringBuilder();
        String words[] = input.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[a-zA-Z]+"))
                result.append(convertWordToPigLatin(words[i]));
            else
                result.append(words[i]);
            if (i+1 < words.length)
                result.append(" ");
        }

        return result.toString();
    }

    public static String convertWordToPigLatin(String input) {
        StringBuilder result = new StringBuilder(input);

        result.append(result.charAt(0));
        result.deleteCharAt(0);
        result.append("ay");

        return result.toString();
    }
}