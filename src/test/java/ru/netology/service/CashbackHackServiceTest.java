package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateRemainUnderBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainOverBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainEqualsBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}