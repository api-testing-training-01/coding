package org.fundacionjala.coding.JoseEguivar;

public final class HighAndLow {
    private HighAndLow() {

    }
     static String highLow(final String numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] array = numbers.split(" ");

        for (String s: array) {
            int num = Integer.parseInt(s);

            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return "" + max + " " + min;
    }
}
