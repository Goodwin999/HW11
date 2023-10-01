public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

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

    public static void determineOperatingSystem(int clientOs, int clientYear) {
        if (clientOs == 0 && clientYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientYear >= 2015 && clientOs == 0) {
            System.out.println("Установите приложение для iOS по ссылке ");
        } else if (clientOs == 1 && clientYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке» ");
        } else if (clientYear >= 2015 && clientOs == 1) {
            System.out.println("Установите приложение для Android ");
        } else {
            System.out.println("Купите телефон ");
        }
    }

    public static void task2() {
        System.out.println("Task2");
        int clientOs = 0;
        int clientYear = 2015;
        determineOperatingSystem(clientOs, clientYear);
    }

    public static int determineDeliveryTime(int deliveryDistance1) {

        if (deliveryDistance1 < 20) {
            System.out.println("Потребуется одни сутки ");
        } else if (deliveryDistance1 > 20 && deliveryDistance1 < 60) {
            System.out.println("Потребуется двое суток");
        } else if (deliveryDistance1 > 60 && deliveryDistance1 < 100) {
            System.out.println("Потребуется трое суток");
        } else {
            System.out.println("Доставки нет");
        }
        return deliveryDistance1;
    }

    public static void task3() {
        System.out.println("Task3");
        int deliveryDistance = 95;
        determineDeliveryTime(deliveryDistance);
    }


}
