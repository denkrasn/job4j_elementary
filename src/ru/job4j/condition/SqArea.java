package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int l, h;
        h = p / (2 * (k + 1));
        l = h * k;
        double rsl = l * h;

        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
