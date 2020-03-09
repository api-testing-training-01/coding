package org.fundacionjala.coding.marcos;

public final class ReverseString {

    private ReverseString() {

    }

    public static String invert(final String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
