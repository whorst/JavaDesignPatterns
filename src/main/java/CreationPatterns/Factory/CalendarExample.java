package CreationPatterns.Factory;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
    public static void calendarExample(){
        //getInstance is considered usage of FactoryPattern
        Calendar cal = Calendar.getInstance();

        //The Gregorian calendar type gets printed below
        System.out.println(cal);

        //The same method returns a different type, hence it is a factory, opposite of singleton
        Calendar calTwo = Calendar.getInstance(TimeZone.getTimeZone("EST"));
        System.out.println(calTwo);
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
