public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

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
        int age5 = 1;

        boolean nursery = age1 >= 2 && age1 <= 6;
        boolean school = age1 >= 7 && age1 < 18;
        boolean university = age1 >= 18 && age1 < 24;


        if (age1 < 2) {
            System.out.println("Если возраст человека равен " + age1 + " то он еще маленький");
        } else if (nursery) {
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

        if (age2 < 2) {
            System.out.println("Если возраст человека равен " + age2 + " то он еще маленький");
        } else if (nursery2) {
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

        if (age3 < 2) {
            System.out.println("Если возраст человека равен " + age3 + " то он еще маленький");
        } else if (nursery3) {
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

        if (age4 < 2) {
            System.out.println("Если возраст человека равен " + age4 + " то он еще маленький");
        } else if (nursery4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        } else if (school4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        } else if (university4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        }

        boolean nursery5 = age5 >= 2 && age5 <= 6;
        boolean school5 = age5 >= 7 && age5 < 18;
        boolean university5 = age5 >= 18 && age5 < 24;

        if (age5 < 2) {
            System.out.println("Если возраст человека равен " + age5 + " то он еще маленький");
        } else if (nursery5) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в детский сад");
        } else if (school4) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");
        } else if (university5) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");
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
        boolean withoutAdult1 = age1 >= 5 && age1 < 14;
        boolean canRideWithAdult1 = age1 >= 5 && age1 < 14 && thereIsAnAdult1;

        boolean canRide2 = age2 >= 14;
        boolean withoutAdult2 = age2 >= 5 && age2 < 14;
        boolean canRideWithAdult2 = age2 >= 5 && age2 < 14 && thereIsAnAdult2;

        boolean canRide3 = age3 >= 14;
        boolean withoutAdult3 = age3 >= 5 && age3 < 14;
        boolean canRideWithAdult3 = age3 >= 5 && age3 < 14 && thereIsAnAdult3;

        boolean canRide4 = age4 >= 14;
        boolean withoutAdult4 = age4 >= 5 && age4 < 14;
        boolean canRideWithAdult4 = age4 >= 5 && age4 < 14 && thereIsAnAdult4;

        if (canRide1) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else if (canRideWithAdult1) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на аттракционе в сопровождении");
        } else if (withoutAdult1) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему нельзя кататься на аттракционе без сопровождения");
        } else {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему нельзя кататься на аттракционе");
        }

        if (canRide2) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else if (canRideWithAdult2) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении");
        } else if (withoutAdult2) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе без сопровождения");
        } else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        }

        if (canRide3) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else if (canRideWithAdult3) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении");
        } else if (withoutAdult3) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе без сопровождения");
        } else {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        }
        if (canRide4) {
            System.out.println("Если возраст ребенка равен " + age4 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else if (canRideWithAdult4) {
            System.out.println("Если возраст ребенка равен " + age4 + ", то ему можно кататься на аттракционе в сопровождении");
        } else if (withoutAdult4) {
            System.out.println("Если возраст ребенка равен " + age4 + ", то ему нельзя кататься на аттракционе без сопровождения");
        } else {
            System.out.println("Если возраст ребенка равен " + age4 + ", то ему нельзя кататься на аттракционе");
        }
    }

    public static void task6() {
        System.out.println("          Задача 6");
        int peopleInTheWagon1 = 76;
        int peopleInTheWagon2 = 102;
        int peopleInTheWagon3 = 32;
        int fullWagon = 102;
        int saeting = 60;

        boolean thereAreSeats1 = peopleInTheWagon1 < saeting;
        boolean thereAreStandingPlaces1 = peopleInTheWagon1 >= 60 && peopleInTheWagon1 < 102;

        boolean thereAreSeats2 = peopleInTheWagon2 < saeting;
        boolean thereAreStandingPlaces2 = peopleInTheWagon2 >= 60 && peopleInTheWagon2 < 102;

        boolean thereAreSeats3 = peopleInTheWagon3 < saeting;
        boolean thereAreStandingPlaces3 = peopleInTheWagon3 >= 60 && peopleInTheWagon3 < 102;

        if (thereAreSeats1) {
            System.out.println("Если в вагоне " + peopleInTheWagon1 +
                    " людей, то осталось " + (saeting - peopleInTheWagon1) + " сидячих мест и " + (fullWagon - saeting) + " стоячих иест");
        }
        else if (thereAreStandingPlaces1) {
            System.out.println("Если в вагоне " + peopleInTheWagon1 + " людей, то осталось " + (fullWagon - peopleInTheWagon1) + " стоячих мест");
        }
        else {
            System.out.println("В вагоне мест нет");
        }

        if (thereAreSeats2) {
            System.out.println("Если в вагоне " + peopleInTheWagon2 +
                    " людей, то осталось " + (saeting - peopleInTheWagon2) + " сидячих мест и " + (fullWagon - saeting) + " стоячих иест");
        }
        else if (thereAreStandingPlaces2) {
            System.out.println("Если в вагоне " + peopleInTheWagon2 + " людей, то осталось " + (fullWagon - peopleInTheWagon2) + " стоячих мест");
        }
        else {
            System.out.println("В вагоне мест нет");
        }
        if (thereAreSeats3) {
            System.out.println("Если в вагоне " + peopleInTheWagon3 +
                    " людей, то осталось " + (saeting - peopleInTheWagon3) + " сидячих мест и " + (fullWagon - saeting) + " стоячих иест");
        }
        else if (thereAreStandingPlaces3) {
            System.out.println("Если в вагоне " + peopleInTheWagon3 + " людей, то осталось " + (fullWagon - peopleInTheWagon3) + " стоячих мест");
        }
        else {
            System.out.println("В вагоне мест нет");
        }
    }

    public static void task7() {
            System.out.println("          Задача 7.1");

            int one = 170;
            int two = 120;
            int three = 120;

            if (one == two && one == three) {
                System.out.println("Все числа равны " + one);
            }
            else if (one >= two && one >= three) {
                if (one == two || one == three) {
                    if (one == two) {
                        System.out.println("Самые большие  числа 1 и 2 равны " + one + " и равны между собой, число значением меньше " + three);
                    } else{
                        System.out.println("Самые большие  числа 1 и 3 равны " + one + " и равны между собой, число значением меньше " + two);
                    }
                }
                else if (two > three) {
                    System.out.println("Самое большее число " + one + " второе по старшенству число " + two + " самое маленькое число " +three);
                }
                else if (three > two) {
                    System.out.println("Самое большее число " + one + " второе по старшенству число " + three + " самое маленькое число " + two);
                }
                else {
                    System.out.println("Самое большее число " + one + " числа 2 и 3 равны между собой и равны " + two);
                }
            }
            else if (two >= one && two >= three) {
                if (one == two || two == three) {
                    if (one == two) {
                        System.out.println("Самые большие  числа 1 и 2 равны " + one + " и равны между собой, число значением меньше " + three);
                    } else{
                        System.out.println("Самые большие  числа 2 и 3 равны " + two + " и равны между собой, число значением меньше " + one);
                    }
                }
                else if (one > three) {
                    System.out.println("Самое большее число " + two + " второе по старшенству число " + one + " самое маленькое число " +three);
                }
                else if (three > one) {
                    System.out.println("Самое большее число " + two + " второе по старшенству число " + three + " самое маленькое число " + one);
                }
                else {
                    System.out.println("Самое большее число " + two + " числа 1 и 3 равны между собой и равны " + one);
                }
            }
            else if (three >= one && three >= two) {
                if (one == three || two == three) {
                    if (three == one) {
                        System.out.println("Самые большие  числа 1 и 3 равны " + one + " и равны между собой, число значением меньше " + two);
                    } else{
                        System.out.println("Самые большие  числа 2 и 3 равны " + two + " и равны между собой, число значением меньше " + one);
                    }
                }
                else if (one > two) {
                    System.out.println("Самое большее число " + three + " второе по старшенству число " + one + " самое маленькое число " +two);
                }
                else if (two > one) {
                    System.out.println("Самое большее число " + three + " второе по старшенству число " + two + " самое маленькое число " + one);
                }
                else {
                    System.out.println("Самое большее число " + three + " числа 1 и 2 равны между собой и равны " + one);
                }
            }
        System.out.println("      Задача 7.2");
            if (one >= two && one >=three&&one != two || one >= two && one >=three&&one != three ) {
                System.out.println("Максимально число " +one);
            }
            else if (two >= one && two >=three&&one != two || two != three&&two >= one && two >=three) {
                System.out.println("Максимально число " + two);
            }
            else if ( three!= one || three != two) {
                System.out.println("Максимально число " + three);
            }
            else {
                System.out.println("Все числа равны");
            }

    }//task 7

}

