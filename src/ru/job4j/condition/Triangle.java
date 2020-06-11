package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ac + bc > ab && ab + bc > ac && ab + ac > bc;

    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(1, 2, 3);
        System.out.println(result);
        boolean result2 = Triangle.exist(2, 3, 4);
        System.out.println(result2);
    }
}