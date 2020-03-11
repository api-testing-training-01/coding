package org.fundacionjala.coding;

public class SpinWords {

    public static String convertToSpin(String text) {
        String[] splitText = text.split(" ");
        String spinResult = "";
        for (int i=0 ; i< splitText.length ; i++) {
            String word = splitText[i];
            if (!word.isEmpty() && word.length() > 4) {
                spinResult += new StringBuilder(word).reverse().toString();
                spinResult += " ";
            } else {
                spinResult += word;
                spinResult += " ";
            }
        }

        return spinResult.substring(0, spinResult.length() - 1);
    }
}
