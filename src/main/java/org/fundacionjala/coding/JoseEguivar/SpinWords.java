package org.fundacionjala.coding.JoseEguivar;

public class SpinWords {
    public String spinWords(String sentence) {
        //TODO: Code stuff here
        String[] array = sentence.split(" ");
        for(int i=0;i<array.length;i++){
            if(array[i].length() >= 5)
                array[i] = new StringBuffer(array[i]).reverse().toString();
        }
        return String.join(" ",array);
    }
}
