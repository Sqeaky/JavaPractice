package com.sqeaky.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple class to own any static string string manipulation methods I have.
 */
public class StringManipulation {

    /**
     * This constructs a histogram in the form of a map. This keys are the lowercase alphanumeric
     * or digit characters.
     *
     * @param toBeCounted A string to generate a histogram for.
     * @return A Map with Character as the key type, containing only lowercase letters and digits
     *         and only long for values.
     */
    public static Map<Character, Long> frequency(final String toBeCounted) {
        HashMap<Character, Long> results = new HashMap<Character, Long>();
        final Long zero = Long.valueOf(0);
        for(Character oneCharacter: toBeCounted.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(oneCharacter)) {
                Long count = results.getOrDefault(oneCharacter, zero);
                results.put(oneCharacter, count + 1);
            }
        }
        return results;
    }

}
