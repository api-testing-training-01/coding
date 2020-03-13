package org.fundacionjala.coding.franzVidangos;

public final class SpinWords {

    /**constructor by default.
     */
    private SpinWords() {
        //not called
    }

    /**This method split a sentence by words and if the words has more than 5 letters it should spin.
     * @param sentence  Str
     * @return Str
     */
    public static String sentenceBuilder(final String sentence) {
        final int limit = 5;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= limit) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}


