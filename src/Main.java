public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void checkForLeapYear(int year1) {
        boolean leapYear = year1 > 1584 && year1 % 4 == 0 || year1 % 400 == 0;
        if (leapYear) {
            System.out.println("Год " + year1 + " - високосный год");
        } else {
            System.out.println("Год " + year1 + " - не високосный год");
        }
    }

    public static void task1() {
        System.out.println("Task1");

        int year = 2021;

        checkForLeapYear(year);

    }
}
