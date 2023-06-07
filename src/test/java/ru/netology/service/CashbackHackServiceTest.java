package ru.netology.service;

import org.junit.Before;

public class CashbackHackServiceTest {
    private CashbackHackService service;

    @Before
    public void service() {
        service = new CashbackHackService();
    }

    @org.junit.Test
    public void shouldCalculateAmountLessBoundary() {

        int expected = 100;
        int actual = service.remain(900);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateAmountMoreBoundary() {

        int expected = 999;
        int actual = service.remain(1001);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateAmountEqualBoundary() {

        int expected = 0;
        int actual = service.remain(1000);
        org.junit.Assert.assertEquals(expected, actual);
    }
}