public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

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
        } else if (school) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (university) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }

        boolean nursery2 = age2 >= 2 && age2 <= 6;
        boolean school2 = age2 >= 7 && age2 < 18;
        boolean university2 = age2 >= 18 && age2 < 24;

        if (nursery2) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        } else if (school2) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        } else if (university2) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }
        boolean nursery3 = age3 >= 2 && age3 <= 6;
        boolean school3 = age3 >= 7 && age3 < 18;
        boolean university3 = age3 >= 18 && age3 < 24;

        if (nursery3) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        } else if (school3) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        } else if (university3) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить на работу");
        }
        boolean nursery4 = age4 >= 2 && age4 <= 6;
        boolean school4 = age4 >= 7 && age4 < 18;
        boolean university4 = age4 >= 18 && age4 < 24;

        if (nursery4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        } else if (school4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        } else if (university4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("            Задача 5");
        int age1 = 4;
        boolean thereIsAnAdult1 = true;
        int age2 = 12;
        boolean thereIsAnAdult2 = true;
        int age3 = 13;
        boolean thereIsAnAdult3 = false;
        int age4 = 16;
        boolean thereIsAnAdult4 = true;

        boolean canRide1 = age1 >= 14;
        boolean withoutAdult1 = age1 >= 5 && age1 <14;
        boolean canRideWithAdult1 = age1 >=5 && age1 < 14 && thereIsAnAdult1;

        boolean canRide2 = age2 >= 14;
        boolean withoutAdult2 = age2 >= 5 && age2 <14;
        boolean canRideWithAdult2 = age2 >=5 && age2 < 14 && thereIsAnAdult2;

        boolean canRide3 = age3 >= 14;
        boolean withoutAdult3 = age3 >= 5 && age3 <14;
        boolean canRideWithAdult3 = age3 >=5 && age3 < 14 && thereIsAnAdult3;

        boolean canRide4 = age4 >= 14;
        boolean withoutAdult4 = age4 >= 5 && age4 <14;
        boolean canRideWithAdult4 = age4 >=5 && age4 < 14 && thereIsAnAdult4;

        if (canRide1) {
            System.out.println("Если возраст ребенка равен " +age1+ ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else if (canRideWithAdult1) {
            System.out.println("Если возраст ребенка равен " +age1+ ", то ему можно кататься на аттракционе в сопровождении");
                    }
        else if (withoutAdult1){
            System.out.println("Если возраст ребенка равен " +age1+ ", то ему нельзя кататься на аттракционе без сопровождения");
        }
        else {
            System.out.println("Если возраст ребенка равен " +age1+ ", то ему нельзя кататься на аттракционе");
        }

        if (canRide2) {
            System.out.println("Если возраст ребенка равен " +age2+ ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else if (canRideWithAdult2) {
            System.out.println("Если возраст ребенка равен " +age2+ ", то ему можно кататься на аттракционе в сопровождении");
        }
        else if (withoutAdult2){
            System.out.println("Если возраст ребенка равен " +age2+ ", то ему нельзя кататься на аттракционе без сопровождения");
        }
        else {
            System.out.println("Если возраст ребенка равен " +age2+ ", то ему нельзя кататься на аттракционе");
        }

        if (canRide3) {
            System.out.println("Если возраст ребенка равен " +age3+ ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else if (canRideWithAdult3) {
            System.out.println("Если возраст ребенка равен " +age3+ ", то ему можно кататься на аттракционе в сопровождении");
        }
        else if (withoutAdult3){
            System.out.println("Если возраст ребенка равен " +age3+ ", то ему нельзя кататься на аттракционе без сопровождения");
        }
        else {
            System.out.println("Если возраст ребенка равен " +age3+ ", то ему нельзя кататься на аттракционе");
        }
        if (canRide4) {
            System.out.println("Если возраст ребенка равен " +age4+ ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else if (canRideWithAdult4) {
            System.out.println("Если возраст ребенка равен " +age4+ ", то ему можно кататься на аттракционе в сопровождении");
        }
        else if (withoutAdult4){
            System.out.println("Если возраст ребенка равен " +age4+ ", то ему нельзя кататься на аттракционе без сопровождения");
        }
        else {
            System.out.println("Если возраст ребенка равен " +age4+ ", то ему нельзя кататься на аттракционе");
        }

    }
}

