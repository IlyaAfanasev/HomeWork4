public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("            Задача 1");
        int age1 = 23;
        int age2 = 16;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний");
        }
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("            Задача 2");
        int temperature1 = 2;
        int temperature2 = 7;
        if (temperature1 >= 5) {
            System.out.println("На улице " + temperature1 + " градусов,можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature1 + " градусов,нужно надеть шапку");
        }
        if (temperature2 >= 5) {
            System.out.println("На улице " + temperature2 + " градусов,можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature2 + " градусов,нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("            Задача 3");
        int speed1 = 70;
        int speed2 = 50;

        if (speed1 >= 60) {
            System.out.println("Если скорость " + speed1 + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed1 + " км/ч, то можно ездить спокойно.");
        }
        if (speed2 >= 60) {
            System.out.println("Если скорость " + speed2 + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed2 + " км/ч, то можно ездить спокойно.");
        }
    }
}

