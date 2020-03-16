package org.fundacionjala.coding.JoseEguivar;
class Kata {
    public static String highAndLow(String s) {
        String [] strs = s.split(" ");
        Integer [] ints = new Integer[strs.length];

        for (int i = 0; i < strs.length; i++) {
            ints[i] = Integer.parseInt(strs[i]);
        }

        Integer max = ints[0];
        Integer min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if(max < ints[i])
                max = ints[i];
            if(min > ints[i])
                min = ints[i];
        }

        return max.toString() + " " + min.toString();
    }
}