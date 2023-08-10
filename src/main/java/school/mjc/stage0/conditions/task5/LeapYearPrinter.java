package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }

        switch (isLeap ? "leap" : "not leap") {
            case "leap":
                System.out.println("leap");
                break;
            case "not leap":
                System.out.println("not leap");
                break;
        }
    }
}
