package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRserviceTest {
    @Test
    public void calculateTest() {
        SQRservice service = new SQRservice();

        int actual = service.calc(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate1Test() {
        SQRservice service = new SQRservice();

        int actual = service.calc(-100, 99);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate2Test() {
        SQRservice service = new SQRservice();

        int actual = service.calc(10000, 10001);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate3Test() {
        SQRservice service = new SQRservice();

        int actual = service.calc(9800, 9802);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate4Test() {
        SQRservice service = new SQRservice();

        int actual = service.calc(99, 102);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}