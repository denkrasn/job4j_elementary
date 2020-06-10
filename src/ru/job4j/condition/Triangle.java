package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        if (ac + bc > ab && ab + bc > ac && ab + ac > bc) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(3, 6, 8);
        System.out.println(result);
        boolean result2 = Triangle.exist(3, 5, 8);
        System.out.println(result);
    }
}