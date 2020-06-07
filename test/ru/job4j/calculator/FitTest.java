package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 190;
        double expected = 103.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void womanWeight() {
        short in = 165;
        double expected = 74.75;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}