package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when44to24then2() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 2;
        int y2 = 4;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to16then2dot82() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 1;
        int y2 = 6;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to38then7dot61() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 3;
        int y2 = 8;
        double expected = 7.61;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}