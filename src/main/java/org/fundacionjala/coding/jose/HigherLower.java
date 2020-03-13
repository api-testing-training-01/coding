package org.fundacionjala.coding.jose;

public final class HigherLower {

    private HigherLower() {

    }

    public static String demoHigherLower(final String numbers) {
        final int[] listNumber = lista(numbers);
        int max = 0, min = 0;

        for (int i = 0; i < listNumber.length; i++) {
            if (min > listNumber[i]) {
                min = listNumber[i];
            }
            if (max < listNumber[i]) {
                max = listNumber[i];
            }
        }
        return max + " " + min;
    }

    public static int[] lista(final String numbers) {
        final int total = numbers.split("\\s").length;
        int[] newNumbers = new int[total];
        String[] nums = numbers.split("\\s");

        for (int i = 0; i < nums.length; i++) {
            newNumbers[i] = Integer.parseInt(nums[i]);
        }
        return newNumbers;
    }
}
