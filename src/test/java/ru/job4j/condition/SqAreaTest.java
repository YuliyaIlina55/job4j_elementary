package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2then2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K3then6dot75() {
        int p = 12;
        double k = 3;
        double expected = 6.75;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP25K4then24dot09() {
        int p = 25;
        double k = 4.25;
        double expected = 24.09;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}