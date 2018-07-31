// The entry point for my practice exercises.

package com.sqeaky.practice;

import java.util.Map;
import java.util.Collections;

public class JavaPractice {

    private static String renderStarString(Map<Character, Long> histogram) {
        String results = "";
        for(Map.Entry<Character, Long> entry : histogram.entrySet()){
            final String prefix = entry.getKey().toString();
            final int copies = entry.getValue().intValue();
            final String suffix = String.join("", Collections.nCopies(copies, "*"));
            results += prefix + ": " + suffix + "\n";
        }
        return results;
    }

    public static void main(String[] args){

        // Lets print a visual
        for(String argument : args) {
            String oneHistogram = renderStarString(StringManipulation.frequency(argument));
            System.out.println(oneHistogram);
        }
    }

}
