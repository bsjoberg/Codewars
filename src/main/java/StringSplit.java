public class StringSplit {

    public static String[] solution(String input) {
        StringBuffer pair = new StringBuffer();
        if (input.length() % 2 == 1)
        {
            StringBuffer inputBuffer = new StringBuffer(input);
            inputBuffer.append("_");
            input = inputBuffer.toString();
        }

        String [] result = new String [input.length()/2];

        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if (i % 2 == 0)
            {
                pair = new StringBuffer();
                pair.append(c);
            }
            else {
                pair.append(c);
                result[(i+1)/2 - 1] = pair.toString();
            }
        }
        return result;
    }
}
