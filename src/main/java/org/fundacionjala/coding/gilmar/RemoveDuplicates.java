package org.fundacionjala.coding.gilmar;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class RemoveDuplicates {

    private RemoveDuplicates() {
    }

    public static String cleanUpDuplicates(final String input) {
        String withoutDuplicates;
        withoutDuplicates = Arrays.stream(input.split("\\s+"))
                .distinct()
                .collect(Collectors.joining(" "));
        return withoutDuplicates;
    }

}
