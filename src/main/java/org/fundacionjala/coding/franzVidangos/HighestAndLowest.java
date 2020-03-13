package org.fundacionjala.coding.franzVidangos;

public final class HighestAndLowest {

    /**constructor by default.
     */
    private HighestAndLowest() {
        //not called
    }

    /**This method split a list of numbers and select the highest and lowest value.
     * @param list  Str
     * @return Str
     */
    public static String highAndLow(final String list) {
        String[] numbersList = list.split(" ");
        int high = Integer.parseInt(numbersList[0]);
        int low = Integer.parseInt(numbersList[0]);
        for (int i = 0; i < numbersList.length; i++) {
            if (Integer.parseInt(numbersList[i]) >= high) {
                high = Integer.parseInt(numbersList[i]);
            }
            if (Integer.parseInt(numbersList[i]) < low) {
                low = Integer.parseInt(numbersList[i]);
            }
        }
        return (new StringBuilder()).append(high).append(" ").append(low).toString();
    }
}
