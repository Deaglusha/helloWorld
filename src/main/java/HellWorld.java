package main.java;

import java.time.LocalDate;

public class HellWorld {
    public static void main(String[] args) {
        HellWorld hellWorld = new HellWorld();
        System.out.println("hellWorld.notToday(\"2012-11-25\") = " + hellWorld.notToday("2022-05-22"));
    }

    public boolean notToday(String date) {
        /*if//Alternative
          (!LocalDate.now().toString().equals(date)) {
            return true;
        } else {
            return false;
        }*/

        return !date.equals(LocalDate.now().toString());
    }
}
