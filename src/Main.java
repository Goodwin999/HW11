public class Main {

    public static void checksForLeapYear(int leapYear) {
        System.out.println(leapYear + " год - високосный год");
    }

    public static void checksForNonleapYears(int nonLeapYear) {
        System.out.println(nonLeapYear + " год - не високосный год");
    }


    public static void main(String[] args) {
        System.out.println("Home work 11");

        System.out.println("Task1");
        int year = 2021;
        boolean leapYear = (year > 1584 && ((year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0)));
        if (leapYear) {
            checksForLeapYear(year);
        } else {
            checksForNonleapYears(year);
        }





    }
}
