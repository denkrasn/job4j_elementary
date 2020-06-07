package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double out = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.1);
    }
}