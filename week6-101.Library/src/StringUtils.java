/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        //Checks if the string searched is contained within the string word
        //String result = searched.trim();
        String upperCasedWord = word.replaceAll("\\s+", "").toUpperCase();
        String upperCasedSearched = searched.replaceAll("\\s+", "").toUpperCase();
        return upperCasedWord.contains(upperCasedSearched);
    }

}
