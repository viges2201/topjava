package ru.javawebinar.topjava.util;

import java.time.LocalDate;
import java.util.Map;

public class CaloriesUtil {
    public static boolean isExceed(Map<LocalDate, Integer> collect, int calories, LocalDate localDate) {
        if (collect.containsKey(localDate)) {
            if (collect.get(localDate) > calories) return true;
        }
        return false;
    }
}
