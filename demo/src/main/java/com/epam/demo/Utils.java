package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String string : args) {
            if (Integer.parseInt(string) <= 0) {
                return false;
            }
        }
        return true;
    }
}