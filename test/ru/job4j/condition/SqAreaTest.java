package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenp4k1s1() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double out = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.1);
    }
}