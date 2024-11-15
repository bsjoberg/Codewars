public class StringSplit {

  public static String[] solution(String input) {
    // Write your code here
    if (input.length() % 2 == 1)
      input += "_";
    int arraySize = input.length() / 2;

    String[] result = new String[arraySize];
    for (int i = 0; i < arraySize; ++i)
      result[i] = "" + input.charAt(i * 2) + input.charAt(1 + i * 2);

    return result;
  }
}
