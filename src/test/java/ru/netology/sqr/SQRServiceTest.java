package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcExactWithNegativeValue() {

        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSqrt(-200, 300);

        Assertions.assertEquals(expected, actual);

    }
}
