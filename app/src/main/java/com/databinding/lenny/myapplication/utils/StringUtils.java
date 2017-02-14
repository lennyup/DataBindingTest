package com.databinding.lenny.myapplication.utils;

/**
 * Created by lenny on 2017/2/14.
 */

public class StringUtils {

    public static String capitalize(String word) {
        if (word.length() >1) {
            return  String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }

}
