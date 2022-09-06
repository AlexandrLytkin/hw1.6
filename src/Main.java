public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task9() {
        System.out.println("Задание3.2");
        int saveMoney = 29_000;
        int depositionBank = 0;
        for (int i = 1 ; i <= 12; i = i + 1) {
             depositionBank = depositionBank + depositionBank / 100;
             depositionBank = depositionBank + saveMoney;
            System.out.println("Месяц "+ i +" сумма накоплений равна " +depositionBank + " рублей");
        }
    }
    public static void task8() {
        System.out.println("Задание3.1");
        int saveMoney = 29_000;
        for (int i = 1 ; i <= 12; i = i + 1) {
            System.out.println("Месяц "+i+" сумма накоплений равна "+saveMoney * i +" рублей");
        }
    }
    public static void task7() {
        System.out.println("Задание2.4");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задание2.3");
        for (int i = 7; i <=98; i = i + 7) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задание2.2");
        for (int i = 1904; i <=2096; i = i + 4) {
            System.out.println(i+ " год является високосным");
        }
    }
    public static void task4() {
        System.out.println("Задание2.1");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }
    public static void task3() {
        System.out.println("Задание1.3");
        for (int i = 0; i <=17; i = i +2) {
            System.out.println(i);
        }
    }
    public static void task2() {
        System.out.println("Задание1.2");
        for (int i = 10; i >=1; i = i - 1) {
            System.out.println(i);
        }
    }
    public static void task1() {
        System.out.println("Задание1.1");
        for (int i = 0; i <=10; i++) {
            System.out.println(i);
        }
    }
}
