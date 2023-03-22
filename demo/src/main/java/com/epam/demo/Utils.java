package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String string : args) {
            if (NumberUtils.toDouble(string) <= 0) {
                return false;
            }
        }
        return true;
    }
}