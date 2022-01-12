package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldUnderRemain() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }

    @Test
    public void shouldOverRemain() {
        int amount = 1200;
        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }

    @Test
    public void shouldRemain() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainNull() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}