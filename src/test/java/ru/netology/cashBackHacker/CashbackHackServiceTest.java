package ru.netology.cashBackHacker;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


class CashbackHackServiceTest {

    @Test
    void shouldCashback900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);


    }

    @Test
    void shouldCashback100() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(100);
        assertEquals(actual, expected);


    }

    @Test
    void shouldCashback1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1001);
        assertEquals(actual, expected);


    }
}