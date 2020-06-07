package ru.job4j.calculator;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {

        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
        int a1 = 0;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected1 = 3;
        int rsl1 = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
        int a2 = 1;
        int b2 = 1;
        int c2 = 0;
        int x2 = 1;
        int expected2 = 3;
        int rs2l = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
        int a3 = 1;
        int b3 = 1;
        int c3 = 1;
        int x3 = 0;
        int expected3 = 3;
        int rsl3 = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }
}