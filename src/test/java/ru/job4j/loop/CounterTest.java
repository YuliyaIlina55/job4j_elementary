package ru.job4j.loop;

        import org.junit.Assert;
        import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumFromFourToTwelveThenSeventyTwo() {
        int start = 4;
        int finish = 12;
        int result = Counter.sum(start, finish);
        int expected = 72;
        Assert.assertEquals(expected, result);
    }
}