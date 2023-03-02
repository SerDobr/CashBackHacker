package ru.netology.cashBackHacker;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCashback900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);


    }

    @Test
    public void shouldCashback100() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(100);
        assertEquals(actual, expected);


    }

    @Test
    public void shouldCashback1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(5001);
        assertEquals(actual, expected);


    }

    @Test
    public void shouldCashback1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);


    }
}