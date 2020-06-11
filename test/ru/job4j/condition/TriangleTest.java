package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void exist() {
        boolean result = Triangle.exist(1, 2, 3);
        assertThat(result, is(false));

    }

    @Test
    public void testExist() {
        boolean result2 = Triangle.exist(2, 3, 4);
        assertThat(result2, is(true));
    }
}