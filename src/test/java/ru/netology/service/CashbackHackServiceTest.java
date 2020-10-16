package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldCalculateRemainUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(800);
        int expected = 200;

        assertEquals(expected, actual);
    }


}