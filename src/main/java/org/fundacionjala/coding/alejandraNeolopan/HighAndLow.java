package org.fundacionjala.coding.alejandraNeolopan;
/**
 * Codewars exercise 2.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighAndLow {
    /**
     * Given a string of space separated numbers, and have to return the highest and lowest number.
     * @param  numbers  the string that contains integers
     * @return String with th highest first and then the lowest
     */
    public String highAndLow(final String numbers) {
        // Split numbers and convert to integer
        List<String> numbersArray = Arrays.asList(numbers.split(" "));
        List<Integer> integersArray = new ArrayList<>();
        numbersArray.forEach(i -> integersArray.add(Integer.parseInt(i)));
        int high =  Collections.max(integersArray);
        int low =  Collections.min(integersArray);
        return high + " " + low;
    }
}
