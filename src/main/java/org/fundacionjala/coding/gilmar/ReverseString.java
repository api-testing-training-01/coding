package org.fundacionjala.coding.gilmar;

public final class ReverseString {
    public ReverseString() {

    }

    public static String reverse(final String input) {
        String process = "";
        for (int x = input.length() - 1; x >= 0; x--) process = process + input.charAt(x);
        process = process.substring(0, input.length() - 1);
        return process;
    }
}
