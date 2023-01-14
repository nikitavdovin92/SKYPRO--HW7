public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        //Задача 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        //Задача 3
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //Задача 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        //Задача с високосним годом
        System.out.println("Задание с високосным годом");
        for (int i = 2020; i < 2070; i = i + 4){
            System.out.println("Високосный год " + i);
        }
        //Задача 5
        System.out.println("Задание 5");
        for (int i = 1904; i < 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }
        //Задача 6
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //Задача 7
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задача с зарплатой
        System.out.println("Задание с зарплатой тестовое");
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
            System.out.println(total);
        }
    }

}