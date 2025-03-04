package org;

public class GreedIsGood {

    private GreedIsGood() {
        throw new IllegalStateException("Static Class");
    }

    public static int greedy(int[] input) {
        int result = 0;
        int one_count = 0;
        int four_count = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                result += 100;
                one_count++;
            }
            else if (input[i] == 4) {
                four_count++;
            }

            else if (input[i] == 5)
                result += 50;
        }

        if (one_count / 3 >= 1)
            result += 700;
        else if (four_count / 3 >= 1)
            result += 400;

        return result;
    }
}
