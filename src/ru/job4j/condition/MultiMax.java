package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int firstAndSecond = first >= second ? first : second;
        int result = firstAndSecond >= third ? firstAndSecond : third;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(20, 10, 15));
        System.out.println(max(5, 20, 15));
        System.out.println(max(5, 10, 15));
        System.out.println(max(5, 5, 5));
    }
}





