package com.example.firstSpring;

import java.util.Calendar;

public class YoilTeller {
    public static void main(String[] args) {
        String year = args[0];
        String month = args[1];
        String day = args[2];
        
        int yyyy = Integer.parseInt(year);
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);

        Calendar cal = Calendar.getInstance();
        cal.set(yyyy,mm-1,dd);
        
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        char yoil = " 일월화수목금토".charAt(dayOfWeek);

        System.out.println(year+"년 "+month+"월 "+day+"일 ");
        System.out.println(yoil+"요일입니다");
    }
}
