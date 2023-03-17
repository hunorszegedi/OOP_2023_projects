package oop.labor05.model;

import oop.labor02.DateUtil;

public class MyDateLabor5 {
    private int year;
    private int month;
    private int day;

    public MyDateLabor5(int pYear, int pMonth, int pDay) {
        if (DateUtil.isValidDate(pYear, pMonth, pDay)) {
            year = pYear;
            month = pMonth;
            day = pDay;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    //mindent

    @Override
    public String toString() {
        return
                "\nyear: " + year +
                " month: " + month +
                " day: " + day +
                "\n";
    }
}