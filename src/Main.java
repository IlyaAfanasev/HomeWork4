public class Main {
    public static void main(String[] args) {
        task1();

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
}

