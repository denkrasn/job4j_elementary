package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void exist() {
        boolean result = Triangle.exist(3.0, 6.0, 8.0);
        assertThat(result, is(true));

    }

    @Test
    public void testExist() {
        boolean result2 = Triangle.exist(3.0, 5.0, 8.0);
        assertThat(result2, is(false));
    }
}