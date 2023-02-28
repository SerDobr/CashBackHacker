package ru.netology.cashBackHacker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldCashback900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);


    }

    @Test
    void shouldCashback100() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(100);
        assertEquals(expected, actual);


    }

}