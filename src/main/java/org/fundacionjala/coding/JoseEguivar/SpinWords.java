package org.fundacionjala.coding.JoseEguivar;

public class SpinWords {
    public String spinWords(final String sentence) {
        String[] array = sentence.split(" ");
        final int number = 5;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= number) {
                array[i] = new StringBuffer(array[i]).reverse().toString();
            }
        }
        return String.join(" ", array);
    }
}
