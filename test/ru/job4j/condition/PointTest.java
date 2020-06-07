package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 3;
        int y2 = 9;
        double expected = 3.16;
        double out = Point.distance(2, 6, 3, 9);
        Assert.assertEquals(expected, out, 0.01);

    }
}