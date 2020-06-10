package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void maxFirst() {
        int result = MultiMax.max(20, 10, 15);
        assertThat(result, is(20));
    }
    @Test
    public void maxSecond() {
        int result = MultiMax.max(5, 20, 15);
        assertThat(result, is(20));
    }
    @Test
    public void maxThird() {
        int result = MultiMax.max(5, 10, 15);
        assertThat(result, is(15));
    }
    @Test
    public void maxAll() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }

}