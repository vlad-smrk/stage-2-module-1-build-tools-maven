package com.epam.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String string : args) {
            if (!StringUtils.isNumeric(string) || Integer.parseInt(string) <= 0) {
                return false;
            }
        }
        return true;
    }
}