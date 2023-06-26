package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        Assert.assertEquals(0, cashbackHackService.remain(amount));
    }

    @Test
    public void testRemainWithCashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        Assert.assertEquals(100, cashbackHackService.remain(amount));
    }

}