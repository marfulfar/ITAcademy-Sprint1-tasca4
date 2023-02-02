package org.example;

import months.Month;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> months = new ArrayList<>();
        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");

        Month m = new Month();

        m.countMonths(months);
        m.isNotNull(months);
        m.augustIsEight(months);

    }//closes main




}//closes class