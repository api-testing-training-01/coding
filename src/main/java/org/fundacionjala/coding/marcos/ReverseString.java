package org.fundacionjala.coding.marcos;

public class ReverseString {
    public static String invert(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
