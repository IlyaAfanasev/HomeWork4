public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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
    public static void task4() {
        System.out.println("            Задача 4");
        int age1 = 5;
        int age2 = 12;
        int age3 = 19;
        int age4 = 27;
        boolean nursery = age1 >= 2 && age1 <= 6;
        boolean school = age1 >= 7 && age1 < 18;
        boolean university = age1 >= 18 && age1 < 24;

        if (nursery) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        }
          else if (school) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
            else if (university) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        }
        else  {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }

        boolean nursery2 = age2 >= 2 && age2 <= 6;
        boolean school2 = age2 >= 7 && age2 < 18;
        boolean university2 = age2 >= 18 && age2 < 24;

        if (nursery2) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        else if (school2) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        else if (university2) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        }
        else  {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }
        boolean nursery3 = age3 >= 2 && age3 <= 6;
        boolean school3 = age3 >= 7 && age3 < 18;
        boolean university3 = age3 >= 18 && age3 < 24;

        if (nursery3) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        }
        else if (school3) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        }
        else if (university3) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет");
        }
        else  {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить на работу");
        }
        boolean nursery4 = age4 >= 2 && age4 <= 6;
        boolean school4 = age4 >= 7 && age4 < 18;
        boolean university4 = age4 >= 18 && age4 < 24;

        if (nursery4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        }
        else if (school4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        }
        else if (university4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        }
        else  {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        }
    }
}

