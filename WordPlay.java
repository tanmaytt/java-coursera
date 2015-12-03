
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.*;

public class WordPlay {
    public boolean isVowel(char ch) {
        boolean isAVowel = false;
        Character testChar = Character.toLowerCase(ch);
        if (testChar.toString().matches("[aeiou]")) {
            isAVowel = true;
        }
        return isAVowel;
    }
    public String replaceVowels(String phrase, char ch) {
        //Return a String that is phrase with all the vowels (upper and lower) replaced by ch
        StringBuilder newPhrase = new StringBuilder(phrase);
        for (int index=0; index < phrase.length(); index++) {
            if (isVowel(phrase.charAt(index))) {
                newPhrase.setCharAt(index,ch);
            }
        }
        return newPhrase.toString();
    }
    public String emphasize(String phrase, Character ch) {
        //Return a String that is the phrase but with ch (upper or lower) replaced by
        //'*' if it is in an odd numbered location (NOT INDEX) in the String
        //'+' if it is an even numbered location (NOT INDEX) in the String
        //Example: emphasize("dna ctgaaactga",'a') would return "dn* ctg+*+ctg+"
        //Example: emphasize("Mary Bella Abracadabra",'a') would return "M+ry Bell+ +br*c*d*br+"
        return phrase;
    }
}