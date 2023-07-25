package ru.netology.service;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldCalculateAmountLessBoundary(){
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldCalculateAmountMoreBoundary(){
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldCalculateAmountEqualsBoundary(){
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        org.testng.Assert.assertEquals(actual, expected);
    }
}