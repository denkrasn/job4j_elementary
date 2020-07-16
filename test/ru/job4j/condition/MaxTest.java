package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void max() {
        int result = Max.max(999, 666);
        assertThat(result, is(999));
    }

    @Test
    public void whenMaxThird() {
        int result = Max.max(666, 999, 333);
        assertThat(result, is(999));
    }

    @Test
    public void whenMaxSecond() {
        int result = Max.max(999, 444, 222, 777);
        assertThat(result, is(999));
    }
}